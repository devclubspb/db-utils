package ru.spb.devclub.utils.db;

import java.math.BigDecimal;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Optional;

/**
 * Simple implementation of {@link  ru.spb.devclub.utils.db.ExtendedResultSet}.
 *
 * @author Yagnyshev Gordey, Grig Alex
 * @version 0.2.0
 * @see ru.spb.devclub.utils.db.ExtendedResultSet
 * @see ru.spb.devclub.utils.db.ProxyResultSet
 * @see java.sql.ResultSet
 * @since 0.2.0
 */
class SimpleExtendedResultSet extends ProxyResultSet implements ExtendedResultSet {
    SimpleExtendedResultSet(ResultSet resultSet) {
        super(resultSet);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long getLongOrNull(String columnName) throws SQLException {
        return ResultSetUtils.getLong(resultSet, columnName);
    }

    /** {@inheritDoc} */
    @Override
    public Long getLongOrNull(int columnIndex) throws SQLException {
        return ResultSetUtils.getLong(resultSet, columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public Integer getIntOrNull(String columnName) throws SQLException {
        return ResultSetUtils.getInt(resultSet, columnName);
    }

    /** {@inheritDoc} */
    @Override
    public Integer getIntOrNull(int columnIndex) throws SQLException {
        return ResultSetUtils.getInt(resultSet, columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public Boolean getBooleanOrNull(String columnName) throws SQLException {
        return ResultSetUtils.getBoolean(resultSet, columnName);
    }

    /** {@inheritDoc} */
    @Override
    public Boolean getBooleanOrNull(int columnIndex) throws SQLException {
        return ResultSetUtils.getBoolean(resultSet, columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public Short getShortOrNull(String columnName) throws SQLException {
        return ResultSetUtils.getShort(resultSet, columnName);
    }

    /** {@inheritDoc} */
    @Override
    public Short getShortOrNull(int columnIndex) throws SQLException {
        return ResultSetUtils.getShort(resultSet, columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public Byte getByteOrNull(String columnName) throws SQLException {
        return ResultSetUtils.getByte(resultSet, columnName);
    }

    /** {@inheritDoc} */
    @Override
    public Byte getByteOrNull(int columnIndex) throws SQLException {
        return ResultSetUtils.getByte(resultSet, columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public Double getDoubleOrNull(String columnName) throws SQLException {
        return ResultSetUtils.getDouble(resultSet, columnName);
    }

    /** {@inheritDoc} */
    @Override
    public Double getDoubleOrNull(int columnIndex) throws SQLException {
        return ResultSetUtils.getDouble(resultSet, columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public Float getFloatOrNull(String columnName) throws SQLException {
        return ResultSetUtils.getFloat(resultSet, columnName);
    }

    /** {@inheritDoc} */
    @Override
    public Float getFloatOrNull(int columnIndex) throws SQLException {
        return ResultSetUtils.getFloat(resultSet, columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public LocalDate getLocalDate(String columnName) throws SQLException {
        return ResultSetUtils.getLocalDate(resultSet, columnName);
    }

    /** {@inheritDoc} */
    @Override
    public LocalDate getLocalDate(int columnIndex) throws SQLException {
        return ResultSetUtils.getLocalDate(resultSet, columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public LocalTime getLocalTime(String columnName) throws SQLException {
        return ResultSetUtils.getLocalTime(resultSet, columnName);
    }

    /** {@inheritDoc} */
    @Override
    public LocalTime getLocalTime(int columnIndex) throws SQLException {
        return ResultSetUtils.getLocalTime(resultSet, columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public LocalDateTime getLocalDateTime(String columnName) throws SQLException {
        return ResultSetUtils.getLocalDateTime(resultSet, columnName);
    }

    /** {@inheritDoc} */
    @Override
    public LocalDateTime getLocalDateTime(int columnIndex) throws SQLException {
        return ResultSetUtils.getLocalDateTime(resultSet, columnIndex);
    }

    /** {@inheritDoc} */
    public <T extends Enum<T>> T getEnumByName(String columnName, Class<T> enumType) throws SQLException {
        return ResultSetUtils.getEnumByName(resultSet, columnName, enumType);
    }

    /** {@inheritDoc} */
    @Override
    public <T extends Enum<T>> T getEnumByName(int columnIndex, Class<T> enumType) throws SQLException {
        return ResultSetUtils.getEnumByName(resultSet, columnIndex, enumType);
    }

    /** {@inheritDoc} */
    @Override
    public <T extends Enum<T>> T getEnumByOrdinal(String columnName, Class<T> enumType) throws SQLException {
        return ResultSetUtils.getEnumByOrdinal(resultSet, columnName, enumType);
    }

    /** {@inheritDoc} */
    @Override
    public <T extends Enum<T>> T getEnumByOrdinal(int columnIndex, Class<T> enumType) throws SQLException {
        return ResultSetUtils.getEnumByOrdinal(resultSet, columnIndex, enumType);
    }

    /** {@inheritDoc} */
    @Override
    public Optional<String> getOptionalString(int columnIndex) throws SQLException {
        return ResultSetUtils.getOptionalString(resultSet, columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public Optional<String> getOptionalString(String columnName) throws SQLException {
        return ResultSetUtils.getOptionalString(resultSet, columnName);
    }

    /** {@inheritDoc} */
    @Override
    public Optional<Boolean> getOptionalBoolean(int columnIndex) throws SQLException {
        return ResultSetUtils.getOptionalBoolean(resultSet, columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public Optional<Boolean> getOptionalBoolean(String columnName) throws SQLException {
        return ResultSetUtils.getOptionalBoolean(resultSet, columnName);
    }

    /** {@inheritDoc} */
    @Override
    public Optional<Byte> getOptionalByte(int columnIndex) throws SQLException {
        return ResultSetUtils.getOptionalByte(resultSet, columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public Optional<Byte> getOptionalByte(String columnName) throws SQLException {
        return ResultSetUtils.getOptionalByte(resultSet, columnName);
    }

    /** {@inheritDoc} */
    @Override
    public Optional<Short> getOptionalShort(int columnIndex) throws SQLException {
        return ResultSetUtils.getOptionalShort(resultSet, columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public Optional<Short> getOptionalShort(String columnName) throws SQLException {
        return ResultSetUtils.getOptionalShort(resultSet, columnName);
    }

    /** {@inheritDoc} */
    @Override
    public Optional<Integer> getOptionalInt(int columnIndex) throws SQLException {
        return ResultSetUtils.getOptionalInt(resultSet, columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public Optional<Integer> getOptionalInt(String columnName) throws SQLException {
        return ResultSetUtils.getOptionalInt(resultSet, columnName);
    }

    /** {@inheritDoc} */
    @Override
    public Optional<Long> getOptionalLong(int columnIndex) throws SQLException {
        return ResultSetUtils.getOptionalLong(resultSet, columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public Optional<Long> getOptionalLong(String columnName) throws SQLException {
        return ResultSetUtils.getOptionalLong(resultSet, columnName);
    }

    /** {@inheritDoc} */
    @Override
    public Optional<Float> getOptionalFloat(int columnIndex) throws SQLException {
        return ResultSetUtils.getOptionalFloat(resultSet, columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public Optional<Float> getOptionalFloat(String columnName) throws SQLException {
        return ResultSetUtils.getOptionalFloat(resultSet, columnName);
    }

    /** {@inheritDoc} */
    @Override
    public Optional<Double> getOptionalDouble(int columnIndex) throws SQLException {
        return ResultSetUtils.getOptionalDouble(resultSet, columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public Optional<Double> getOptionalDouble(String columnName) throws SQLException {
        return ResultSetUtils.getOptionalDouble(resultSet, columnName);
    }

    /** {@inheritDoc} */
    @Override
    public Optional<byte[]> getOptionalBytes(int columnIndex) throws SQLException {
        return Optional.ofNullable(getBytes(columnIndex));
    }

    /** {@inheritDoc} */
    @Override
    public Optional<byte[]> getOptionalBytes(String columnName) throws SQLException {
        return Optional.ofNullable(getBytes(columnName));
    }

    /** {@inheritDoc} */
    @Override
    public Optional<Date> getOptionalDate(int columnIndex) throws SQLException {
        return Optional.ofNullable(getDate(columnIndex));
    }

    /** {@inheritDoc} */
    @Override
    public Optional<Date> getOptionalDate(String columnName) throws SQLException {
        return Optional.ofNullable(getDate(columnName));
    }

    /** {@inheritDoc} */
    @Override
    public Optional<Time> getOptionalTime(int columnIndex) throws SQLException {
        return Optional.ofNullable(getTime(columnIndex));
    }

    /** {@inheritDoc} */
    @Override
    public Optional<Time> getOptionalTime(String columnName) throws SQLException {
        return Optional.ofNullable(getTime(columnName));
    }

    /** {@inheritDoc} */
    @Override
    public Optional<Timestamp> getOptionalTimestamp(int columnIndex) throws SQLException {
        return Optional.ofNullable(getTimestamp(columnIndex));
    }

    /** {@inheritDoc} */
    @Override
    public Optional<Timestamp> getOptionalTimestamp(String columnName) throws SQLException {
        return Optional.ofNullable(getTimestamp(columnName));
    }

    /** {@inheritDoc} */
    @Override
    public Optional<BigDecimal> getOptionalBigDecimal(int columnIndex) throws SQLException {
        return Optional.ofNullable(getBigDecimal(columnIndex));
    }

    /** {@inheritDoc} */
    @Override
    public Optional<BigDecimal> getOptionalBigDecimal(String columnName) throws SQLException {
        return Optional.ofNullable(getBigDecimal(columnName));
    }

    /** {@inheritDoc} */
    @Override
    public Optional<Ref> getOptionalRef(int columnIndex) throws SQLException {
        return Optional.ofNullable(getRef(columnIndex));
    }

    /** {@inheritDoc} */
    @Override
    public Optional<Ref> getOptionalRef(String columnName) throws SQLException {
        return Optional.ofNullable(getRef(columnName));
    }

    /** {@inheritDoc} */
    @Override
    public Optional<Blob> getOptionalBlob(int columnIndex) throws SQLException {
        return Optional.ofNullable(getBlob(columnIndex));
    }

    /** {@inheritDoc} */
    @Override
    public Optional<Blob> getOptionalBlob(String columnName) throws SQLException {
        return Optional.ofNullable(getBlob(columnName));
    }

    /** {@inheritDoc} */
    @Override
    public Optional<Clob> getOptionalClob(int columnIndex) throws SQLException {
        return Optional.ofNullable(getClob(columnIndex));
    }

    /** {@inheritDoc} */
    @Override
    public Optional<Clob> getOptionalClob(String columnName) throws SQLException {
        return Optional.ofNullable(getClob(columnName));
    }

    /** {@inheritDoc} */
    @Override
    public Optional<Array> getOptionalArray(int columnIndex) throws SQLException {
        return Optional.ofNullable(getArray(columnIndex));
    }

    /** {@inheritDoc} */
    @Override
    public Optional<Array> getOptionalArray(String columnName) throws SQLException {
        return Optional.ofNullable(getArray(columnName));
    }
}
