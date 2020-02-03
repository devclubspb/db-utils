package ru.spb.devclub.utils.db;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * <p>ResultSetUtils class.</p>
 *
 * @author Grig Alex, vechis
 * @version 0.2.0
 * @since 0.1.0
 */
@SuppressWarnings("WeakerAccess")
public final class ResultSetUtils {
    private ResultSetUtils() {
    }

    /**
     * <p>getLong.</p>
     *
     * @param rs         a {@link java.sql.ResultSet} object.
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.lang.Long} object.
     * @throws java.sql.SQLException if any.
     */
    public static Long getLong(ResultSet rs, String columnName) throws SQLException {
        long result = rs.getLong(columnName);
        return !rs.wasNull() ? result : null;
    }

    /**
     * <p>getLong.</p>
     *
     * @param rs          a {@link java.sql.ResultSet} object.
     * @param columnIndex a int.
     * @return a {@link java.lang.Long} object.
     * @throws java.sql.SQLException if any.
     */
    public static Long getLong(ResultSet rs, int columnIndex) throws SQLException {
        long result = rs.getLong(columnIndex);
        return !rs.wasNull() ? result : null;
    }

    /**
     * <p>getInt.</p>
     *
     * @param rs         a {@link java.sql.ResultSet} object.
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.lang.Integer} object.
     * @throws java.sql.SQLException if any.
     */
    public static Integer getInt(ResultSet rs, String columnName) throws SQLException {
        int result = rs.getInt(columnName);
        return !rs.wasNull() ? result : null;
    }

    /**
     * <p>getInt.</p>
     *
     * @param rs          a {@link java.sql.ResultSet} object.
     * @param columnIndex a int.
     * @return a {@link java.lang.Integer} object.
     * @throws java.sql.SQLException if any.
     */
    public static Integer getInt(ResultSet rs, int columnIndex) throws SQLException {
        int result = rs.getInt(columnIndex);
        return !rs.wasNull() ? result : null;
    }

    /**
     * <p>getBoolean.</p>
     *
     * @param rs         a {@link java.sql.ResultSet} object.
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.lang.Boolean} object.
     * @throws java.sql.SQLException if any.
     */
    public static Boolean getBoolean(ResultSet rs, String columnName) throws SQLException {
        boolean result = rs.getBoolean(columnName);
        return !rs.wasNull() ? result : null;
    }

    /**
     * <p>getBoolean.</p>
     *
     * @param rs          a {@link java.sql.ResultSet} object.
     * @param columnIndex a int.
     * @return a {@link java.lang.Boolean} object.
     * @throws java.sql.SQLException if any.
     */
    public static Boolean getBoolean(ResultSet rs, int columnIndex) throws SQLException {
        boolean result = rs.getBoolean(columnIndex);
        return !rs.wasNull() ? result : null;
    }

    /**
     * <p>getShort.</p>
     *
     * @param rs         a {@link java.sql.ResultSet} object.
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.lang.Short} object.
     * @throws java.sql.SQLException if any.
     */
    public static Short getShort(ResultSet rs, String columnName) throws SQLException {
        short result = rs.getShort(columnName);
        return !rs.wasNull() ? result : null;
    }

    /**
     * <p>getShort.</p>
     *
     * @param rs          a {@link java.sql.ResultSet} object.
     * @param columnIndex a int.
     * @return a {@link java.lang.Short} object.
     * @throws java.sql.SQLException if any.
     */
    public static Short getShort(ResultSet rs, int columnIndex) throws SQLException {
        short result = rs.getShort(columnIndex);
        return !rs.wasNull() ? result : null;
    }

    /**
     * <p>getByte.</p>
     *
     * @param rs         a {@link java.sql.ResultSet} object.
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.lang.Byte} object.
     * @throws java.sql.SQLException if any.
     */
    public static Byte getByte(ResultSet rs, String columnName) throws SQLException {
        byte result = rs.getByte(columnName);
        return !rs.wasNull() ? result : null;
    }

    /**
     * <p>getByte.</p>
     *
     * @param rs          a {@link java.sql.ResultSet} object.
     * @param columnIndex a int.
     * @return a {@link java.lang.Byte} object.
     * @throws java.sql.SQLException if any.
     */
    public static Byte getByte(ResultSet rs, int columnIndex) throws SQLException {
        byte result = rs.getByte(columnIndex);
        return !rs.wasNull() ? result : null;
    }

    /**
     * <p>getDouble.</p>
     *
     * @param rs         a {@link java.sql.ResultSet} object.
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.lang.Double} object.
     * @throws java.sql.SQLException if any.
     */
    public static Double getDouble(ResultSet rs, String columnName) throws SQLException {
        double result = rs.getDouble(columnName);
        return !rs.wasNull() ? result : null;
    }

    /**
     * <p>getDouble.</p>
     *
     * @param rs          a {@link java.sql.ResultSet} object.
     * @param columnIndex a int.
     * @return a {@link java.lang.Double} object.
     * @throws java.sql.SQLException if any.
     */
    public static Double getDouble(ResultSet rs, int columnIndex) throws SQLException {
        double result = rs.getDouble(columnIndex);
        return !rs.wasNull() ? result : null;
    }

    /**
     * <p>getFloat.</p>
     *
     * @param rs         a {@link java.sql.ResultSet} object.
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.lang.Float} object.
     * @throws java.sql.SQLException if any.
     */
    public static Float getFloat(ResultSet rs, String columnName) throws SQLException {
        float result = rs.getFloat(columnName);
        return !rs.wasNull() ? result : null;
    }

