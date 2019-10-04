package ru.spb.devclub.utils.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.OptionalLong;

public interface SweetResultSet extends ResultSet {
    Long getLongOrNull(String columnName) throws SQLException;

    Long getLongOrDefault(String columnName, long defaultValue) throws SQLException;

    OptionalLong getOptionalLong(String columnName) throws SQLException;
}
