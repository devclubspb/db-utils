package ru.spb.devclub.utils.db;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The simple implementation of {@link ru.spb.devclub.utils.db.BoxedResultSet}.
 *
 * @author vechis, Grig Alex
 * @version 0.1.0
 * @see ru.spb.devclub.utils.db.BoxedResultSet
 * @see ru.spb.devclub.utils.db.ProxyResultSet
 * @since 0.1.0
 */
/* package */class SimpleBoxedResultSet extends ProxyResultSet implements BoxedResultSet {
    @SuppressWarnings("WeakerAccess")
    protected SimpleBoxedResultSet(ResultSet resultSet) {
        super(resultSet);
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
    public Short getShortOrNull(String columnName) throws SQLException {
        return ResultSetUtils.getShort(resultSet, columnName);
    }

    @Override
    public Short getShortOrNull(int columnIndex) throws SQLException {
        return ResultSetUtils.getShort(resultSet, columnIndex);
    }

    @Override
    public Byte getByteOrNull(String columnName) throws SQLException {
        return ResultSetUtils.getByte(resultSet, columnName);
    }

    @Override
    public Byte getByteOrNull(int columnIndex) throws SQLException {
        return ResultSetUtils.getByte(resultSet, columnIndex);
    }

    @Override
    public Double getDoubleOrNull(String columnName) throws SQLException {
        return ResultSetUtils.getDouble(resultSet, columnName);
    }

    @Override
    public Double getDoubleOrNull(int columnIndex) throws SQLException {
        return ResultSetUtils.getDouble(resultSet, columnIndex);
    }

    @Override
    public Float getFloatOrNull(String columnName) throws SQLException {
        return ResultSetUtils.getFloat(resultSet, columnName);
    }

    @Override
    public Float getFloatOrNull(int columnIndex) throws SQLException {
        return ResultSetUtils.getFloat(resultSet, columnIndex);
    }
}
