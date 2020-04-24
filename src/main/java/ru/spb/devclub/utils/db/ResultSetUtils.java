package ru.spb.devclub.utils.db;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.*;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

/**
 * <p>ResultSetUtils class.</p>
 *
 * @author Grig Alex, vechis
 * @version 0.2.0
 * @since 0.1.0
 */
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

    public static Optional<Long> getOptionalLong(ResultSet rs, String columnName) throws SQLException {
        return Optional.ofNullable(getLong(rs, columnName));
    }

    public static Optional<Long> getOptionalLong(ResultSet rs, int columnIndex) throws SQLException {
        return Optional.ofNullable(getLong(rs, columnIndex));
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

    public static Optional<Integer> getOptionalInt(ResultSet rs, String columnName) throws SQLException {
        return Optional.ofNullable(getInt(rs, columnName));
    }

    public static Optional<Integer> getOptionalInt(ResultSet rs, int columnIndex) throws SQLException {
        return Optional.ofNullable(getInt(rs, columnIndex));
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

    public static Optional<Boolean> getOptionalBoolean(ResultSet rs, String columnName) throws SQLException {
        return Optional.ofNullable(getBoolean(rs, columnName));
    }

    public static Optional<Boolean> getOptionalBoolean(ResultSet rs, int columnIndex) throws SQLException {
        return Optional.ofNullable(getBoolean(rs, columnIndex));
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

    public static Optional<Short> getOptionalShort(ResultSet rs, String columnName) throws SQLException {
        return Optional.ofNullable(getShort(rs, columnName));
    }

    public static Optional<Short> getOptionalShort(ResultSet rs, int columnIndex) throws SQLException {
        return Optional.ofNullable(getShort(rs, columnIndex));
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

    public static Optional<Byte> getOptionalByte(ResultSet rs, String columnName) throws SQLException {
        return Optional.ofNullable(getByte(rs, columnName));
    }

    public static Optional<Byte> getOptionalByte(ResultSet rs, int columnIndex) throws SQLException {
        return Optional.ofNullable(getByte(rs, columnIndex));
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

    public static Optional<Double> getOptionalDouble(ResultSet rs, String columnName) throws SQLException {
        return Optional.ofNullable(getDouble(rs, columnName));
    }

    public static Optional<Double> getOptionalDouble(ResultSet rs, int columnIndex) throws SQLException {
        return Optional.ofNullable(getDouble(rs, columnIndex));
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

    public static Optional<Float> getOptionalFloat(ResultSet rs, String columnName) throws SQLException {
        return Optional.ofNullable(getFloat(rs, columnName));
    }

    public static Optional<Float> getOptionalFloat(ResultSet rs, int columnIndex) throws SQLException {
        return Optional.ofNullable(getFloat(rs, columnIndex));
    }

    public static Optional<String> getOptionalString(ResultSet rs, int columnIndex) throws SQLException {
        return Optional.ofNullable(rs.getString(columnIndex));
    }

    public static Optional<String> getOptionalString(ResultSet rs, String columnName) throws SQLException {
        return Optional.ofNullable(rs.getString(columnName));
    }

    public static String getDateString(ResultSet rs, String columnName, DateFormat dateFormat) throws SQLException {
        Date result = rs.getDate(columnName);
        return result != null ? dateFormat.format(result) : null;
    }

    public static Optional<String> getOptionalDateString(ResultSet rs, String columnName, DateFormat dateFormat) throws SQLException {
        return Optional.ofNullable(getDateString(rs, columnName, dateFormat));
    }

    public static String getDateString(ResultSet rs, int columnIndex, DateFormat dateFormat) throws SQLException {
        Date result = rs.getDate(columnIndex);
        return result != null ? dateFormat.format(result) : null;
    }

    public static Optional<String> getOptionalDateString(ResultSet rs, int columnIndex, DateFormat dateFormat) throws SQLException {
        return Optional.ofNullable(getDateString(rs, columnIndex, dateFormat));
    }

    public static String getTimeString(ResultSet rs, String columnName, DateFormat dateFormat) throws SQLException {
        Time result = rs.getTime(columnName);
        return result != null ? dateFormat.format(result) : null;
    }

    public static Optional<String> getOptionalTimeString(ResultSet rs, String columnName, DateFormat dateFormat) throws SQLException {
        return Optional.ofNullable(getTimeString(rs, columnName, dateFormat));
    }

    public static String getTimeString(ResultSet rs, int columnIndex, DateFormat dateFormat) throws SQLException {
        Time result = rs.getTime(columnIndex);
        return result != null ? dateFormat.format(result) : null;
    }

    public static Optional<String> getOptionalTimeString(ResultSet rs, int columnIndex, DateFormat dateFormat) throws SQLException {
        return Optional.ofNullable(getTimeString(rs, columnIndex, dateFormat));
    }

    public static String getTimestampString(ResultSet rs, String columnName, DateFormat dateFormat) throws SQLException {
        Timestamp result = rs.getTimestamp(columnName);
        return result != null ? dateFormat.format(result) : null;
    }

    public static Optional<String> getOptionalTimestampString(ResultSet rs, String columnName, DateFormat dateFormat) throws SQLException {
        return Optional.ofNullable(getTimestampString(rs, columnName, dateFormat));
    }

    public static String getTimestampString(ResultSet rs, int columnIndex, DateFormat dateFormat) throws SQLException {
        Timestamp result = rs.getTimestamp(columnIndex);
        return result != null ? dateFormat.format(result) : null;
    }

    public static Optional<String> getOptionalTimestampString(ResultSet rs, int columnIndex, DateFormat dateFormat) throws SQLException {
        return Optional.ofNullable(getTimestampString(rs, columnIndex, dateFormat));
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

    public static Optional<LocalDate> getOptionalLocalDate(ResultSet rs, String columnName) throws SQLException {
        return Optional.ofNullable(getLocalDate(rs, columnName));
    }

    public static Optional<LocalDate> getOptionalLocalDate(ResultSet rs, int columnIndex) throws SQLException {
        return Optional.ofNullable(getLocalDate(rs, columnIndex));
    }

    public static String getLocalDateString(ResultSet rs, String columnName, DateTimeFormatter dateFormat) throws SQLException {
        LocalDate result = getLocalDate(rs, columnName);
        return result != null ? dateFormat.format(result) : null;
    }

    public static String getLocalDateString(ResultSet rs, int columnIndex, DateTimeFormatter dateFormat) throws SQLException {
        LocalDate result = getLocalDate(rs, columnIndex);
        return result != null ? dateFormat.format(result) : null;
    }

    public static Optional<String> getOptionalLocalDateString(ResultSet rs, String columnName, DateTimeFormatter dateFormat) throws SQLException {
        return Optional.ofNullable(getLocalDateString(rs, columnName, dateFormat));
    }

    public static Optional<String> getOptionalLocalDateString(ResultSet rs, int columnIndex, DateTimeFormatter dateFormat) throws SQLException {
        return Optional.ofNullable(getLocalDateString(rs, columnIndex, dateFormat));
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

    public static Optional<LocalTime> getOptionalLocalTime(ResultSet rs, String columnName) throws SQLException {
        return Optional.ofNullable(getLocalTime(rs, columnName));
    }

    public static Optional<LocalTime> getOptionalLocalTime(ResultSet rs, int columnIndex) throws SQLException {
        return Optional.ofNullable(getLocalTime(rs, columnIndex));
    }

    public static String getLocalTimeString(ResultSet rs, String columnName, DateTimeFormatter timeFormat) throws SQLException {
        LocalTime result = getLocalTime(rs, columnName);
        return result != null ? timeFormat.format(result) : null;
    }

    public static String getLocalTimeString(ResultSet rs, int columnIndex, DateTimeFormatter timeFormat) throws SQLException {
        LocalTime result = getLocalTime(rs, columnIndex);
        return result != null ? timeFormat.format(result) : null;
    }

    public static Optional<String> getOptionalLocalTimeString(ResultSet rs, String columnName, DateTimeFormatter timeFormat) throws SQLException {
        return Optional.ofNullable(getLocalTimeString(rs, columnName, timeFormat));
    }

    public static Optional<String> getOptionalLocalTimeString(ResultSet rs, int columnIndex, DateTimeFormatter timeFormat) throws SQLException {
        return Optional.ofNullable(getLocalTimeString(rs, columnIndex, timeFormat));
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

    public static Optional<LocalDateTime> getOptionalLocalDateTime(ResultSet rs, String columnName) throws SQLException {
        return Optional.ofNullable(getLocalDateTime(rs, columnName));
    }

    public static Optional<LocalDateTime> getOptionalLocalDateTime(ResultSet rs, int columnIndex) throws SQLException {
        return Optional.ofNullable(getLocalDateTime(rs, columnIndex));
    }

    public static String getLocalDateTimeString(ResultSet rs, String columnName, DateTimeFormatter dateTimeFormat) throws SQLException {
        LocalDateTime result = getLocalDateTime(rs, columnName);
        return result != null ? dateTimeFormat.format(result) : null;
    }

    public static String getLocalDateTimeString(ResultSet rs, int columnInt, DateTimeFormatter dateTimeFormat) throws SQLException {
        LocalDateTime result = getLocalDateTime(rs, columnInt);
        return result != null ? dateTimeFormat.format(result) : null;
    }

    public static Optional<String> getOptionalLocalDateTimeString(ResultSet rs, String columnName, DateTimeFormatter dateTimeFormat) throws SQLException {
        return Optional.ofNullable(getLocalDateTimeString(rs, columnName, dateTimeFormat));
    }

    public static Optional<String> getOptionalLocalDateTimeString(ResultSet rs, int columnInt, DateTimeFormatter dateTimeFormat) throws SQLException {
        return Optional.ofNullable(getLocalDateTimeString(rs, columnInt, dateTimeFormat));
    }

    /**
     * <p>getEnumByName.</p>
     *
     * @param rs         a {@link java.sql.ResultSet} object.
     * @param columnName a {@link java.lang.String} object.
     * @param enumType   a {@link java.lang.Class} object.
     * @param <T>        a T object.
     * @return a T object.
     * @throws java.lang.IllegalArgumentException from {@link java.lang.Enum#valueOf(Class, String)}
     * @throws java.lang.NullPointerException     from {@link java.lang.Enum#valueOf(Class, String)}
     * @throws java.sql.SQLException              if any.
     */
    public static <T extends Enum<T>> T getEnumByName(ResultSet rs, String columnName, Class<T> enumType) throws SQLException {
        String name = rs.getString(columnName);
        return name != null ? Enum.valueOf(enumType, name) : null;
    }

    /**
     * <p>getEnumByName.</p>
     *
     * @param rs          a {@link java.sql.ResultSet} object.
     * @param columnIndex a int.
     * @param enumType    a {@link java.lang.Class} object.
     * @return a T object.
     * @throws java.lang.IllegalArgumentException from {@link java.lang.Enum#valueOf(Class, String)}
     * @throws java.lang.NullPointerException     from {@link java.lang.Enum#valueOf(Class, String)}
     * @param <T> a T object.
     * @throws java.sql.SQLException if any.
     */
    public static <T extends Enum<T>> T getEnumByName(ResultSet rs, int columnIndex, Class<T> enumType) throws SQLException {
        String name = rs.getString(columnIndex);
        return name != null ? Enum.valueOf(enumType, name) : null;
    }

    public static <T extends Enum<T>> Optional<T> getOptionalEnumByName(ResultSet rs, String columnName, Class<T> enumType) throws SQLException {
        try {
            return Optional.ofNullable(getEnumByName(rs, columnName, enumType));
        } catch (IllegalArgumentException ignore) {
            return Optional.empty();
        }
    }

    public static <T extends Enum<T>> Optional<T> getOptionalEnumByName(ResultSet rs, int columnIndex, Class<T> enumType) throws SQLException {
        try {
            return Optional.ofNullable(getEnumByName(rs, columnIndex, enumType));
        } catch (IllegalArgumentException ignore) {
            return Optional.empty();
        }
    }

    /**
     * <p>getEnumByOrdinal.</p>
     *
     * @param rs         a {@link java.sql.ResultSet} object.
     * @param columnName a {@link java.lang.String} object.
     * @param enumType   a {@link java.lang.Class} object.
     * @return a T object.
     * @throws java.lang.ArrayIndexOutOfBoundsException if ordinal greater that enum values length
     * @param <T> a T object.
     * @throws java.sql.SQLException if any.
     */
    @SuppressWarnings("unchecked")
    public static <T extends Enum<T>> T getEnumByOrdinal(ResultSet rs, String columnName, Class<T> enumType) throws SQLException {
        try {
            Method method = enumType.getDeclaredMethod("values");
            T[] values = (T[]) method.invoke(null);
            return getEnumByOrdinal(rs, columnName, values);
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
     * @return a T object.
     * @throws java.lang.ArrayIndexOutOfBoundsException if ordinal greater that enum values length
     * @param <T> a T object.
     * @throws java.sql.SQLException if any.
     */
    @SuppressWarnings("unchecked")
    public static <T extends Enum<T>> T getEnumByOrdinal(ResultSet rs, int columnIndex, Class<T> enumType) throws SQLException {
        try {
            Method method = enumType.getDeclaredMethod("values");
            T[] values = (T[]) method.invoke(null);
            return getEnumByOrdinal(rs, columnIndex, values);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new SQLException(e);
        }
    }

    public static <T extends Enum<T>> T getEnumByOrdinal(ResultSet rs, String columnName, T[] values) throws SQLException {
        try {
            Integer index = getInt(rs, columnName);
            return index != null ? values[index] : null;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new SQLException(e);
        }
    }

    public static <T extends Enum<T>> T getEnumByOrdinal(ResultSet rs, int columnIndex, T[] values) throws SQLException {
        try {
            Integer index = getInt(rs, columnIndex);
            return index != null ? values[index] : null;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new SQLException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public static <T extends Enum<T>> Optional<T> getOptionalEnumByOrdinal(ResultSet rs, String columnName, Class<T> enumType) throws SQLException {
        try {
            Method method = enumType.getDeclaredMethod("values");
            T[] values = (T[]) method.invoke(null);
            return getOptionalEnumByOrdinal(rs, columnName, values);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException ignore) {
            return Optional.empty();
        }
    }

    @SuppressWarnings("unchecked")
    public static <T extends Enum<T>> Optional<T> getOptionalEnumByOrdinal(ResultSet rs, int columnIndex, Class<T> enumType) throws SQLException {
        try {
            Method method = enumType.getDeclaredMethod("values");
            T[] values = (T[]) method.invoke(null);
            return getOptionalEnumByOrdinal(rs, columnIndex, values);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException ignore) {
            return Optional.empty();
        }
    }

    public static <T extends Enum<T>> Optional<T> getOptionalEnumByOrdinal(ResultSet rs, String columnName, T[] values) throws SQLException {
        return Optional.ofNullable(getEnumByOrdinal(rs, columnName, values));
    }

    public static <T extends Enum<T>> Optional<T> getOptionalEnumByOrdinal(ResultSet rs, int columnIndex, T[] values) throws SQLException {
        return Optional.ofNullable(getEnumByOrdinal(rs, columnIndex, values));
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
