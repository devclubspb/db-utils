package ru.spb.devclub.utils.db;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>AwareRowMapper class.</p>
 *
 * @author Grig Alex
 * @version 0.3.0
 * @since 0.3.0
 */
public class AwareRowMapper<T> implements ExtendedRowMapper<T> {
    protected final Class<T> clazz;
    protected final Map<Class<?>, AwareRowMapper<?>> mappers;
    protected final Map<String, String> fieldToColumn;
    protected final Map<String, ExtendedRowMapper<Object>> fieldToValue;

    /**
     * <p>Constructor for AwareRowMapper.</p>
     *
     * @param clazz a {@link java.lang.Class} object.
     */
    public AwareRowMapper(Class<T> clazz) {
        this(clazz, new HashMap<>());
    }

    /**
     * <p>Constructor for AwareRowMapper.</p>
     *
     * @param clazz   a {@link java.lang.Class} object.
     * @param mappers a {@link java.util.Map} object.
     */
    public AwareRowMapper(Class<T> clazz, Map<Class<?>, AwareRowMapper<?>> mappers) {
        this.clazz = clazz;
        this.mappers = mappers;
        this.fieldToColumn = new HashMap<>();
        this.fieldToValue = new HashMap<>();
    }

    /**
     * <p>Constructor for AwareRowMapper.</p>
     *
     * @param other a {@link ru.spb.devclub.utils.db.AwareRowMapper} object.
     */
    protected AwareRowMapper(AwareRowMapper<T> other) {
        this.clazz = other.clazz;
        this.mappers = new HashMap<>(other.mappers);
        this.fieldToColumn = new HashMap<>(other.fieldToColumn);
        this.fieldToValue = new HashMap<>(other.fieldToValue);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public T mapRow(ExtendedResultSet rs, int rowNum) throws SQLException {
        T result = getResultInstance();
        Field[] fields = getFields();
        for (Field field : fields) {
            String fieldName = field.getName();
            Method method = getMethod(field);
            if (fieldToValue.containsKey(fieldName)) {
                Object value = fieldToValue.get(fieldName).mapRow(rs, rowNum);
                invokeMethod(method, result, value);
                continue;
            }
            String columnName = getColumnNameByFieldName(field.getName());
            Class<?> fieldType = getFieldType(field);
            if (fieldType.isPrimitive()) {
                if (int.class.equals(fieldType)) {
                    invokeMethod(method, result, rs.getInt(columnName));
                } else if (long.class.equals(fieldType)) {
                    invokeMethod(method, result, rs.getLong(columnName));
                } else if (double.class.equals(fieldType)) {
                    invokeMethod(method, result, rs.getDouble(columnName));
                } else if (boolean.class.equals(fieldType)) {
                    invokeMethod(method, result, rs.getBoolean(columnName));
                } else if (float.class.equals(fieldType)) {
                    invokeMethod(method, result, rs.getFloat(columnName));
                } else if (short.class.equals(fieldType)) {
                    invokeMethod(method, result, rs.getShort(columnName));
                } else if (byte.class.equals(fieldType)) {
                    invokeMethod(method, result, rs.getByte(columnName));
                } else if (char.class.equals(fieldType)) {
                    String value = rs.getString(columnName);
                    if (value != null) {
                        invokeMethod(method, result, value.charAt(0));
                    }
                }
            } else {
                if (String.class.equals(fieldType)) {
                    invokeMethod(method, result, rs.getString(columnName));
                } else if (Integer.class.equals(fieldType)) {
                    invokeMethod(method, result, rs.getIntOrNull(columnName));
                } else if (Long.class.equals(fieldType)) {
                    invokeMethod(method, result, rs.getLongOrNull(columnName));
                } else if (Double.class.equals(fieldType)) {
                    invokeMethod(method, result, rs.getDoubleOrNull(columnName));
                } else if (Boolean.class.equals(fieldType)) {
                    invokeMethod(method, result, rs.getBooleanOrNull(columnName));
                } else if (Float.class.equals(fieldType)) {
                    invokeMethod(method, result, rs.getFloatOrNull(columnName));
                } else if (Short.class.equals(fieldType)) {
                    invokeMethod(method, result, rs.getShortOrNull(columnName));
                } else if (Byte.class.equals(fieldType)) {
                    invokeMethod(method, result, rs.getByteOrNull(columnName));
                } else {
                    AwareRowMapper<?> awareRowMapper = mappers.get(fieldType);
                    if (awareRowMapper != null) {
                        invokeMethod(method, result, awareRowMapper.mapRow(rs, rowNum));
                    }
                }
            }
        }
        return result;
    }

    /**
     * <p>getResultInstance.</p>
     *
     * @return a T object.
     * @throws ru.spb.devclub.utils.db.AwareRowMapperException if any.
     */
    protected T getResultInstance() throws AwareRowMapperException {
        try {
            return clazz.getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new AwareRowMapperException("Exception to create a new instance of the class: \"" +
                    clazz.getName() + "\".", e);
        }
    }

    /**
     * <p>getFields.</p>
     *
     * @return an array of {@link java.lang.reflect.Field} objects.
     */
    protected Field[] getFields() {
        return clazz.getDeclaredFields();
    }

    /**
     * <p>getColumnNameByFieldName.</p>
     *
     * @param fieldName a {@link java.lang.String} object.
     * @return a {@link java.lang.String} object.
     */
    protected String getColumnNameByFieldName(String fieldName) {
        if (fieldToColumn.containsKey(fieldName)) {
            return fieldToColumn.get(fieldName);
        }
        StringBuilder builder = new StringBuilder();
        for (char ch : fieldName.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                builder.append("_").append(ch);
            } else {
                builder.append(Character.toUpperCase(ch));
            }
        }
        return builder.toString();
    }

