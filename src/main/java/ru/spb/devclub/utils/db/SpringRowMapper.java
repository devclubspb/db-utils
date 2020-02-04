package ru.spb.devclub.utils.db;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The {@link org.springframework.jdbc.core.RowMapper} interface adapter
 * for using {@link ru.spb.devclub.utils.db.ExtendedRowMapper}.
 *
 * @author Grig Alex
 * @version 0.3.0
 * @see ru.spb.devclub.utils.db.ExtendedRowMapper
 * @see org.springframework.jdbc.core.RowMapper
 * @since 0.3.0
 */
public abstract class SpringRowMapper<T> implements ExtendedRowMapper<T> {
    /**
     * {@link org.springframework.jdbc.core.RowMapper#mapRow(ResultSet, int)}
     */
    public T mapRow(ResultSet rs, int rowNum) throws SQLException {
        return mapRow(ResultSetUtils.extended(rs), rowNum);
    }
}
