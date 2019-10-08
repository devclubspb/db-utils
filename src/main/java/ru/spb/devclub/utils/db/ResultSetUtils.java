package ru.spb.devclub.utils.db;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;

@SuppressWarnings("WeakerAccess")
public final class ResultSetUtils {
    private ResultSetUtils() {
    }

    public static <T> T getEnumValue(ResultSet rs, String columnName, T[] enumItems) throws SQLException {
        String result = rs.getString(columnName);
        if (!rs.wasNull()) {
            for (T item : enumItems) {
                if (item.toString().equals(result)) {
                    return item;
                }
            }
            throw new IllegalArgumentException("Enum \"" + enumItems.getClass().getComponentType().getName() +
                    "\" doesn't contain a constant by the string value \"" + result + "\".");
        }
        return null;
    }

    public static Long getLong(ResultSet rs, String columnName) throws SQLException {
        long result = rs.getLong(columnName);
        return !rs.wasNull() ? result : null;
    }

    public static Integer getInt(ResultSet rs, String columnName) throws SQLException {
        int result = rs.getInt(columnName);
        return !rs.wasNull() ? result : null;
    }

    public static Boolean getBoolean(ResultSet rs, String columnName) throws SQLException {
        boolean result = rs.getBoolean(columnName);
        return !rs.wasNull() ? result : null;
    }

    public static Timestamp getTimestamp(ResultSet rs, String columnName) throws SQLException {
        Timestamp result = rs.getTimestamp(columnName);
        return !rs.wasNull() ? result : null;
    }

    public static Date getDate(ResultSet rs, String columnName) throws SQLException {
        Date result = rs.getDate(columnName);
        return !rs.wasNull() ? result : null;
    }

    public static String getDateString(ResultSet rs, String columnName, DateFormat dateFormat) throws SQLException {
        Date date = rs.getDate(columnName);
        return !rs.wasNull() ? dateFormat.format(date) : null;
    }

    public static BoxedResultSet boxed(ResultSet resultSet) {
        return new SimpleBoxedResultSet(resultSet);
    }

    /**
     * Wraps to {@link ru.spb.devclub.utils.db.OptionalResultSet}.
     *
     * @param resultSet the {@link java.sql.ResultSet} instance
     * @return the {@code resultSet} wrapped to {@link ru.spb.devclub.utils.db.SimpleOptionalResultSet}
     * @see ru.spb.devclub.utils.db.OptionalResultSet
     * @see ru.spb.devclub.utils.db.SimpleOptionalResultSet
     * @see java.sql.ResultSet
     * @since 0.1.0
     */
    public static OptionalResultSet optional(ResultSet resultSet) {
        return new SimpleOptionalResultSet(resultSet);
    }
}
