package ru.spb.devclub.utils.db;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;

/* package */class SimpleBoxedResultSet extends ProxyResultSet implements BoxedResultSet {
    @SuppressWarnings("WeakerAccess")
    protected SimpleBoxedResultSet(ResultSet resultSet) {
        super(resultSet);
    }

    @Override
    public <T extends Enum<T>> T getEnumValue(String columnName, T[] enumItems) throws SQLException {
        return ResultSetUtils.getEnumValue(resultSet, columnName, enumItems);
    }

    @Override
    public <T extends Enum<T>> T getEnumValue(int columnIndex, T[] enumItems) throws SQLException {
        return ResultSetUtils.getEnumValue(resultSet, columnIndex, enumItems);
    }

    @Override
    public Long getLongOrNull(String columnName) throws SQLException {
        return ResultSetUtils.getLong(resultSet, columnName);
    }

    @Override
    public Long getLongOrNull(int columnIndex) throws SQLException {
        return ResultSetUtils.getLong(resultSet, columnIndex);
    }

    @Override
    public Integer getIntOrNull(String columnName) throws SQLException {
        return ResultSetUtils.getInt(resultSet, columnName);
    }

    @Override
    public Integer getIntOrNull(int columnIndex) throws SQLException {
        return ResultSetUtils.getInt(resultSet, columnIndex);
    }

    @Override
    public Boolean getBooleanOrNull(String columnName) throws SQLException {
        return ResultSetUtils.getBoolean(resultSet, columnName);
    }

    @Override
    public Boolean getBooleanOrNull(int columnIndex) throws SQLException {
        return ResultSetUtils.getBoolean(resultSet, columnIndex);
    }

    @Override
    public Timestamp getTimestampOrNull(String columnName) throws SQLException {
        return ResultSetUtils.getTimestamp(resultSet, columnName);
    }

    @Override
    public Timestamp getTimestampOrNull(int columnIndex) throws SQLException {
        return ResultSetUtils.getTimestamp(resultSet, columnIndex);
    }

    @Override
    public Date getDateOrNull(String columnName) throws SQLException {
        return ResultSetUtils.getDate(resultSet, columnName);
    }

    @Override
    public Date getDateOrNull(int columnIndex) throws SQLException {
        return ResultSetUtils.getDate(resultSet, columnIndex);
    }

    @Override
    public String getDateStringOrNull(String columnName, DateFormat dateFormat) throws SQLException {
        return ResultSetUtils.getDateString(resultSet, columnName, dateFormat);
    }

    @Override
    public String getDateStringOrNull(int columnIndex, DateFormat dateFormat) throws SQLException {
        return ResultSetUtils.getDateString(resultSet, columnIndex, dateFormat);
    }
}
