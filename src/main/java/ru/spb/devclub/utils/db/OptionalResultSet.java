package ru.spb.devclub.utils.db;

import java.math.BigDecimal;
import java.sql.*;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

/**
 * Extends {@link java.sql.ResultSet} interface, adds methods using {@link java.util.Optional}.
 *
 * @author Grig Alex
 * @version 0.1.0
 * @see java.sql.ResultSet
 * @see java.util.Optional
 * @see java.util.OptionalDouble
 * @see java.util.OptionalInt;
 * @see java.util.OptionalLong
 * @since 0.1.0
 */
public interface OptionalResultSet extends ResultSet {
    Optional<String> getOptionalString(int columnIndex) throws SQLException;

    Optional<Boolean> getOptionalBoolean(int columnIndex) throws SQLException;

    Optional<Byte> getOptionalByte(int columnIndex) throws SQLException;

    Optional<Short> getOptionalShort(int columnIndex) throws SQLException;

    OptionalInt getOptionalInt(int columnIndex) throws SQLException;

    OptionalLong getOptionalLong(String columnName) throws SQLException;

    OptionalLong getOptionalLong(int columnIndex) throws SQLException;

    Optional<Float> getOptionalFloat(int columnIndex) throws SQLException;

    OptionalDouble getOptionalDouble(int columnIndex) throws SQLException;

    Optional<byte[]> getOptionalBytes(int columnIndex) throws SQLException;

    Optional<Date> getOptionalDate(int columnIndex) throws SQLException;

    Optional<Time> getOptionalTime(int columnIndex) throws SQLException;

    Optional<Timestamp> getOptionalTimestamp(int columnIndex) throws SQLException;

    Optional<BigDecimal> getOptionalBigDecimal(int columnIndex) throws SQLException;

    Optional<Ref> getOptionalRef(int columnIndex) throws SQLException;

    Optional<Blob> getOptionalBlob(int columnIndex) throws SQLException;

    Optional<Clob> getOptionalClob(int columnIndex) throws SQLException;

    Optional<Array> getOptionalArray(int columnIndex) throws SQLException;
}
