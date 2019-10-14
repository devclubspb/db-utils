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
 * @see ru.spb.devclub.utils.db.SimpleBoxedResultSet
 * @since 0.1.0
 */
/* package */class SimpleOptionalResultSet extends SimpleBoxedResultSet implements OptionalResultSet {
    protected SimpleOptionalResultSet(ResultSet resultSet) {
        super(resultSet);
    }

    @Override
    public Optional<String> getOptionalString(int columnIndex) throws SQLException {
        return Optional.ofNullable(getString(columnIndex));
    }

    @Override
    public Optional<String> getOptionalString(String columnName) throws SQLException {
        return Optional.ofNullable(getString(columnName));
    }

    @Override
    public Optional<Boolean> getOptionalBoolean(int columnIndex) throws SQLException {
        return Optional.ofNullable(getBooleanOrNull(columnIndex));
    }

    @Override
    public Optional<Boolean> getOptionalBoolean(String columnName) throws SQLException {
        return Optional.ofNullable(getBooleanOrNull(columnName));
    }

    @Override
    public Optional<Byte> getOptionalByte(int columnIndex) throws SQLException {
        return Optional.ofNullable(getByteOrNull(columnIndex));
    }

    @Override
    public Optional<Byte> getOptionalByte(String columnName) throws SQLException {
        return Optional.ofNullable(getByteOrNull(columnName));
    }

    @Override
    public Optional<Short> getOptionalShort(int columnIndex) throws SQLException {
        return Optional.ofNullable(getShortOrNull(columnIndex));
    }

    @Override
    public Optional<Short> getOptionalShort(String columnName) throws SQLException {
        return Optional.ofNullable(getShortOrNull(columnName));
    }

    @Override
    public Optional<Integer> getOptionalInt(int columnIndex) throws SQLException {
        return Optional.ofNullable(getIntOrNull(columnIndex));
    }

    @Override
    public Optional<Integer> getOptionalInt(String columnName) throws SQLException {
        return Optional.ofNullable(getIntOrNull(columnName));
    }

    @Override
    public Optional<Long> getOptionalLong(int columnIndex) throws SQLException {
        return Optional.ofNullable(getLongOrNull(columnIndex));
    }

    @Override
    public Optional<Long> getOptionalLong(String columnName) throws SQLException {
        return Optional.ofNullable(getLongOrNull(columnName));
    }

    @Override
    public Optional<Float> getOptionalFloat(int columnIndex) throws SQLException {
        return Optional.ofNullable(getFloatOrNull(columnIndex));
    }

    @Override
    public Optional<Float> getOptionalFloat(String columnName) throws SQLException {
        return Optional.ofNullable(getFloatOrNull(columnName));
    }

    @Override
    public Optional<Double> getOptionalDouble(int columnIndex) throws SQLException {
        return Optional.ofNullable(getDoubleOrNull(columnIndex));
    }

    @Override
    public Optional<Double> getOptionalDouble(String columnName) throws SQLException {
        return Optional.ofNullable(getDoubleOrNull(columnName));
    }

    @Override
    public Optional<byte[]> getOptionalBytes(int columnIndex) throws SQLException {
        return Optional.ofNullable(getBytes(columnIndex));
    }

    @Override
    public Optional<byte[]> getOptionalBytes(String columnName) throws SQLException {
        return Optional.ofNullable(getBytes(columnName));
    }

    @Override
    public Optional<Date> getOptionalDate(int columnIndex) throws SQLException {
        return Optional.ofNullable(getDate(columnIndex));
    }

    @Override
    public Optional<Date> getOptionalDate(String columnName) throws SQLException {
        return Optional.ofNullable(getDate(columnName));
    }

    @Override
    public Optional<Time> getOptionalTime(int columnIndex) throws SQLException {
        return Optional.ofNullable(getTime(columnIndex));
    }

    @Override
    public Optional<Time> getOptionalTime(String columnName) throws SQLException {
        return Optional.ofNullable(getTime(columnName));
    }

    @Override
    public Optional<Timestamp> getOptionalTimestamp(int columnIndex) throws SQLException {
        return Optional.ofNullable(getTimestamp(columnIndex));
    }

    @Override
    public Optional<Timestamp> getOptionalTimestamp(String columnName) throws SQLException {
        return Optional.ofNullable(getTimestamp(columnName));
    }

    @Override
    public Optional<BigDecimal> getOptionalBigDecimal(int columnIndex) throws SQLException {
        return Optional.ofNullable(getBigDecimal(columnIndex));
    }

    @Override
    public Optional<BigDecimal> getOptionalBigDecimal(String columnName) throws SQLException {
        return Optional.ofNullable(getBigDecimal(columnName));
    }

    @Override
    public Optional<Ref> getOptionalRef(int columnIndex) throws SQLException {
        return Optional.ofNullable(getRef(columnIndex));
    }

    @Override
    public Optional<Ref> getOptionalRef(String columnName) throws SQLException {
        return Optional.ofNullable(getRef(columnName));
    }

    @Override
    public Optional<Blob> getOptionalBlob(int columnIndex) throws SQLException {
        return Optional.ofNullable(getBlob(columnIndex));
    }

    @Override
    public Optional<Blob> getOptionalBlob(String columnName) throws SQLException {
        return Optional.ofNullable(getBlob(columnName));
    }

    @Override
    public Optional<Clob> getOptionalClob(int columnIndex) throws SQLException {
        return Optional.ofNullable(getClob(columnIndex));
    }

    @Override
    public Optional<Clob> getOptionalClob(String columnName) throws SQLException {
        return Optional.ofNullable(getClob(columnName));
    }

    @Override
    public Optional<Array> getOptionalArray(int columnIndex) throws SQLException {
        return Optional.ofNullable(getArray(columnIndex));
    }

    @Override
    public Optional<Array> getOptionalArray(String columnName) throws SQLException {
        return Optional.ofNullable(getArray(columnName));
    }
}
