package ru.spb.devclub.utils.db;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ResultSetUtilsTest {
    @Mock
    private ResultSet mockResultSet;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    enum ExampleEnum {A, B}

    @Test
    public void checkGetEnumValueByValidValue() throws SQLException {
        EnumResultSetImpl rs = new EnumResultSetImpl("A");

        ExampleEnum result = ResultSetUtils.getEnumValue(rs, "column", ExampleEnum.values());

        Assert.assertEquals(ExampleEnum.A, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkGetEnumValueByInvalidValue() throws SQLException {
        EnumResultSetImpl rs = new EnumResultSetImpl("C");

        ResultSetUtils.getEnumValue(rs, "column", ExampleEnum.values());
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkGetEnumValueByNullValue() throws SQLException {
        EnumResultSetImpl rs = new EnumResultSetImpl("C");

        ExampleEnum result = ResultSetUtils.getEnumValue(rs, "column", ExampleEnum.values());

        Assert.assertNull(result);
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