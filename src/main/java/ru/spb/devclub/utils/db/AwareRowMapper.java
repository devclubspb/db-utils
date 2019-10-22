package ru.spb.devclub.utils.db;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLException;

public class AwareRowMapper<T> implements BoxedRowMapper<T> {
    private final Class<T> clazz;

    public AwareRowMapper(Class<T> clazz) {
        this.clazz = clazz;
    }

    @Override
    public T mapRow(BoxedResultSet rs, int rowNum) throws SQLException {
        try {
            Constructor<T> constructor = clazz.getConstructor();
            T result = constructor.newInstance();
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                String fieldName = field.getName();
                Class<?> fieldType = field.getType();
                String methodName = "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
                Method method = clazz.getMethod(methodName, fieldType);
                if (int.class.equals(fieldType)) {
                    method.invoke(result, rs.getInt(fieldName));
                } else if (long.class.equals(fieldType)) {
                    method.invoke(result, rs.getLong(fieldName));
                }
            }
            return result;
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new SQLException(e);
        }
    }
}
