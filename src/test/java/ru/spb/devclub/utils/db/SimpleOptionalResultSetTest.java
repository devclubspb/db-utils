package ru.spb.devclub.utils.db;

import org.junit.Test;

import java.sql.SQLException;
import java.util.OptionalLong;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class SimpleOptionalResultSetTest {
    @Test
    public void checkCorrectValueFromGetOptionalLong() throws SQLException {
        long expected = 40_000L;
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public long getLong(String ignored) {
                return expected;
            }
        });
        OptionalLong optionalLong = resultSet.getOptionalLong("ignored");
        assertEquals(expected, optionalLong.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullValueFromGetOptionalLong() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        OptionalLong optionalLong = resultSet.getOptionalLong("ignored");
        assertFalse(optionalLong.isPresent());
    }
}