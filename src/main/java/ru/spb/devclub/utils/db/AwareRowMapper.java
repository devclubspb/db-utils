package ru.spb.devclub.utils.db;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class AwareRowMapper<T> implements BoxedRowMapper<T> {
    protected final Class<T> clazz;
    protected final Map<Class<?>, AwareRowMapper<?>> mappers;

    public AwareRowMapper(Class<T> clazz) {
        this(clazz, new HashMap<>());
    }

    public AwareRowMapper(Class<T> clazz, Map<Class<?>, AwareRowMapper<?>> mappers) {
        this.clazz = clazz;
        this.mappers = mappers;
    }

    @Override
    public T mapRow(BoxedResultSet rs, int rowNum) throws SQLException {
        try {
            T result = getResultInstance();
            Field[] fields = getFields();
            for (Field field : fields) {
                String columnName = getColumnName(field);
                Method method = getMethod(field);
                Class<?> fieldType = getFieldType(field);
                if (fieldType.isPrimitive()) {
                    if (int.class.equals(fieldType)) {
                        method.invoke(result, rs.getInt(columnName));
                    } else if (long.class.equals(fieldType)) {
                        method.invoke(result, rs.getLong(columnName));
                    } else if (double.class.equals(fieldType)) {
                        method.invoke(result, rs.getDouble(columnName));
                    } else if (boolean.class.equals(fieldType)) {
                        method.invoke(result, rs.getBoolean(columnName));
                    } else if (float.class.equals(fieldType)) {
                        method.invoke(result, rs.getFloat(columnName));
                    } else if (short.class.equals(fieldType)) {
                        method.invoke(result, rs.getShort(columnName));
                    } else if (byte.class.equals(fieldType)) {
                        method.invoke(result, rs.getByte(columnName));
                    } else if (char.class.equals(fieldType)) {
                        String value = rs.getString(columnName);
                        if (value != null) {
                            method.invoke(result, value.charAt(0));
                        }
                    }
                } else {
                    if (String.class.equals(fieldType)) {
                        method.invoke(result, rs.getString(columnName));
                    } else if (Integer.class.equals(fieldType)) {
                        method.invoke(result, rs.getIntOrNull(columnName));
                    } else if (Long.class.equals(fieldType)) {
                        method.invoke(result, rs.getLongOrNull(columnName));
                    } else if (Double.class.equals(fieldType)) {
                        method.invoke(result, rs.getDoubleOrNull(columnName));
                    } else if (Boolean.class.equals(fieldType)) {
                        method.invoke(result, rs.getBooleanOrNull(columnName));
                    } else if (Float.class.equals(fieldType)) {
                        method.invoke(result, rs.getFloatOrNull(columnName));
                    } else if (Short.class.equals(fieldType)) {
                        method.invoke(result, rs.getShortOrNull(columnName));
                    } else if (Byte.class.equals(fieldType)) {
                        method.invoke(result, rs.getByteOrNull(columnName));
                    } else {
                        AwareRowMapper<?> awareRowMapper = mappers.get(fieldType);
                        if (awareRowMapper != null) {
                            method.invoke(result, awareRowMapper.mapRow(rs, rowNum));
                        }
                    }
                }
            }
            return result;
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new SQLException(e);
        }
    }

    protected T getResultInstance() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        return clazz.getConstructor().newInstance();
    }

    protected Field[] getFields() {
        return clazz.getDeclaredFields();
    }

    protected String getColumnName(Field field) {
        String fieldName = field.getName();
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

    protected Method getMethod(Field field) throws NoSuchMethodException {
        return clazz.getMethod(getMethodName(field), getFieldType(field));
    }

    protected String getMethodName(Field field) {
        String fieldName = field.getName();
        return "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
    }

    protected Class<?> getFieldType(Field field) {
        return field.getType();
    }
}
