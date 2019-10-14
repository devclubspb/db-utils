package ru.spb.devclub.utils.db;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(MockitoJUnitRunner.class)
public class SimpleBoxedResultSetTest {

    private static String columnName = "column";
    private static int columnIndex = 0;

    @Mock
    private ResultSet mockResultSet;
    private BoxedResultSet boxedResultSet;

    @Before
    public void setUp() {
        boxedResultSet = ResultSetUtils.boxed(mockResultSet);
    }

    @Test
    public void checkCorrectValueFromGetLongOrNullByColumnName() throws SQLException {
        Long expected = 1L;
        Mockito.when(mockResultSet.getLong(columnName)).thenReturn(expected);

        assertEquals(expected, boxedResultSet.getLongOrNull(columnName));
    }

    @Test
    public void checkNullValueFromGetLongOrNullByColumnName() throws SQLException {
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        assertNull(boxedResultSet.getLongOrNull(columnName));
    }

    @Test
    public void checkCorrectValueFromGetLongOrNullByColumnIndex() throws SQLException {
        Long expected = 1L;
        Mockito.when(mockResultSet.getLong(columnIndex)).thenReturn(expected);

        assertEquals(expected, boxedResultSet.getLongOrNull(columnIndex));
    }

    @Test
    public void checkNullValueFromGetLongOrNullByColumnIndex() throws SQLException {
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        assertNull(boxedResultSet.getLongOrNull(columnIndex));
    }

    @Test
    public void checkCorrectValueFromGetIntOrNullByColumnName() throws SQLException {
        Integer expected = 1;
        Mockito.when(mockResultSet.getInt(columnName)).thenReturn(expected);

        assertEquals(expected, boxedResultSet.getIntOrNull(columnName));
    }

    @Test
    public void checkNullValueFromGetIntOrNullByColumnName() throws SQLException {
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        assertNull(boxedResultSet.getIntOrNull(columnName));
    }

    @Test
    public void checkCorrectValueFromGetIntOrNullByColumnIndex() throws SQLException {
        Integer expected = 1;
        Mockito.when(mockResultSet.getInt(columnIndex)).thenReturn(expected);

        assertEquals(expected, boxedResultSet.getIntOrNull(columnIndex));
    }

    @Test
    public void checkNullValueFromGetIntOrNullByColumnIndex() throws SQLException {
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        assertNull(boxedResultSet.getIntOrNull(columnIndex));
    }

    @Test
    public void checkCorrectValueFromGetBooleanOrNullByColumnName() throws SQLException {
        Boolean expected = true;
        Mockito.when(mockResultSet.getBoolean(columnName)).thenReturn(expected);

        assertEquals(expected, boxedResultSet.getBooleanOrNull(columnName));
    }

    @Test
    public void checkNullValueFromGetBooleanOrNullByColumnName() throws SQLException {
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        assertNull(boxedResultSet.getBooleanOrNull(columnName));
    }

    @Test
    public void checkCorrectValueFromGetBooleanOrNullByColumnIndex() throws SQLException {
        Boolean expected = true;
        Mockito.when(mockResultSet.getBoolean(columnIndex)).thenReturn(expected);

        assertEquals(expected, boxedResultSet.getBooleanOrNull(columnIndex));
    }

    @Test
    public void checkNullValueFromGetBooleanOrNullByColumnIndex() throws SQLException {
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        assertNull(boxedResultSet.getBooleanOrNull(columnIndex));
    }

    @Test
    public void checkCorrectValueFromGetShortOrNullByColumnName() throws SQLException {
        Short expected = 1;
        Mockito.when(mockResultSet.getShort(columnName)).thenReturn(expected);

        assertEquals(expected, boxedResultSet.getShortOrNull(columnName));
    }

    @Test
    public void checkNullValueFromGetShortOrNullByColumnName() throws SQLException {
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        assertNull(boxedResultSet.getShortOrNull(columnName));
    }

    @Test
    public void checkCorrectValueFromGetShortOrNullByColumnIndex() throws SQLException {
        Short expected = 1;
        Mockito.when(mockResultSet.getShort(columnIndex)).thenReturn(expected);

        assertEquals(expected, boxedResultSet.getShortOrNull(columnIndex));
    }

    @Test
    public void checkNullValueFromGetShortOrNullByColumnIndex() throws SQLException {
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        assertNull(boxedResultSet.getShortOrNull(columnIndex));
    }


    @Test
    public void checkCorrectValueFromGetByteOrNullByColumnName() throws SQLException {
        Byte expected = 1;
        Mockito.when(mockResultSet.getByte(columnName)).thenReturn(expected);

        assertEquals(expected, boxedResultSet.getByteOrNull(columnName));
    }

    @Test
    public void checkNullValueFromGetByteOrNullByColumnName() throws SQLException {
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        assertNull(boxedResultSet.getByteOrNull(columnName));
    }

    @Test
    public void checkCorrectValueFromGetByteOrNullByColumnIndex() throws SQLException {
        Byte expected = 1;
        Mockito.when(mockResultSet.getByte(columnIndex)).thenReturn(expected);

        assertEquals(expected, boxedResultSet.getByteOrNull(columnIndex));
    }

    @Test
    public void checkNullValueFromGetByteOrNullByColumnIndex() throws SQLException {
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        assertNull(boxedResultSet.getByteOrNull(columnIndex));
    }


    @Test
    public void checkCorrectValueFromGetDoubleOrNullByColumnName() throws SQLException {
        Double expected = 1.;
        Mockito.when(mockResultSet.getDouble(columnName)).thenReturn(expected);

        assertEquals(expected, boxedResultSet.getDoubleOrNull(columnName));
    }

    @Test
    public void checkNullValueFromGetDoubleOrNullByColumnName() throws SQLException {
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        assertNull(boxedResultSet.getDoubleOrNull(columnName));
    }

    @Test
    public void checkCorrectValueFromGetDoubleOrNullByColumnIndex() throws SQLException {
        Double expected = 1.;
        Mockito.when(mockResultSet.getDouble(columnIndex)).thenReturn(expected);

        assertEquals(expected, boxedResultSet.getDoubleOrNull(columnIndex));
    }

    @Test
    public void checkNullValueFromGetDoubleOrNullByColumnIndex() throws SQLException {
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        assertNull(boxedResultSet.getDoubleOrNull(columnIndex));
    }


    @Test
    public void checkCorrectValueFromGetFloatOrNullByColumnName() throws SQLException {
        Float expected = 1.f;
        Mockito.when(mockResultSet.getFloat(columnName)).thenReturn(expected);

        assertEquals(expected, boxedResultSet.getFloatOrNull(columnName));
    }

    @Test
    public void checkNullValueFromGetFloatOrNullByColumnName() throws SQLException {
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        assertNull(boxedResultSet.getFloatOrNull(columnName));
    }

    @Test
    public void checkCorrectValueFromGetFloatOrNullByColumnIndex() throws SQLException {
        Float expected = 1.f;
        Mockito.when(mockResultSet.getFloat(columnIndex)).thenReturn(expected);

        assertEquals(expected, boxedResultSet.getFloatOrNull(columnIndex));
    }

    @Test
    public void checkNullValueFromGetFloatOrNullByColumnIndex() throws SQLException {
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        assertNull(boxedResultSet.getFloatOrNull(columnIndex));
    }
}