package ru.spb.devclub.utils.db;

import org.junit.Test;
import org.mockito.Mockito;
import ru.spb.devclub.utils.db.entity.EntityType;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

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

    @Test
    public void checkExpectedValueFromGetLocalDateByColumnName() throws SQLException {
        String columnName = "ignored";
        LocalDate expected = LocalDate.of(2019, 11, 11);
        Mockito.when(mockResultSet.getDate(columnName)).thenReturn(Date.valueOf(expected));
        LocalDate actual = ResultSetUtils.getLocalDate(mockResultSet, columnName);
        assertEquals(expected, actual);
    }

    @Test
    public void checkNullFromGetLocalDateByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.getDate(columnName)).thenReturn(null);
        LocalDate actual = ResultSetUtils.getLocalDate(mockResultSet, columnName);
        assertNull(actual);
    }

    @Test
    public void checkExpectedValueFromGetLocalDateByColumnIndex() throws SQLException {
        int columnIndex = 0;
        LocalDate expected = LocalDate.of(2019, 11, 11);
        Mockito.when(mockResultSet.getDate(columnIndex)).thenReturn(Date.valueOf(expected));
        LocalDate actual = ResultSetUtils.getLocalDate(mockResultSet, columnIndex);
        assertEquals(expected, actual);
    }

    @Test
    public void checkNullFromGetLocalDateByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.getDate(columnIndex)).thenReturn(null);
        LocalDate actual = ResultSetUtils.getLocalDate(mockResultSet, columnIndex);
        assertNull(actual);
    }

    @Test
    public void checkExpectedValueFromGetLocalTimeByColumnName() throws SQLException {
        String columnName = "ignored";
        LocalTime expected = LocalTime.of(20, 20);
        Mockito.when(mockResultSet.getTime(columnName)).thenReturn(Time.valueOf(expected));
        LocalTime actual = ResultSetUtils.getLocalTime(mockResultSet, columnName);
        assertEquals(expected, actual);
    }

    @Test
    public void checkNullFromGetLocalTimeByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.getTime(columnName)).thenReturn(null);
        LocalTime actual = ResultSetUtils.getLocalTime(mockResultSet, columnName);
        assertNull(actual);
    }

    @Test
    public void checkExpectedValueFromGetLocalTimeByColumnIndex() throws SQLException {
        int columnIndex = 0;
        LocalTime expected = LocalTime.of(20, 20);
        Mockito.when(mockResultSet.getTime(columnIndex)).thenReturn(Time.valueOf(expected));
        LocalTime actual = ResultSetUtils.getLocalTime(mockResultSet, columnIndex);
        assertEquals(expected, actual);
    }

    @Test
    public void checkNullFromGetLocalTimeByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.getTime(columnIndex)).thenReturn(null);
        LocalTime actual = ResultSetUtils.getLocalTime(mockResultSet, columnIndex);
        assertNull(actual);
    }

    @Test
    public void checkExpectedValueFromGetLocalDateTimeByColumnName() throws SQLException {
        String columnName = "ignored";
        LocalDateTime expected = LocalDateTime.of(2019, 11, 11, 20, 20);
        Mockito.when(mockResultSet.getTimestamp(columnName)).thenReturn(Timestamp.valueOf(expected));
        LocalDateTime actual = ResultSetUtils.getLocalDateTime(mockResultSet, columnName);
        assertEquals(expected, actual);
    }

    @Test
    public void checkNullFromGetLocalDateTimeByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.getTimestamp(columnName)).thenReturn(null);
        LocalDateTime actual = ResultSetUtils.getLocalDateTime(mockResultSet, columnName);
        assertNull(actual);
    }

    @Test
    public void checkExpectedValueFromGetLocalDateTimeByColumnIndex() throws SQLException {
        int columnIndex = 0;
        LocalDateTime expected = LocalDateTime.of(2019, 11, 11, 20, 20);
        Mockito.when(mockResultSet.getTimestamp(columnIndex)).thenReturn(Timestamp.valueOf(expected));
        LocalDateTime actual = ResultSetUtils.getLocalDateTime(mockResultSet, columnIndex);
        assertEquals(expected, actual);
    }

    @Test
    public void checkNullFromGetLocalDateTimeByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.getTimestamp(columnIndex)).thenReturn(null);
        LocalDateTime actual = ResultSetUtils.getLocalDateTime(mockResultSet, columnIndex);
        assertNull(actual);
    }
}