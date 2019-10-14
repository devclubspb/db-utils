package ru.spb.devclub.utils.db;

import org.springframework.jdbc.core.RowMapper;

import java.sql.SQLException;

/**
 * Extends {@link org.springframework.jdbc.core.RowMapper} interface.
 *
 * @author Grig Alex
 * @version 0.1.0
 * @see org.springframework.jdbc.core.RowMapper
 * @see ru.spb.devclub.utils.db.ExtendedResultSet
 * @since 0.1.0
 */
public interface ExtendedRowMapper<T, R extends ExtendedResultSet> extends RowMapper<T> {
    T mapRow(R resultSet, int i) throws SQLException;
}
