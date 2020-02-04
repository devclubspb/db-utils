package ru.spb.devclub.utils.db;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The Spring-Jdbc RowMapper interface adapter
 * for using {@link ru.spb.devclub.utils.db.ExtendedRowMapper}.
 *
 * @author Grig Alex
 * @version 0.3.0
 * @see ru.spb.devclub.utils.db.ExtendedRowMapper
 * @since 0.3.0
 */
public abstract class SpringRowMapper<T> implements ExtendedRowMapper<T> {
    /**
     * {@inheritDoc}
     */
    public T mapRow(ResultSet rs, int rowNum) throws SQLException {
        return mapRow(ResultSetUtils.extended(rs), rowNum);
    }
}
