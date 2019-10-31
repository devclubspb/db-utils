package ru.spb.devclub.utils.db.rowmapper;

import ru.spb.devclub.utils.db.BoxedResultSet;
import ru.spb.devclub.utils.db.BoxedRowMapper;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AwareRowMapper<T> implements BoxedRowMapper<T> {
    protected final Class<T> clazz;
    protected final Map<Class<?>, AwareRowMapper<?>> mappers;
    protected final Map<String, String> fieldToColumn;
    protected final Map<String, BoxedRowMapper<Object>> fieldToValue;

    public AwareRowMapper(Class<T> clazz) {
        this(clazz, new HashMap<>());
    }

    public AwareRowMapper(Class<T> clazz, Map<Class<?>, AwareRowMapper<?>> mappers) {
        this.clazz = clazz;
        this.mappers = mappers;
        this.fieldToColumn = new HashMap<>();
        this.fieldToValue = new HashMap<>();
    }

    protected AwareRowMapper(AwareRowMapper<T> other) {
        this.clazz = other.clazz;
        this.mappers = new HashMap<>(other.mappers);
        this.fieldToColumn = new HashMap<>(other.fieldToColumn);
        this.fieldToValue = new HashMap<>(other.fieldToValue);
    }

    @Override
    public T mapRow(BoxedResultSet rs, int rowNum) throws SQLException {
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

    protected T getResultInstance() throws AwareRowMapperException {
        try {
            return clazz.getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new AwareRowMapperException("Exception to create a new instance of the class: \"" +
                    clazz.getName() + "\".", e);
        }
    }

    protected Field[] getFields() {
        return clazz.getDeclaredFields();
    }

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

    protected String getMethodName(Field field) {
        String fieldName = field.getName();
        return "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
    }

    protected Class<?> getFieldType(Field field) {
        return field.getType();
    }

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

    public AwareRowMapper<T> prefix(String prefix) {
        return new AwareRowMapper<T>(this) {
            @Override
            protected String getColumnNameByFieldName(String fieldName) {
                return prefix + "." + super.getColumnNameByFieldName(fieldName);
            }
        };
    }

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

    public AwareRowMapper<T> fieldToValue(String fieldName, Object value) throws AwareRowMapperException {
        return fieldToValue(fieldName, (rs, rowNum) -> value);
    }

    public AwareRowMapper<T> fieldToValue(String fieldName, BoxedRowMapper<Object> mapper)
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

    private boolean hasFieldByName(String fieldName) {
        return Arrays.stream(getFields()).map(Field::getName).anyMatch(fieldName::equals);
    }
}
