package ru.spb.devclub.utils.db;

import java.sql.ResultSet;
import java.sql.SQLException;

/* package */class SimpleBoxedResultSet extends ProxyResultSet implements BoxedResultSet {
    @SuppressWarnings("WeakerAccess")
    protected SimpleBoxedResultSet(ResultSet resultSet) {
        super(resultSet);
    }

    @Override
    public Long getLongOrNull(String columnName) throws SQLException {
        long value = resultSet.getLong(columnName);
        return resultSet.wasNull() ? null : value;
    }

    @Override
    public Long getLongOrNull(int columnIndex) throws SQLException {
        long value = resultSet.getLong(columnIndex);
        return resultSet.wasNull() ? null : value;
    }
}
