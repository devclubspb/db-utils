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
    /**
     * <p>getLongOrNull.</p>
     *
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.lang.Long} object.
     * @throws java.sql.SQLException if any.
     * @since 0.2.0
     */
    Long getLongOrNull(String columnName) throws SQLException;

    /**
     * <p>getLongOrNull.</p>
     *
     * @param columnIndex a int.
     * @return a {@link java.lang.Long} object.
     * @throws java.sql.SQLException if any.
     * @since 0.2.0
     */
    Long getLongOrNull(int columnIndex) throws SQLException;

    /**
     * <p>getIntOrNull.</p>
     *
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.lang.Integer} object.
     * @throws java.sql.SQLException if any.
     * @since 0.2.0
     */
    Integer getIntOrNull(String columnName) throws SQLException;

    /**
     * <p>getIntOrNull.</p>
     *
     * @param columnIndex a int.
     * @return a {@link java.lang.Integer} object.
     * @throws java.sql.SQLException if any.
     * @since 0.2.0
     */
    Integer getIntOrNull(int columnIndex) throws SQLException;

    /**
     * <p>getBooleanOrNull.</p>
     *
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.lang.Boolean} object.
     * @throws java.sql.SQLException if any.
     * @since 0.2.0
     */
    Boolean getBooleanOrNull(String columnName) throws SQLException;

    /**
     * <p>getBooleanOrNull.</p>
     *
     * @param columnIndex a int.
     * @return a {@link java.lang.Boolean} object.
     * @throws java.sql.SQLException if any.
     * @since 0.2.0
     */
    Boolean getBooleanOrNull(int columnIndex) throws SQLException;

    /**
     * <p>getShortOrNull.</p>
     *
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.lang.Short} object.
     * @throws java.sql.SQLException if any.
     * @since 0.2.0
     */
    Short getShortOrNull(String columnName) throws SQLException;

    /**
     * <p>getShortOrNull.</p>
     *
     * @param columnIndex a int.
     * @return a {@link java.lang.Short} object.
     * @throws java.sql.SQLException if any.
     * @since 0.2.0
     */
    Short getShortOrNull(int columnIndex) throws SQLException;

    /**
     * <p>getByteOrNull.</p>
     *
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.lang.Byte} object.
     * @throws java.sql.SQLException if any.
     * @since 0.2.0
     */
    Byte getByteOrNull(String columnName) throws SQLException;

    /**
     * <p>getByteOrNull.</p>
     *
     * @param columnIndex a int.
     * @return a {@link java.lang.Byte} object.
     * @throws java.sql.SQLException if any.
     * @since 0.2.0
     */
    Byte getByteOrNull(int columnIndex) throws SQLException;

    /**
     * <p>getDoubleOrNull.</p>
     *
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.lang.Double} object.
     * @throws java.sql.SQLException if any.
     * @since 0.2.0
     */
    Double getDoubleOrNull(String columnName) throws SQLException;

    /**
     * <p>getDoubleOrNull.</p>
     *
     * @param columnIndex a int.
     * @return a {@link java.lang.Double} object.
     * @throws java.sql.SQLException if any.
     * @since 0.2.0
     */
    Double getDoubleOrNull(int columnIndex) throws SQLException;

    /**
     * <p>getFloatOrNull.</p>
     *
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.lang.Float} object.
     * @throws java.sql.SQLException if any.
     * @since 0.2.0
     */
    Float getFloatOrNull(String columnName) throws SQLException;

    /**
     * <p>getFloatOrNull.</p>
     *
     * @param columnIndex a int.
     * @return a {@link java.lang.Float} object.
     * @throws java.sql.SQLException if any.
     * @since 0.2.0
     */
    Float getFloatOrNull(int columnIndex) throws SQLException;

    /**
     * <p>getLocalDate.</p>
     *
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.time.LocalDate} object.
     * @throws java.sql.SQLException if any.
     * @since 0.2.0
     */
    LocalDate getLocalDate(String columnName) throws SQLException;

    /**
     * <p>getLocalDate.</p>
     *
     * @param columnIndex a int.
     * @return a {@link java.time.LocalDate} object.
     * @throws java.sql.SQLException if any.
     * @since 0.2.0
     */
    LocalDate getLocalDate(int columnIndex) throws SQLException;

    /**
     * <p>getLocalTime.</p>
     *
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.time.LocalTime} object.
     * @throws java.sql.SQLException if any.
     * @since 0.2.0
     */
    LocalTime getLocalTime(String columnName) throws SQLException;

    /**
     * <p>getLocalTime.</p>
     *
     * @param columnIndex a int.
     * @return a {@link java.time.LocalTime} object.
     * @throws java.sql.SQLException if any.
     * @since 0.2.0
     */
    LocalTime getLocalTime(int columnIndex) throws SQLException;

    /**
     * <p>getLocalDateTime.</p>
     *
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.time.LocalDateTime} object.
     * @throws java.sql.SQLException if any.
     * @since 0.2.0
     */
    LocalDateTime getLocalDateTime(String columnName) throws SQLException;

    /**
     * <p>getLocalDateTime.</p>
     *
     * @param columnIndex a int.
     * @return a {@link java.time.LocalDateTime} object.
     * @throws java.sql.SQLException if any.
     * @since 0.2.0
     */
    LocalDateTime getLocalDateTime(int columnIndex) throws SQLException;

    /**
     * <p>getEnumByName.</p>
     *
     * @param columnName a {@link java.lang.String} object.
     * @param enumType   a {@link java.lang.Class} object.
     * @param <T>        a T object.
     * @return a T object.
     * @throws java.sql.SQLException if any.
     */
    <T extends Enum<T>> T getEnumByName(String columnName, Class<T> enumType) throws SQLException;

    /**
     * <p>getEnumByName.</p>
     *
     * @param columnIndex a int.
     * @param enumType    a {@link java.lang.Class} object.
     * @return a T object.
     * @param <T> a T object.
     * @throws java.sql.SQLException if any.
     */
    <T extends Enum<T>> T getEnumByName(int columnIndex, Class<T> enumType) throws SQLException;

    /**
     * <p>getEnumByOrdinal.</p>
     *
     * @param columnName a {@link java.lang.String} object.
     * @param enumType   a {@link java.lang.Class} object.
     * @return a T object.
     * @param <T> a T object.
     * @throws java.sql.SQLException if any.
     */
    <T extends Enum<T>> T getEnumByOrdinal(String columnName, Class<T> enumType) throws SQLException;

    /**
     * <p>getEnumByOrdinal.</p>
     *
     * @param columnIndex a int.
     * @param enumType    a {@link java.lang.Class} object.
     * @return a T object.
     * @param <T> a T object.
     * @throws java.sql.SQLException if any.
     */
    <T extends Enum<T>> T getEnumByOrdinal(int columnIndex, Class<T> enumType) throws SQLException;

    /**
     * <p>getOptionalString.</p>
     *
     * @param columnIndex a int.
     * @return a {@link java.util.Optional} object.
     * @since 0.2.0
     * @throws java.sql.SQLException if any.
     */
    Optional<String> getOptionalString(int columnIndex) throws SQLException;

    /**
     * <p>getOptionalString.</p>
     *
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.util.Optional} object.
     * @since 0.2.0
     * @throws java.sql.SQLException if any.
     */
    Optional<String> getOptionalString(String columnName) throws SQLException;

    /**
     * <p>getOptionalBoolean.</p>
     *
     * @param columnIndex a int.
     * @return a {@link java.util.Optional} object.
     * @since 0.2.0
     * @throws java.sql.SQLException if any.
     */
    Optional<Boolean> getOptionalBoolean(int columnIndex) throws SQLException;

    /**
     * <p>getOptionalBoolean.</p>
     *
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.util.Optional} object.
     * @since 0.2.0
     * @throws java.sql.SQLException if any.
     */
    Optional<Boolean> getOptionalBoolean(String columnName) throws SQLException;

    /**
     * <p>getOptionalByte.</p>
     *
     * @param columnIndex a int.
     * @return a {@link java.util.Optional} object.
     * @since 0.2.0
     * @throws java.sql.SQLException if any.
     */
    Optional<Byte> getOptionalByte(int columnIndex) throws SQLException;

    /**
     * <p>getOptionalByte.</p>
     *
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.util.Optional} object.
     * @since 0.2.0
     * @throws java.sql.SQLException if any.
     */
    Optional<Byte> getOptionalByte(String columnName) throws SQLException;

    /**
     * <p>getOptionalShort.</p>
     *
     * @param columnIndex a int.
     * @return a {@link java.util.Optional} object.
     * @since 0.2.0
     * @throws java.sql.SQLException if any.
     */
    Optional<Short> getOptionalShort(int columnIndex) throws SQLException;

    /**
     * <p>getOptionalShort.</p>
     *
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.util.Optional} object.
     * @since 0.2.0
     * @throws java.sql.SQLException if any.
     */
    Optional<Short> getOptionalShort(String columnName) throws SQLException;

    /**
     * <p>getOptionalInt.</p>
     *
     * @param columnIndex a int.
     * @return a {@link java.util.Optional} object.
     * @since 0.2.0
     * @throws java.sql.SQLException if any.
     */
    Optional<Integer> getOptionalInt(int columnIndex) throws SQLException;

    /**
     * <p>getOptionalInt.</p>
     *
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.util.Optional} object.
     * @since 0.2.0
     * @throws java.sql.SQLException if any.
     */
    Optional<Integer> getOptionalInt(String columnName) throws SQLException;

    /**
     * <p>getOptionalLong.</p>
     *
     * @param columnIndex a int.
     * @return a {@link java.util.Optional} object.
     * @since 0.2.0
     * @throws java.sql.SQLException if any.
     */
    Optional<Long> getOptionalLong(int columnIndex) throws SQLException;

    /**
     * <p>getOptionalLong.</p>
     *
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.util.Optional} object.
     * @since 0.2.0
     * @throws java.sql.SQLException if any.
     */
    Optional<Long> getOptionalLong(String columnName) throws SQLException;

    /**
     * <p>getOptionalFloat.</p>
     *
     * @param columnIndex a int.
     * @return a {@link java.util.Optional} object.
     * @since 0.2.0
     * @throws java.sql.SQLException if any.
     */
    Optional<Float> getOptionalFloat(int columnIndex) throws SQLException;

    /**
     * <p>getOptionalFloat.</p>
     *
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.util.Optional} object.
     * @since 0.2.0
     * @throws java.sql.SQLException if any.
     */
    Optional<Float> getOptionalFloat(String columnName) throws SQLException;

    /**
     * <p>getOptionalDouble.</p>
     *
     * @param columnIndex a int.
     * @return a {@link java.util.Optional} object.
     * @since 0.2.0
     * @throws java.sql.SQLException if any.
     */
    Optional<Double> getOptionalDouble(int columnIndex) throws SQLException;

    /**
     * <p>getOptionalDouble.</p>
     *
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.util.Optional} object.
     * @since 0.2.0
     * @throws java.sql.SQLException if any.
     */
    Optional<Double> getOptionalDouble(String columnName) throws SQLException;

    /**
     * <p>getOptionalBytes.</p>
     *
     * @param columnIndex a int.
     * @return a {@link java.util.Optional} object.
     * @since 0.2.0
     * @throws java.sql.SQLException if any.
     */
    Optional<byte[]> getOptionalBytes(int columnIndex) throws SQLException;

    /**
     * <p>getOptionalBytes.</p>
     *
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.util.Optional} object.
     * @since 0.2.0
     * @throws java.sql.SQLException if any.
     */
    Optional<byte[]> getOptionalBytes(String columnName) throws SQLException;

    /**
     * <p>getOptionalDate.</p>
     *
     * @param columnIndex a int.
     * @return a {@link java.util.Optional} object.
     * @since 0.2.0
     * @throws java.sql.SQLException if any.
     */
    Optional<Date> getOptionalDate(int columnIndex) throws SQLException;

    /**
     * <p>getOptionalDate.</p>
     *
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.util.Optional} object.
     * @since 0.2.0
     * @throws java.sql.SQLException if any.
     */
    Optional<Date> getOptionalDate(String columnName) throws SQLException;

    /**
     * <p>getOptionalTime.</p>
     *
     * @param columnIndex a int.
     * @return a {@link java.util.Optional} object.
     * @since 0.2.0
     * @throws java.sql.SQLException if any.
     */
    Optional<Time> getOptionalTime(int columnIndex) throws SQLException;

    /**
     * <p>getOptionalTime.</p>
     *
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.util.Optional} object.
     * @since 0.2.0
     * @throws java.sql.SQLException if any.
     */
    Optional<Time> getOptionalTime(String columnName) throws SQLException;

    /**
     * <p>getOptionalTimestamp.</p>
     *
     * @param columnIndex a int.
     * @return a {@link java.util.Optional} object.
     * @since 0.2.0
     * @throws java.sql.SQLException if any.
     */
    Optional<Timestamp> getOptionalTimestamp(int columnIndex) throws SQLException;

    /**
     * <p>getOptionalTimestamp.</p>
     *
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.util.Optional} object.
     * @since 0.2.0
     * @throws java.sql.SQLException if any.
     */
    Optional<Timestamp> getOptionalTimestamp(String columnName) throws SQLException;

    /**
     * <p>getOptionalBigDecimal.</p>
     *
     * @param columnIndex a int.
     * @return a {@link java.util.Optional} object.
     * @since 0.2.0
     * @throws java.sql.SQLException if any.
     */
    Optional<BigDecimal> getOptionalBigDecimal(int columnIndex) throws SQLException;

    /**
     * <p>getOptionalBigDecimal.</p>
     *
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.util.Optional} object.
     * @since 0.2.0
     * @throws java.sql.SQLException if any.
     */
    Optional<BigDecimal> getOptionalBigDecimal(String columnName) throws SQLException;

    /**
     * <p>getOptionalRef.</p>
     *
     * @param columnIndex a int.
     * @return a {@link java.util.Optional} object.
     * @since 0.2.0
     * @throws java.sql.SQLException if any.
     */
    Optional<Ref> getOptionalRef(int columnIndex) throws SQLException;

    /**
     * <p>getOptionalRef.</p>
     *
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.util.Optional} object.
     * @since 0.2.0
     * @throws java.sql.SQLException if any.
     */
    Optional<Ref> getOptionalRef(String columnName) throws SQLException;

    /**
     * <p>getOptionalBlob.</p>
     *
     * @param columnIndex a int.
     * @return a {@link java.util.Optional} object.
     * @since 0.2.0
     * @throws java.sql.SQLException if any.
     */
    Optional<Blob> getOptionalBlob(int columnIndex) throws SQLException;

    /**
     * <p>getOptionalBlob.</p>
     *
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.util.Optional} object.
     * @since 0.2.0
     * @throws java.sql.SQLException if any.
     */
    Optional<Blob> getOptionalBlob(String columnName) throws SQLException;

    /**
     * <p>getOptionalClob.</p>
     *
     * @param columnIndex a int.
     * @return a {@link java.util.Optional} object.
     * @since 0.2.0
     * @throws java.sql.SQLException if any.
     */
    Optional<Clob> getOptionalClob(int columnIndex) throws SQLException;

    /**
     * <p>getOptionalClob.</p>
     *
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.util.Optional} object.
     * @since 0.2.0
     * @throws java.sql.SQLException if any.
     */
    Optional<Clob> getOptionalClob(String columnName) throws SQLException;

    /**
     * <p>getOptionalArray.</p>
     *
     * @param columnIndex a int.
     * @return a {@link java.util.Optional} object.
     * @since 0.2.0
     * @throws java.sql.SQLException if any.
     */
    Optional<Array> getOptionalArray(int columnIndex) throws SQLException;

    /**
     * <p>getOptionalArray.</p>
     *
     * @param columnName a {@link java.lang.String} object.
     * @return a {@link java.util.Optional} object.
     * @since 0.2.0
     * @throws java.sql.SQLException if any.
     */
    Optional<Array> getOptionalArray(String columnName) throws SQLException;
}
