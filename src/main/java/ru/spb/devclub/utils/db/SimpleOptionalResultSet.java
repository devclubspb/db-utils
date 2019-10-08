package ru.spb.devclub.utils.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.OptionalLong;

/**
 * The simple implementation of {@link ru.spb.devclub.utils.db.OptionalResultSet}.
 *
 * @author Grig Alex
 * @version 0.1.0
 * @see ru.spb.devclub.utils.db.OptionalResultSet
 * @see ru.spb.devclub.utils.db.ProxyResultSet
 * @since 0.1.0
 */
/* package */class SimpleOptionalResultSet extends ProxyResultSet implements OptionalResultSet {
    protected SimpleOptionalResultSet(ResultSet resultSet) {
        super(resultSet);
    }

    @Override
    public OptionalLong getOptionalLong(String columnName) throws SQLException {
        long value = resultSet.getLong(columnName);
        return resultSet.wasNull() ? OptionalLong.empty() : OptionalLong.of(value);
    }

    @Override
    public OptionalLong getOptionalLong(int columnIndex) throws SQLException {
        long value = resultSet.getLong(columnIndex);
        return resultSet.wasNull() ? OptionalLong.empty() : OptionalLong.of(value);
    }
}
