package ru.spb.devclub.utils.db;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface BoxedResultSet extends ResultSet {
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
