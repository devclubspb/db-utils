package ru.spb.devclub.utils.db;

import java.math.BigDecimal;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Optional;

/**
 * Extends {@link java.sql.ResultSet} interface.
 *
 * @author Grig Alex, Yagnyshev Gordey
 * @version 0.2.0
 * @see java.sql.ResultSet
 * @since 0.1.0
 */
public interface ExtendedResultSet extends ResultSet {
    Long getLongOrNull(String columnName) throws SQLException;

    Long getLongOrNull(int columnIndex) throws SQLException;

    Integer getIntOrNull(String columnName) throws SQLException;

    Integer getIntOrNull(int columnIndex) throws SQLException;

    Boolean getBooleanOrNull(String columnName) throws SQLException;

    Boolean getBooleanOrNull(int columnIndex) throws SQLException;

    Short getShortOrNull(String columnName) throws SQLException;

    Short getShortOrNull(int columnIndex) throws SQLException;

    Byte getByteOrNull(String columnName) throws SQLException;

    Byte getByteOrNull(int columnIndex) throws SQLException;

    Double getDoubleOrNull(String columnName) throws SQLException;

    Double getDoubleOrNull(int columnIndex) throws SQLException;

    Float getFloatOrNull(String columnName) throws SQLException;

    Float getFloatOrNull(int columnIndex) throws SQLException;

    LocalDate getLocalDate(String columnName) throws SQLException;

    LocalDate getLocalDate(int columnIndex) throws SQLException;

    LocalTime getLocalTime(String columnName) throws SQLException;

    LocalTime getLocalTime(int columnIndex) throws SQLException;

    LocalDateTime getLocalDateTime(String columnName) throws SQLException;

    LocalDateTime getLocalDateTime(int columnIndex) throws SQLException;

    <T extends Enum<T>> T getEnumByName(String columnName, Class<T> enumType) throws SQLException;

    <T extends Enum<T>> T getEnumByName(int columnIndex, Class<T> enumType) throws SQLException;

    <T extends Enum<T>> T getEnumByOrdinal(String columnName, Class<T> enumType) throws SQLException;

    <T extends Enum<T>> T getEnumByOrdinal(int columnIndex, Class<T> enumType) throws SQLException;

    Optional<String> getOptionalString(int columnIndex) throws SQLException;

    Optional<String> getOptionalString(String columnName) throws SQLException;

    Optional<Boolean> getOptionalBoolean(int columnIndex) throws SQLException;

    Optional<Boolean> getOptionalBoolean(String columnName) throws SQLException;

    Optional<Byte> getOptionalByte(int columnIndex) throws SQLException;

    Optional<Byte> getOptionalByte(String columnName) throws SQLException;

    Optional<Short> getOptionalShort(int columnIndex) throws SQLException;

    Optional<Short> getOptionalShort(String columnName) throws SQLException;

    Optional<Integer> getOptionalInt(int columnIndex) throws SQLException;

    Optional<Integer> getOptionalInt(String columnName) throws SQLException;

    Optional<Long> getOptionalLong(int columnIndex) throws SQLException;

    Optional<Long> getOptionalLong(String columnName) throws SQLException;

    Optional<Float> getOptionalFloat(int columnIndex) throws SQLException;

    Optional<Float> getOptionalFloat(String columnName) throws SQLException;

    Optional<Double> getOptionalDouble(int columnIndex) throws SQLException;

    Optional<Double> getOptionalDouble(String columnName) throws SQLException;

    Optional<byte[]> getOptionalBytes(int columnIndex) throws SQLException;

    Optional<byte[]> getOptionalBytes(String columnName) throws SQLException;

    Optional<Date> getOptionalDate(int columnIndex) throws SQLException;

    Optional<Date> getOptionalDate(String columnName) throws SQLException;

    Optional<Time> getOptionalTime(int columnIndex) throws SQLException;

    Optional<Time> getOptionalTime(String columnName) throws SQLException;

    Optional<Timestamp> getOptionalTimestamp(int columnIndex) throws SQLException;

    Optional<Timestamp> getOptionalTimestamp(String columnName) throws SQLException;

    Optional<BigDecimal> getOptionalBigDecimal(int columnIndex) throws SQLException;

    Optional<BigDecimal> getOptionalBigDecimal(String columnName) throws SQLException;

    Optional<Ref> getOptionalRef(int columnIndex) throws SQLException;

    Optional<Ref> getOptionalRef(String columnName) throws SQLException;

    Optional<Blob> getOptionalBlob(int columnIndex) throws SQLException;

    Optional<Blob> getOptionalBlob(String columnName) throws SQLException;

    Optional<Clob> getOptionalClob(int columnIndex) throws SQLException;

    Optional<Clob> getOptionalClob(String columnName) throws SQLException;

    Optional<Array> getOptionalArray(int columnIndex) throws SQLException;

    Optional<Array> getOptionalArray(String columnName) throws SQLException;
}
