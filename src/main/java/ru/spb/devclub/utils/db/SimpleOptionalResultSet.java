package ru.spb.devclub.utils.db;

import java.math.BigDecimal;
import java.sql.*;
import java.util.Optional;

/**
 * The simple implementation of {@link ru.spb.devclub.utils.db.OptionalResultSet}.
 *
 * @author Grig Alex
 * @version 0.1.0
 * @see ru.spb.devclub.utils.db.OptionalResultSet
 * @see ru.spb.devclub.utils.db.ProxyResultSet
 * @since 0.1.0
 */
/* package */class SimpleOptionalResultSet extends ProxyResultSet implements OptionalResultSet {
    protected SimpleOptionalResultSet(ResultSet resultSet) {
        super(resultSet);
    }

    @Override
    public Optional<String> getOptionalString(int columnIndex) throws SQLException {
        String value = resultSet.getString(columnIndex);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<String> getOptionalString(String columnName) throws SQLException {
        String value = resultSet.getString(columnName);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Boolean> getOptionalBoolean(int columnIndex) throws SQLException {
        Boolean value = resultSet.getBoolean(columnIndex);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Boolean> getOptionalBoolean(String columnName) throws SQLException {
        Boolean value = resultSet.getBoolean(columnName);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Byte> getOptionalByte(int columnIndex) throws SQLException {
        Byte value = resultSet.getByte(columnIndex);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Byte> getOptionalByte(String columnName) throws SQLException {
        Byte value = resultSet.getByte(columnName);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Short> getOptionalShort(int columnIndex) throws SQLException {
        Short value = resultSet.getShort(columnIndex);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Short> getOptionalShort(String columnName) throws SQLException {
        Short value = resultSet.getShort(columnName);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Integer> getOptionalInt(int columnIndex) throws SQLException {
        int value = resultSet.getInt(columnIndex);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Integer> getOptionalInt(String columnName) throws SQLException {
        int value = resultSet.getInt(columnName);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Long> getOptionalLong(int columnIndex) throws SQLException {
        long value = resultSet.getLong(columnIndex);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Long> getOptionalLong(String columnName) throws SQLException {
        long value = resultSet.getLong(columnName);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Float> getOptionalFloat(int columnIndex) throws SQLException {
        Float value = resultSet.getFloat(columnIndex);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Float> getOptionalFloat(String columnName) throws SQLException {
        Float value = resultSet.getFloat(columnName);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Double> getOptionalDouble(int columnIndex) throws SQLException {
        double value = resultSet.getDouble(columnIndex);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Double> getOptionalDouble(String columnName) throws SQLException {
        double value = resultSet.getDouble(columnName);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<byte[]> getOptionalBytes(int columnIndex) throws SQLException {
        byte[] value = resultSet.getBytes(columnIndex);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<byte[]> getOptionalBytes(String columnName) throws SQLException {
        byte[] value = resultSet.getBytes(columnName);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Date> getOptionalDate(int columnIndex) throws SQLException {
        Date value = resultSet.getDate(columnIndex);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Date> getOptionalDate(String columnName) throws SQLException {
        Date value = resultSet.getDate(columnName);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Time> getOptionalTime(int columnIndex) throws SQLException {
        Time value = resultSet.getTime(columnIndex);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Time> getOptionalTime(String columnName) throws SQLException {
        Time value = resultSet.getTime(columnName);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Timestamp> getOptionalTimestamp(int columnIndex) throws SQLException {
        Timestamp value = resultSet.getTimestamp(columnIndex);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Timestamp> getOptionalTimestamp(String columnName) throws SQLException {
        Timestamp value = resultSet.getTimestamp(columnName);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<BigDecimal> getOptionalBigDecimal(int columnIndex) throws SQLException {
        BigDecimal value = resultSet.getBigDecimal(columnIndex);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<BigDecimal> getOptionalBigDecimal(String columnName) throws SQLException {
        BigDecimal value = resultSet.getBigDecimal(columnName);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Ref> getOptionalRef(int columnIndex) throws SQLException {
        Ref value = resultSet.getRef(columnIndex);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Ref> getOptionalRef(String columnName) throws SQLException {
        Ref value = resultSet.getRef(columnName);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Blob> getOptionalBlob(int columnIndex) throws SQLException {
        Blob value = resultSet.getBlob(columnIndex);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Blob> getOptionalBlob(String columnName) throws SQLException {
        Blob value = resultSet.getBlob(columnName);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Clob> getOptionalClob(int columnIndex) throws SQLException {
        Clob value = resultSet.getClob(columnIndex);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Clob> getOptionalClob(String columnName) throws SQLException {
        Clob value = resultSet.getClob(columnName);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Array> getOptionalArray(int columnIndex) throws SQLException {
        Array value = resultSet.getArray(columnIndex);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }

    @Override
    public Optional<Array> getOptionalArray(String columnName) throws SQLException {
        Array value = resultSet.getArray(columnName);
        return resultSet.wasNull() ? Optional.empty() : Optional.of(value);
    }
}
