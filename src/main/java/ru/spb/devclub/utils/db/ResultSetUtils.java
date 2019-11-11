package ru.spb.devclub.utils.db;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;

@SuppressWarnings("WeakerAccess")
public final class ResultSetUtils {
    private ResultSetUtils() {
    }

    public static Long getLong(ResultSet rs, String columnName) throws SQLException {
        long result = rs.getLong(columnName);
        return !rs.wasNull() ? result : null;
    }

    public static Long getLong(ResultSet rs, int columnIndex) throws SQLException {
        long result = rs.getLong(columnIndex);
        return !rs.wasNull() ? result : null;
    }

    public static Integer getInt(ResultSet rs, String columnName) throws SQLException {
        int result = rs.getInt(columnName);
        return !rs.wasNull() ? result : null;
    }

    public static Integer getInt(ResultSet rs, int columnIndex) throws SQLException {
        int result = rs.getInt(columnIndex);
        return !rs.wasNull() ? result : null;
    }

    public static Boolean getBoolean(ResultSet rs, String columnName) throws SQLException {
        boolean result = rs.getBoolean(columnName);
        return !rs.wasNull() ? result : null;
    }

    public static Boolean getBoolean(ResultSet rs, int columnIndex) throws SQLException {
        boolean result = rs.getBoolean(columnIndex);
        return !rs.wasNull() ? result : null;
    }

    public static Short getShort(ResultSet rs, String columnName) throws SQLException {
        short result = rs.getShort(columnName);
        return !rs.wasNull() ? result : null;
    }

    public static Short getShort(ResultSet rs, int columnIndex) throws SQLException {
        short result = rs.getShort(columnIndex);
        return !rs.wasNull() ? result : null;
    }

    public static Byte getByte(ResultSet rs, String columnName) throws SQLException {
        byte result = rs.getByte(columnName);
        return !rs.wasNull() ? result : null;
    }

    public static Byte getByte(ResultSet rs, int columnIndex) throws SQLException {
        byte result = rs.getByte(columnIndex);
        return !rs.wasNull() ? result : null;
    }

    public static Double getDouble(ResultSet rs, String columnName) throws SQLException {
        double result = rs.getDouble(columnName);
        return !rs.wasNull() ? result : null;
    }

    public static Double getDouble(ResultSet rs, int columnIndex) throws SQLException {
        double result = rs.getDouble(columnIndex);
        return !rs.wasNull() ? result : null;
    }

    public static Float getFloat(ResultSet rs, String columnName) throws SQLException {
        float result = rs.getFloat(columnName);
        return !rs.wasNull() ? result : null;
    }

    public static Float getFloat(ResultSet rs, int columnIndex) throws SQLException {
        float result = rs.getFloat(columnIndex);
        return !rs.wasNull() ? result : null;
    }

    /**
     * @throws SQLException             from {@link java.sql.ResultSet#getString(String)}
     * @throws IllegalArgumentException from {@link java.lang.Enum#valueOf(Class, String)}
     * @throws NullPointerException     from {@link java.lang.Enum#valueOf(Class, String)}
     */
    public static <T extends Enum<T>> T getEnumByName(ResultSet rs, String columnName, Class<T> enumType) throws SQLException {
        return Enum.valueOf(enumType, rs.getString(columnName));
    }

    /**
     * @throws SQLException             from {@link java.sql.ResultSet#getString(int)}
     * @throws IllegalArgumentException from {@link java.lang.Enum#valueOf(Class, String)}
     * @throws NullPointerException     from {@link java.lang.Enum#valueOf(Class, String)}
     */
    public static <T extends Enum<T>> T getEnumByName(ResultSet rs, int columnIndex, Class<T> enumType) throws SQLException {
        return Enum.valueOf(enumType, rs.getString(columnIndex));
    }

    /**
     * @throws SQLException                   from {@link java.sql.ResultSet#getInt(String)}
     * @throws ArrayIndexOutOfBoundsException if ordinal greater that enum values length
     */
    public static <T extends Enum<T>> T getEnumByOrdinal(ResultSet rs, String columnName, Class<T> enumType) throws SQLException {
        //noinspection DuplicatedCode
        try {
            Method method = enumType.getDeclaredMethod("values");
            //noinspection unchecked
            T[] values = (T[]) method.invoke(null);
            return values[rs.getInt(columnName)];
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new SQLException(e);
        }
    }

    /**
     * @throws SQLException                   from {@link java.sql.ResultSet#getInt(int)}
     * @throws ArrayIndexOutOfBoundsException if ordinal greater that enum values length
     */
    public static <T extends Enum<T>> T getEnumByOrdinal(ResultSet rs, int columnIndex, Class<T> enumType) throws SQLException {
        //noinspection DuplicatedCode
        try {
            Method method = enumType.getDeclaredMethod("values");
            //noinspection unchecked
            T[] values = (T[]) method.invoke(null);
            return values[rs.getInt(columnIndex)];
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new SQLException(e);
        }
    }

    /**
     * Wraps to {@link ru.spb.devclub.utils.db.ExtendedResultSet}.
     *
     * @param resultSet the {@link ResultSet} instance
     * @return the {@code resultSet} wrapped to {@link ru.spb.devclub.utils.db.SimpleExtendedResultSet}
     * @see ru.spb.devclub.utils.db.ExtendedResultSet
     * @see ru.spb.devclub.utils.db.SimpleExtendedResultSet
     * @see java.sql.ResultSet
     * @since 0.1.0
     */
    public static ExtendedResultSet extended(ResultSet resultSet) {
        return new SimpleExtendedResultSet(resultSet);
    }
}
