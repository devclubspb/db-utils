package ru.spb.devclub.utils.db;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Extends {@link ru.spb.devclub.utils.db.ExtendedRowMapper} interface,
 * uses {@link ru.spb.devclub.utils.db.BoxedResultSet}.
 *
 * @author Grig Alex
 * @version 0.1.0
 * @see ru.spb.devclub.utils.db.ExtendedRowMapper
 * @see ru.spb.devclub.utils.db.BoxedResultSet
 * @since 0.1.0
 */
public interface BoxedRowMapper<T> extends ExtendedRowMapper<T, BoxedResultSet> {
    @Override
    default T mapRow(ResultSet rs, int rowNum) throws SQLException {
        return mapRow(ResultSetUtils.boxed(rs), rowNum);
    }
}
