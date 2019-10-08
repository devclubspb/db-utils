package ru.spb.devclub.utils.db;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface BoxedResultSet extends ResultSet {
    Long getLongOrNull(String columnName) throws SQLException;

    Long getLongOrNull(int columnIndex) throws SQLException;
}
