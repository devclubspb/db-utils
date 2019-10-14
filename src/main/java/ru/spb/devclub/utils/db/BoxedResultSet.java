package ru.spb.devclub.utils.db;

import java.sql.SQLException;

/**
 * Extends {@link ru.spb.devclub.utils.db.ExtendedResultSet} interface, adds boxed types usage methods.
 *
 * @author vechis, Grig Alex
 * @version 0.1.0
 * @see ru.spb.devclub.utils.db.ExtendedResultSet
 * @since 0.1.0
 */
public interface BoxedResultSet extends ExtendedResultSet {
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
}
