package ru.spb.devclub.utils.db;

import java.sql.SQLException;

/**
 * The {@link org.springframework.jdbc.core.RowMapper} interface
 * with using {@link ru.spb.devclub.utils.db.ExtendedResultSet}.
 *
 * @author Grig Alex
 * @author Yagnyshev Gordey
 * @version 0.3.0
 * @see ru.spb.devclub.utils.db.ExtendedResultSet
 * @see org.springframework.jdbc.core.RowMapper
 * @since 0.1.0
 */
@FunctionalInterface
public interface ExtendedRowMapper<T> {
    /**
     * {@inheritDoc}
     */
    T mapRow(ExtendedResultSet rs, int rowNum) throws SQLException;
}
