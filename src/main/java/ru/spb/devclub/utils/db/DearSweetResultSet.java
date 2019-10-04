package ru.spb.devclub.utils.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.OptionalLong;

public class DearSweetResultSet extends AbstractSweetResultSet {
    @SuppressWarnings("WeakerAccess")
    public DearSweetResultSet(ResultSet resultSet) {
        super(resultSet);
    }

    @Override
    public Long getLongOrNull(String columnName) throws SQLException {
        long value = resultSet.getLong(columnName);
        return resultSet.wasNull() ? null : value;
    }

    @Override
    public Long getLongOrDefault(String columnName, long defaultValue) throws SQLException {
        long value = resultSet.getLong(columnName);
        return resultSet.wasNull() ? defaultValue : value;
    }

    @Override
    public OptionalLong getOptionalLong(String columnName) throws SQLException {
        long value = resultSet.getLong(columnName);
        return resultSet.wasNull() ? OptionalLong.empty() : OptionalLong.of(value);
    }
}
