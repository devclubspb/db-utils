package ru.spb.devclub.utils.db;

import java.sql.SQLException;

/**
 * The Spring-Jdbc RowMapper interface
 * with using {@link ru.spb.devclub.utils.db.ExtendedResultSet}.
 *
 * @author Grig Alex
 * @author Yagnyshev Gordey
 * @version 0.3.0
 * @see ru.spb.devclub.utils.db.ExtendedResultSet
 * @since 0.1.0
 */
@FunctionalInterface
public interface ExtendedRowMapper<T> {
    /**
     * {@inheritDoc}
     *
     * @param rs     a {@link ru.spb.devclub.utils.db.ExtendedResultSet} object.
     * @param rowNum a int.
     * @return a T object.
     * @throws java.sql.SQLException if any.
     */
    T mapRow(ExtendedResultSet rs, int rowNum) throws SQLException;
}
