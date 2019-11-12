package ru.spb.devclub.utils.db;

import org.junit.Test;
import org.mockito.Mockito;

import java.sql.SQLException;

import static org.junit.Assert.assertEquals;

public class ResultSetUtilsTest extends BaseResultSetMockTest {
    @Test
    public void checkExpectedValueFromGetByNameEnumByColumnName() throws SQLException {
        EntityType expected = EntityType.EASY;
        String columnLabel = "ignored";
        String enumName = expected.toString();
        Mockito.when(mockResultSet.getString(columnLabel)).thenReturn(enumName);
        EntityType actual = ResultSetUtils.getEnumByName(mockResultSet, columnLabel, EntityType.class);
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkExceptionFromGetByNameEnumByColumnName() throws SQLException {
        String columnLabel = "ignored";
        String enumName = "throws exception";
        Mockito.when(mockResultSet.getString(columnLabel)).thenReturn(enumName);
        ResultSetUtils.getEnumByName(mockResultSet, columnLabel, EntityType.class);
    }

    @Test
    public void checkExpectedValueFromGetByNameEnumByColumnIndex() throws SQLException {
        EntityType expected = EntityType.MEDIUM;
        int columnIndex = 0;
        String enumName = expected.toString();
        Mockito.when(mockResultSet.getString(columnIndex)).thenReturn(enumName);
        EntityType actual = ResultSetUtils.getEnumByName(mockResultSet, columnIndex, EntityType.class);
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkExceptionFromGetByNameEnumByColumnIndex() throws SQLException {
        int columnIndex = 0;
        String enumName = "throws exception";
        Mockito.when(mockResultSet.getString(columnIndex)).thenReturn(enumName);
        ResultSetUtils.getEnumByName(mockResultSet, columnIndex, EntityType.class);
    }

    @Test
    public void checkExpectedValueFromGetByOrdinalEnumByColumnName() throws SQLException {
        EntityType expected = EntityType.HARD;
        String columnLabel = "ignored";
        int enumOrdinal = expected.ordinal();
        Mockito.when(mockResultSet.getInt(columnLabel)).thenReturn(enumOrdinal);
        EntityType actual = ResultSetUtils.getEnumByOrdinal(mockResultSet, columnLabel, EntityType.class);
        assertEquals(expected, actual);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void checkExceptionFromGetByOrdinalEnumByColumnName() throws SQLException {
        String columnLabel = "ignored";
        int enumOrdinal = EntityType.values().length;
        Mockito.when(mockResultSet.getInt(columnLabel)).thenReturn(enumOrdinal);
        ResultSetUtils.getEnumByOrdinal(mockResultSet, columnLabel, EntityType.class);
    }

    @Test
    public void checkExpectedValueFromGetByOrdinalEnumByColumnIndex() throws SQLException {
        EntityType expected = EntityType.EASY;
        int columnIndex = 0;
        int enumOrdinal = expected.ordinal();
        Mockito.when(mockResultSet.getInt(columnIndex)).thenReturn(enumOrdinal);
        EntityType actual = ResultSetUtils.getEnumByOrdinal(mockResultSet, columnIndex, EntityType.class);
        assertEquals(expected, actual);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void checkExceptionFromGetByOrdinalEnumByColumnIndex() throws SQLException {
        int columnIndex = 0;
        int enumOrdinal = EntityType.values().length;
        Mockito.when(mockResultSet.getInt(columnIndex)).thenReturn(enumOrdinal);
        ResultSetUtils.getEnumByOrdinal(mockResultSet, columnIndex, EntityType.class);
    }
}