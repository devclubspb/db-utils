package ru.spb.devclub.utils.db;

import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class DearSweetResultSetTest {
    @Test
    @SuppressWarnings("WrapperTypeMayBePrimitive")
    public void checkCorrectGetLongOrNullWithValue() throws SQLException {
        Long expected = 40_000L;
        DearSweetResultSet resultSet = new DearSweetResultSet(new AbstractResultSet() {
            @Override
            public long getLong(String columnLabel) {
                return expected;
            }
        });
        assertEquals(expected, resultSet.getLongOrNull("ignored"));
    }

    @Test
    public void checkGetLongOrNullWithNull() throws SQLException {
        DearSweetResultSet resultSet = new DearSweetResultSet(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        assertNull(resultSet.getLongOrNull("ignored"));
    }

    @Test
    @SuppressWarnings("WrapperTypeMayBePrimitive")
    public void checkGetLongOrDefaultWithValue() throws SQLException {
        Long expected = 40_000L;
        DearSweetResultSet resultSet = new DearSweetResultSet(new AbstractResultSet() {
            @Override
            public long getLong(String columnLabel) {
                return expected;
            }
        });
        assertEquals(expected, resultSet.getLongOrDefault("ignored", -1));
    }

    @Test
    @SuppressWarnings("WrapperTypeMayBePrimitive")
    public void checkGetLongOrDefaultWithNull() throws SQLException {
        Long expected = 40_000L;
        DearSweetResultSet resultSet = new DearSweetResultSet(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        assertEquals(expected, resultSet.getLongOrDefault("ignored", expected));
    }

    @Test
    public void checkGetOptionalLongWithValue() throws SQLException {
        long expected = 40_000L;
        DearSweetResultSet resultSet = new DearSweetResultSet(new AbstractResultSet() {
            @Override
            public long getLong(String columnLabel) {
                return expected;
            }
        });
        assertEquals(expected, resultSet.getOptionalLong("ignored").orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkGetOptionalLongWithNull() throws SQLException {
        DearSweetResultSet resultSet = new DearSweetResultSet(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        assertFalse(resultSet.getOptionalLong("ignored").isPresent());
    }
}