    /**
     * <p>getMethod.</p>
     *
     * @param field a {@link java.lang.reflect.Field} object.
     * @return a {@link java.lang.reflect.Method} object.
     * @throws ru.spb.devclub.utils.db.AwareRowMapperException if any.
     */
    protected Method getMethod(Field field) throws AwareRowMapperException {
        try {
            return clazz.getMethod(getMethodName(field), getFieldType(field));
        } catch (NoSuchMethodException e) {
            throw new AwareRowMapperException("Exception to get a method of the class: \"" +
                    clazz.getName() + "\", for the field: \" +" +
                    field + "\", by the method name: \"" +
                    getMethodName(field) + "\" and the type: \"" +
                    getFieldType(field).getName() + "\".", e);
        }
    }

    /**
     * <p>getMethodName.</p>
     *
     * @param field a {@link java.lang.reflect.Field} object.
     * @return a {@link java.lang.String} object.
     */
    protected String getMethodName(Field field) {
        String fieldName = field.getName();
        return "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
    }

    /**
     * <p>getFieldType.</p>
     *
     * @param field a {@link java.lang.reflect.Field} object.
     * @return a {@link java.lang.Class} object.
     */
    protected Class<?> getFieldType(Field field) {
        return field.getType();
    }

    /**
     * <p>invokeMethod.</p>
     *
     * @param method a {@link java.lang.reflect.Method} object.
     * @param result a T object.
     * @param values a {@link java.lang.Object} object.
     * @throws ru.spb.devclub.utils.db.AwareRowMapperException if any.
     */
    protected void invokeMethod(Method method, T result, Object... values) throws AwareRowMapperException {
        try {
            method.invoke(result, values);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AwareRowMapperException("Exception to invoke the method: \"" +
                    method + "\", for the result: \"" +
                    result + "\", with values: \"" +
                    Arrays.toString(values) + "\".", e);
        }
    }

    /**
     * <p>prefix.</p>
     *
     * @param prefix a {@link java.lang.String} object.
     * @return a {@link ru.spb.devclub.utils.db.AwareRowMapper} object.
     */
    public AwareRowMapper<T> prefix(String prefix) {
        return new AwareRowMapper<T>(this) {
            @Override
            protected String getColumnNameByFieldName(String fieldName) {
                return prefix + "." + super.getColumnNameByFieldName(fieldName);
            }
        };
    }

    /**
     * <p>fieldToColumn.</p>
     *
     * @param fieldName  a {@link java.lang.String} object.
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link ru.spb.devclub.utils.db.AwareRowMapper} object.
     * @throws ru.spb.devclub.utils.db.AwareRowMapperException if any.
     */
    public AwareRowMapper<T> fieldToColumn(String fieldName, String columnName) throws AwareRowMapperException {
        Objects.requireNonNull(fieldName);
        Objects.requireNonNull(columnName);
        if (hasFieldByName(fieldName)) {
            AwareRowMapper<T> other = new AwareRowMapper<>(this);
            other.fieldToColumn.put(fieldName, columnName);
            return other;
        } else {
            throw new AwareRowMapperException("Class \"" +
                    clazz.getName() + "\" doesn't have a \"" +
                    fieldName + "\" field.");
        }
    }

    /**
     * <p>fieldToValue.</p>
     *
     * @param fieldName a {@link java.lang.String} object.
     * @param value     a {@link java.lang.Object} object.
     * @return a {@link ru.spb.devclub.utils.db.AwareRowMapper} object.
     * @throws ru.spb.devclub.utils.db.AwareRowMapperException if any.
     */
    public AwareRowMapper<T> fieldToValue(String fieldName, Object value) throws AwareRowMapperException {
        return fieldToValue(fieldName, (rs, rowNum) -> value);
    }

    /**
     * <p>fieldToValue.</p>
     *
     * @param fieldName a {@link java.lang.String} object.
     * @param mapper    a {@link ru.spb.devclub.utils.db.ExtendedRowMapper} object.
     * @return a {@link ru.spb.devclub.utils.db.AwareRowMapper} object.
     * @throws ru.spb.devclub.utils.db.AwareRowMapperException if any.
     */
    public AwareRowMapper<T> fieldToValue(String fieldName, ExtendedRowMapper<Object> mapper)
            throws AwareRowMapperException {
        Objects.requireNonNull(fieldName);
        if (hasFieldByName(fieldName)) {
            AwareRowMapper<T> other = new AwareRowMapper<>(this);
            other.fieldToValue.put(fieldName, mapper);
            return other;
        } else {
            throw new AwareRowMapperException("Class \"" +
                    clazz.getName() + "\" doesn't have a \"" +
                    fieldName + "\" field.");
        }
    }

    /**
     * <p>hasFieldByName.</p>
     *
     * @param fieldName a {@link java.lang.String} object.
     * @return a boolean.
     */
    protected boolean hasFieldByName(String fieldName) {
        return Arrays.stream(getFields()).map(Field::getName).anyMatch(fieldName::equals);
    }
}
