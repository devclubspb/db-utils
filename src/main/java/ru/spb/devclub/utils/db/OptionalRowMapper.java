package ru.spb.devclub.utils.db;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Extends {@link ru.spb.devclub.utils.db.ExtendedRowMapper} interface,
 * uses {@link ru.spb.devclub.utils.db.OptionalResultSet}.
 *
 * @author Grig Alex
 * @version 0.1.0
 * @see ru.spb.devclub.utils.db.ExtendedRowMapper
 * @see ru.spb.devclub.utils.db.OptionalResultSet
 * @since 0.1.0
 */
public interface OptionalRowMapper<T> extends ExtendedRowMapper<T, OptionalResultSet> {
    @Override
    default T mapRow(ResultSet resultSet, int i) throws SQLException {
        return mapRow(ResultSetUtils.optional(resultSet), i);
    }
}
