package ru.spb.devclub.utils.db;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Extends {@link org.springframework.jdbc.core.RowMapper} interface.
 *
 * @author Grig Alex, Yagnyshev Gordey
 * @version 0.2.0
 * @see org.springframework.jdbc.core.RowMapper
 * @see ru.spb.devclub.utils.db.ExtendedResultSet
 * @since 0.1.0
 */
public interface ExtendedRowMapper<T> extends RowMapper<T> {
    T mapRow(ExtendedResultSet rs, int rowNum) throws SQLException;

    @Override
    default T mapRow(ResultSet rs, int rowNum) throws SQLException {
        return mapRow(ResultSetUtils.extended(rs), rowNum);
    }
}
