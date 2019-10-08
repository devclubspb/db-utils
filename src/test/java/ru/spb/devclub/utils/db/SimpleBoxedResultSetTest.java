package ru.spb.devclub.utils.db;

import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SimpleBoxedResultSetTest {
    @Test
    @SuppressWarnings("WrapperTypeMayBePrimitive")
    public void checkCorrectValueFromGetLongOrNullByColumnName() throws SQLException {
        Long expected = 40_000L;
        BoxedResultSet resultSet = ResultSetUtils.boxed(new AbstractResultSet() {
            @Override
            public long getLong(String ignored) {
                return expected;
            }
        });
        assertEquals(expected, resultSet.getLongOrNull("ignored"));
    }

    @Test
    public void checkNullValueFromGetLongOrNullByColumnName() throws SQLException {
        BoxedResultSet resultSet = ResultSetUtils.boxed(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        assertNull(resultSet.getLongOrNull("ignored"));
    }

    @Test
    @SuppressWarnings("WrapperTypeMayBePrimitive")
    public void checkCorrectValueFromGetLongOrNullByColumnIndex() throws SQLException {
        Long expected = 40_000L;
        BoxedResultSet resultSet = ResultSetUtils.boxed(new AbstractResultSet() {
            @Override
            public long getLong(int ignored) {
                return expected;
            }
        });
        assertEquals(expected, resultSet.getLongOrNull(0));
    }

    @Test
    public void checkNullValueFromGetLongOrNullByColumnIndex() throws SQLException {
        BoxedResultSet resultSet = ResultSetUtils.boxed(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        assertNull(resultSet.getLongOrNull(0));
    }
}