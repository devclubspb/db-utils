package ru.spb.devclub.utils.db;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;

public interface BoxedResultSet extends ResultSet {
    <T extends Enum<T>> T getEnumValue(String columnName, T[] enumItems) throws SQLException;

    <T extends Enum<T>> T getEnumValue(int columnIndex, T[] enumItems) throws SQLException;

    Long getLongOrNull(String columnName) throws SQLException;

    Long getLongOrNull(int columnIndex) throws SQLException;

    Integer getIntOrNull(String columnName) throws SQLException;

    Integer getIntOrNull(int columnIndex) throws SQLException;

    Boolean getBooleanOrNull(String columnName) throws SQLException;

    Boolean getBooleanOrNull(int columnIndex) throws SQLException;

    Timestamp getTimestampOrNull(String columnName) throws SQLException;

    Timestamp getTimestampOrNull(int columnIndex) throws SQLException;

    Date getDateOrNull(String columnName) throws SQLException;

    Date getDateOrNull(int columnIndex) throws SQLException;

    String getDateStringOrNull(String columnName, DateFormat dateFormat) throws SQLException;

    String getDateStringOrNull(int columnIndex, DateFormat dateFormat) throws SQLException;
}
