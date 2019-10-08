package ru.spb.devclub.utils.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.OptionalLong;

/**
 * Extends {@link java.sql.ResultSet} interface, adds methods using {@link java.util.Optional}.
 *
 * @author Grig Alex
 * @version 0.1.0
 * @see java.sql.ResultSet
 * @see java.util.Optional
 * @see java.util.OptionalLong
 * @since 0.1.0
 */
public interface OptionalResultSet extends ResultSet {
    OptionalLong getOptionalLong(String columnName) throws SQLException;

    OptionalLong getOptionalLong(int columnIndex) throws SQLException;
}