    /**
     * <p>getFloat.</p>
     *
     * @param rs          a {@link java.sql.ResultSet} object.
     * @param columnIndex a int.
     * @return a {@link java.lang.Float} object.
     * @throws java.sql.SQLException if any.
     */
    public static Float getFloat(ResultSet rs, int columnIndex) throws SQLException {
        float result = rs.getFloat(columnIndex);
        return !rs.wasNull() ? result : null;
    }

    /**
     * <p>getLocalDate.</p>
     *
     * @param rs         a {@link java.sql.ResultSet} object.
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.time.LocalDate} object.
     * @throws java.sql.SQLException if any.
     * @since 0.2.0
     */
    public static LocalDate getLocalDate(ResultSet rs, String columnName) throws SQLException {
        Date date = rs.getDate(columnName);
        return date != null ? date.toLocalDate() : null;
    }

    /**
     * <p>getLocalDate.</p>
     *
     * @param rs          a {@link java.sql.ResultSet} object.
     * @param columnIndex a int.
     * @return a {@link java.time.LocalDate} object.
     * @throws java.sql.SQLException if any.
     * @since 0.2.0
     */
    public static LocalDate getLocalDate(ResultSet rs, int columnIndex) throws SQLException {
        Date date = rs.getDate(columnIndex);
        return date != null ? date.toLocalDate() : null;
    }

    /**
     * <p>getLocalTime.</p>
     *
     * @param rs         a {@link java.sql.ResultSet} object.
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.time.LocalTime} object.
     * @throws java.sql.SQLException if any.
     * @since 0.2.0
     */
    public static LocalTime getLocalTime(ResultSet rs, String columnName) throws SQLException {
        Time time = rs.getTime(columnName);
        return time != null ? time.toLocalTime() : null;
    }

    /**
     * <p>getLocalTime.</p>
     *
     * @param rs          a {@link java.sql.ResultSet} object.
     * @param columnIndex a int.
     * @return a {@link java.time.LocalTime} object.
     * @throws java.sql.SQLException if any.
     * @since 0.2.0
     */
    public static LocalTime getLocalTime(ResultSet rs, int columnIndex) throws SQLException {
        Time time = rs.getTime(columnIndex);
        return time != null ? time.toLocalTime() : null;
    }

    /**
     * <p>getLocalDateTime.</p>
     *
     * @param rs         a {@link java.sql.ResultSet} object.
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.time.LocalDateTime} object.
     * @throws java.sql.SQLException if any.
     * @since 0.2.0
     */
    public static LocalDateTime getLocalDateTime(ResultSet rs, String columnName) throws SQLException {
        Timestamp timestamp = rs.getTimestamp(columnName);
        return timestamp != null ? timestamp.toLocalDateTime() : null;
    }

    /**
     * <p>getLocalDateTime.</p>
     *
     * @param rs          a {@link java.sql.ResultSet} object.
     * @param columnIndex a int.
     * @return a {@link java.time.LocalDateTime} object.
     * @throws java.sql.SQLException if any.
     * @since 0.2.0
     */
    public static LocalDateTime getLocalDateTime(ResultSet rs, int columnIndex) throws SQLException {
        Timestamp timestamp = rs.getTimestamp(columnIndex);
        return timestamp != null ? timestamp.toLocalDateTime() : null;
    }

    /**
     * <p>getEnumByName.</p>
     *
     * @param rs         a {@link java.sql.ResultSet} object.
     * @param columnName a {@link java.lang.String} object.
     * @param enumType   a {@link java.lang.Class} object.
     * @param <T>        a T object.
     * @return a T object.
     * @throws java.sql.SQLException              from {@link java.sql.ResultSet#getString(String)}
     * @throws java.lang.IllegalArgumentException from {@link java.lang.Enum#valueOf(Class, String)}
     * @throws java.lang.NullPointerException     from {@link java.lang.Enum#valueOf(Class, String)}
     */
    public static <T extends Enum<T>> T getEnumByName(ResultSet rs, String columnName, Class<T> enumType) throws SQLException {
        return Enum.valueOf(enumType, rs.getString(columnName));
    }

    /**
     * <p>getEnumByName.</p>
     *
     * @param rs          a {@link java.sql.ResultSet} object.
     * @param columnIndex a int.
     * @param enumType    a {@link java.lang.Class} object.
     * @param <T>         a T object.
     * @return a T object.
     * @throws java.sql.SQLException              from {@link java.sql.ResultSet#getString(int)}
     * @throws java.lang.IllegalArgumentException from {@link java.lang.Enum#valueOf(Class, String)}
     * @throws java.lang.NullPointerException     from {@link java.lang.Enum#valueOf(Class, String)}
     */
    public static <T extends Enum<T>> T getEnumByName(ResultSet rs, int columnIndex, Class<T> enumType) throws SQLException {
        return Enum.valueOf(enumType, rs.getString(columnIndex));
    }

    /**
     * <p>getEnumByOrdinal.</p>
     *
     * @param rs         a {@link java.sql.ResultSet} object.
     * @param columnName a {@link java.lang.String} object.
     * @param enumType   a {@link java.lang.Class} object.
     * @param <T>        a T object.
     * @return a T object.
     * @throws java.sql.SQLException                    from {@link java.sql.ResultSet#getInt(String)}
     * @throws java.lang.ArrayIndexOutOfBoundsException if ordinal greater that enum values length
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
     * <p>getEnumByOrdinal.</p>
     *
     * @param rs          a {@link java.sql.ResultSet} object.
     * @param columnIndex a int.
     * @param enumType    a {@link java.lang.Class} object.
     * @param <T>         a T object.
     * @return a T object.
     * @throws java.sql.SQLException                    from {@link java.sql.ResultSet#getInt(int)}
     * @throws java.lang.ArrayIndexOutOfBoundsException if ordinal greater that enum values length
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
     * @param resultSet the {@link java.sql.ResultSet} instance
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
