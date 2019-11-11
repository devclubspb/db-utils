package ru.spb.devclub.utils.db;

import com.mockrunner.mock.jdbc.MockArray;
import com.mockrunner.mock.jdbc.MockBlob;
import com.mockrunner.mock.jdbc.MockClob;
import com.mockrunner.mock.jdbc.MockRef;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.math.BigDecimal;
import java.sql.*;
import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class SimpleExtendedResultSetTest extends BaseResultSetMockTest {
    private static String columnName = "column";
    private static int columnIndex = 0;
    protected ExtendedResultSet extendedResultSet;

    @Before
    public void setUp() {
        extendedResultSet = ResultSetUtils.extended(mockResultSet);
    }

    @Test
    public void checkCorrectValueFromGetLongOrNullByColumnName() throws SQLException {
        Long expected = 1L;
        Mockito.when(mockResultSet.getLong(columnName)).thenReturn(expected);

        assertEquals(expected, extendedResultSet.getLongOrNull(columnName));
    }

    @Test
    public void checkNullValueFromGetLongOrNullByColumnName() throws SQLException {
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        assertNull(extendedResultSet.getLongOrNull(columnName));
    }

    @Test
    public void checkCorrectValueFromGetLongOrNullByColumnIndex() throws SQLException {
        Long expected = 1L;
        Mockito.when(mockResultSet.getLong(columnIndex)).thenReturn(expected);

        assertEquals(expected, extendedResultSet.getLongOrNull(columnIndex));
    }

    @Test
    public void checkNullValueFromGetLongOrNullByColumnIndex() throws SQLException {
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        assertNull(extendedResultSet.getLongOrNull(columnIndex));
    }

    @Test
    public void checkCorrectValueFromGetIntOrNullByColumnName() throws SQLException {
        Integer expected = 1;
        Mockito.when(mockResultSet.getInt(columnName)).thenReturn(expected);

        assertEquals(expected, extendedResultSet.getIntOrNull(columnName));
    }

    @Test
    public void checkNullValueFromGetIntOrNullByColumnName() throws SQLException {
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        assertNull(extendedResultSet.getIntOrNull(columnName));
    }

    @Test
    public void checkCorrectValueFromGetIntOrNullByColumnIndex() throws SQLException {
        Integer expected = 1;
        Mockito.when(mockResultSet.getInt(columnIndex)).thenReturn(expected);

        assertEquals(expected, extendedResultSet.getIntOrNull(columnIndex));
    }

    @Test
    public void checkNullValueFromGetIntOrNullByColumnIndex() throws SQLException {
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        assertNull(extendedResultSet.getIntOrNull(columnIndex));
    }

    @Test
    public void checkCorrectValueFromGetBooleanOrNullByColumnName() throws SQLException {
        Boolean expected = true;
        Mockito.when(mockResultSet.getBoolean(columnName)).thenReturn(expected);

        assertEquals(expected, extendedResultSet.getBooleanOrNull(columnName));
    }

    @Test
    public void checkNullValueFromGetBooleanOrNullByColumnName() throws SQLException {
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        assertNull(extendedResultSet.getBooleanOrNull(columnName));
    }

    @Test
    public void checkCorrectValueFromGetBooleanOrNullByColumnIndex() throws SQLException {
        Boolean expected = true;
        Mockito.when(mockResultSet.getBoolean(columnIndex)).thenReturn(expected);

        assertEquals(expected, extendedResultSet.getBooleanOrNull(columnIndex));
    }

    @Test
    public void checkNullValueFromGetBooleanOrNullByColumnIndex() throws SQLException {
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        assertNull(extendedResultSet.getBooleanOrNull(columnIndex));
    }

    @Test
    public void checkCorrectValueFromGetShortOrNullByColumnName() throws SQLException {
        Short expected = 1;
        Mockito.when(mockResultSet.getShort(columnName)).thenReturn(expected);

        assertEquals(expected, extendedResultSet.getShortOrNull(columnName));
    }

    @Test
    public void checkNullValueFromGetShortOrNullByColumnName() throws SQLException {
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        assertNull(extendedResultSet.getShortOrNull(columnName));
    }

    @Test
    public void checkCorrectValueFromGetShortOrNullByColumnIndex() throws SQLException {
        Short expected = 1;
        Mockito.when(mockResultSet.getShort(columnIndex)).thenReturn(expected);

        assertEquals(expected, extendedResultSet.getShortOrNull(columnIndex));
    }

    @Test
    public void checkNullValueFromGetShortOrNullByColumnIndex() throws SQLException {
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        assertNull(extendedResultSet.getShortOrNull(columnIndex));
    }

    @Test
    public void checkCorrectValueFromGetByteOrNullByColumnName() throws SQLException {
        Byte expected = 1;
        Mockito.when(mockResultSet.getByte(columnName)).thenReturn(expected);

        assertEquals(expected, extendedResultSet.getByteOrNull(columnName));
    }

    @Test
    public void checkNullValueFromGetByteOrNullByColumnName() throws SQLException {
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        assertNull(extendedResultSet.getByteOrNull(columnName));
    }

    @Test
    public void checkCorrectValueFromGetByteOrNullByColumnIndex() throws SQLException {
        Byte expected = 1;
        Mockito.when(mockResultSet.getByte(columnIndex)).thenReturn(expected);

        assertEquals(expected, extendedResultSet.getByteOrNull(columnIndex));
    }

    @Test
    public void checkNullValueFromGetByteOrNullByColumnIndex() throws SQLException {
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        assertNull(extendedResultSet.getByteOrNull(columnIndex));
    }

    @Test
    public void checkCorrectValueFromGetDoubleOrNullByColumnName() throws SQLException {
        Double expected = 1.;
        Mockito.when(mockResultSet.getDouble(columnName)).thenReturn(expected);

        assertEquals(expected, extendedResultSet.getDoubleOrNull(columnName));
    }

    @Test
    public void checkNullValueFromGetDoubleOrNullByColumnName() throws SQLException {
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        assertNull(extendedResultSet.getDoubleOrNull(columnName));
    }

    @Test
    public void checkCorrectValueFromGetDoubleOrNullByColumnIndex() throws SQLException {
        Double expected = 1.;
        Mockito.when(mockResultSet.getDouble(columnIndex)).thenReturn(expected);

        assertEquals(expected, extendedResultSet.getDoubleOrNull(columnIndex));
    }

    @Test
    public void checkNullValueFromGetDoubleOrNullByColumnIndex() throws SQLException {
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        assertNull(extendedResultSet.getDoubleOrNull(columnIndex));
    }

    @Test
    public void checkCorrectValueFromGetFloatOrNullByColumnName() throws SQLException {
        Float expected = 1.f;
        Mockito.when(mockResultSet.getFloat(columnName)).thenReturn(expected);

        assertEquals(expected, extendedResultSet.getFloatOrNull(columnName));
    }

    @Test
    public void checkNullValueFromGetFloatOrNullByColumnName() throws SQLException {
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        assertNull(extendedResultSet.getFloatOrNull(columnName));
    }

    @Test
    public void checkCorrectValueFromGetFloatOrNullByColumnIndex() throws SQLException {
        Float expected = 1.f;
        Mockito.when(mockResultSet.getFloat(columnIndex)).thenReturn(expected);

        assertEquals(expected, extendedResultSet.getFloatOrNull(columnIndex));
    }

    @Test
    public void checkNullValueFromGetFloatOrNullByColumnIndex() throws SQLException {
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        assertNull(extendedResultSet.getFloatOrNull(columnIndex));
    }

    @Test
    public void checkExpectedValueFromGetOptionalStringByColumnIndex() throws SQLException {
        int columnIndex = 0;
        String expected = "forty thousand";
        Mockito.when(mockResultSet.getString(columnIndex)).thenReturn(expected);

        Optional<String> optionalString = extendedResultSet.getOptionalString(columnIndex);

        assertEquals(expected, optionalString.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalStringByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.getString(columnIndex)).thenReturn(null);

        Optional<String> optionalString = extendedResultSet.getOptionalString(columnIndex);

        assertFalse(optionalString.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalStringByColumnName() throws SQLException {
        String columnName = "ignored";
        String expected = "forty thousand";
        Mockito.when(mockResultSet.getString(columnName)).thenReturn(expected);

        Optional<String> optionalString = extendedResultSet.getOptionalString(columnName);

        assertEquals(expected, optionalString.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalStringByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.getString(columnName)).thenReturn(null);

        Optional<String> optionalString = extendedResultSet.getOptionalString(columnName);

        assertFalse(optionalString.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalBooleanByColumnIndex() throws SQLException {
        int columnIndex = 0;
        boolean expected = true;
        Mockito.when(mockResultSet.getBoolean(columnIndex)).thenReturn(true);

        Optional<Boolean> optionalBoolean = extendedResultSet.getOptionalBoolean(columnIndex);

        assertEquals(expected, optionalBoolean.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalBooleanByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        Optional<Boolean> optionalBoolean = extendedResultSet.getOptionalBoolean(columnIndex);

        assertFalse(optionalBoolean.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalBooleanByColumnName() throws SQLException {
        String columnName = "ignored";
        boolean expected = true;
        Mockito.when(mockResultSet.getBoolean(columnName)).thenReturn(expected);

        Optional<Boolean> optionalBoolean = extendedResultSet.getOptionalBoolean(columnName);

        assertEquals(expected, optionalBoolean.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalBooleanByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        Optional<Boolean> optionalBoolean = extendedResultSet.getOptionalBoolean(columnName);

        assertFalse(optionalBoolean.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalByteByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Byte expected = 40;
        Mockito.when(mockResultSet.getByte(columnIndex)).thenReturn(expected);

        Optional<Byte> optionalByte = extendedResultSet.getOptionalByte(columnIndex);

        assertEquals(expected, optionalByte.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalByteByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        Optional<Byte> optionalByte = extendedResultSet.getOptionalByte(columnIndex);

        assertFalse(optionalByte.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalByteByColumnName() throws SQLException {
        String columnName = "ignored";
        Byte expected = 40;
        Mockito.when(mockResultSet.getByte(columnName)).thenReturn(expected);

        Optional<Byte> optionalByte = extendedResultSet.getOptionalByte(columnName);

        assertEquals(expected, optionalByte.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalByteByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        Optional<Byte> optionalByte = extendedResultSet.getOptionalByte(columnName);

        assertFalse(optionalByte.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalShortByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Short expected = 4_000;
        Mockito.when(mockResultSet.getShort(columnIndex)).thenReturn(expected);

        Optional<Short> optionalShort = extendedResultSet.getOptionalShort(columnIndex);

        assertEquals(expected, optionalShort.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalShortByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        Optional<Short> optionalShort = extendedResultSet.getOptionalShort(columnIndex);

        assertFalse(optionalShort.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalShortByColumnName() throws SQLException {
        String columnName = "ignored";
        Short expected = 4_000;
        Mockito.when(mockResultSet.getShort(columnName)).thenReturn(expected);

        Optional<Short> optionalShort = extendedResultSet.getOptionalShort(columnName);

        assertEquals(expected, optionalShort.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalShortByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        Optional<Short> optionalShort = extendedResultSet.getOptionalShort(columnName);

        assertFalse(optionalShort.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalIntegerByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Integer expected = 40_000;
        Mockito.when(mockResultSet.getInt(columnIndex)).thenReturn(expected);

        Optional<Integer> optionalInteger = extendedResultSet.getOptionalInt(columnIndex);

        assertEquals(expected, optionalInteger.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalIntegerByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        Optional<Integer> optionalInteger = extendedResultSet.getOptionalInt(columnIndex);

        assertFalse(optionalInteger.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalIntegerByColumnName() throws SQLException {
        String columnName = "ignored";
        Integer expected = 40_000;
        Mockito.when(mockResultSet.getInt(columnName)).thenReturn(expected);

        Optional<Integer> optionalInteger = extendedResultSet.getOptionalInt(columnName);

        assertEquals(expected, optionalInteger.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalIntegerByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        Optional<Integer> optionalInteger = extendedResultSet.getOptionalInt(columnName);

        assertFalse(optionalInteger.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalLongByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Long expected = 40_000L;
        Mockito.when(mockResultSet.getLong(columnIndex)).thenReturn(expected);

        Optional<Long> optionalLong = extendedResultSet.getOptionalLong(columnIndex);

        assertEquals(expected, optionalLong.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalLongByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        Optional<Long> optionalLong = extendedResultSet.getOptionalLong(columnIndex);

        assertFalse(optionalLong.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalLongByColumnName() throws SQLException {
        String columnName = "ignored";
        Long expected = 40_000L;
        Mockito.when(mockResultSet.getLong(columnName)).thenReturn(expected);

        Optional<Long> optionalLong = extendedResultSet.getOptionalLong(columnName);

        assertEquals(expected, optionalLong.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalLongByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        Optional<Long> optionalLong = extendedResultSet.getOptionalLong(columnName);

        assertFalse(optionalLong.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalFloatByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Float expected = 40_000F;
        Mockito.when(mockResultSet.getFloat(columnIndex)).thenReturn(expected);

        Optional<Float> optionalFloat = extendedResultSet.getOptionalFloat(columnIndex);

        assertEquals(expected, optionalFloat.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalFloatByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        Optional<Float> optionalFloat = extendedResultSet.getOptionalFloat(columnIndex);

        assertFalse(optionalFloat.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalFloatByColumnName() throws SQLException {
        String columnName = "ignored";
        Float expected = 40_000F;
        Mockito.when(mockResultSet.getFloat(columnName)).thenReturn(expected);

        Optional<Float> optionalFloat = extendedResultSet.getOptionalFloat(columnName);

        assertEquals(expected, optionalFloat.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalFloatByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        Optional<Float> optionalFloat = extendedResultSet.getOptionalFloat(columnName);

        assertFalse(optionalFloat.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalDoubleByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Double expected = 40_000D;
        Mockito.when(mockResultSet.getDouble(columnIndex)).thenReturn(expected);

        Optional<Double> optionalDouble = extendedResultSet.getOptionalDouble(columnIndex);

        assertEquals(expected, optionalDouble.orElseThrow(IllegalArgumentException::new), .1);
    }

    @Test
    public void checkNullFromGetOptionalDoubleByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        Optional<Double> optionalDouble = extendedResultSet.getOptionalDouble(columnIndex);

        assertFalse(optionalDouble.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalDoubleByColumnName() throws SQLException {
        String columnName = "ignored";
        Double expected = 40_000D;
        Mockito.when(mockResultSet.getDouble(columnName)).thenReturn(expected);

        Optional<Double> optionalDouble = extendedResultSet.getOptionalDouble(columnName);

        assertEquals(expected, optionalDouble.orElseThrow(IllegalArgumentException::new), .1);
    }

    @Test
    public void checkNullFromGetOptionalDoubleByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);

        Optional<Double> optionalDouble = extendedResultSet.getOptionalDouble(columnName);

        assertFalse(optionalDouble.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalBytesByColumnIndex() throws SQLException {
        int columnIndex = 0;
        byte[] expected = new byte[]{4, 0, 0, 0, 0};
        Mockito.when(mockResultSet.getBytes(columnIndex)).thenReturn(expected);

        Optional<byte[]> optionalBytes = extendedResultSet.getOptionalBytes(columnIndex);

        assertEquals(expected, optionalBytes.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalBytesByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.getBytes(columnIndex)).thenReturn(null);

        Optional<byte[]> optionalBytes = extendedResultSet.getOptionalBytes(columnIndex);

        assertFalse(optionalBytes.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalBytesByColumnName() throws SQLException {
        String columnName = "ignored";
        byte[] expected = new byte[]{4, 0, 0, 0, 0};
        Mockito.when(mockResultSet.getBytes(columnName)).thenReturn(expected);

        Optional<byte[]> optionalBytes = extendedResultSet.getOptionalBytes(columnName);

        assertEquals(expected, optionalBytes.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalBytesByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.getBytes(columnName)).thenReturn(null);

        Optional<byte[]> optionalBytes = extendedResultSet.getOptionalBytes(columnName);

        assertFalse(optionalBytes.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalDateByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Date expected = Date.valueOf("2004-04-04");
        Mockito.when(mockResultSet.getDate(columnIndex)).thenReturn(expected);

        Optional<Date> optionalDate = extendedResultSet.getOptionalDate(columnIndex);

        assertEquals(expected, optionalDate.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalDateByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.getDate(columnIndex)).thenReturn(null);

        Optional<Date> optionalDate = extendedResultSet.getOptionalDate(columnIndex);

        assertFalse(optionalDate.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalDateByColumnName() throws SQLException {
        String columnName = "ignored";
        Date expected = Date.valueOf("2004-04-04");
        Mockito.when(mockResultSet.getDate(columnName)).thenReturn(expected);

        Optional<Date> optionalDate = extendedResultSet.getOptionalDate(columnName);

        assertEquals(expected, optionalDate.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalDateByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.getDate(columnName)).thenReturn(null);

        Optional<Date> optionalDate = extendedResultSet.getOptionalDate(columnName);

        assertFalse(optionalDate.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalTimeByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Time expected = Time.valueOf("04:04:04");
        Mockito.when(mockResultSet.getTime(columnIndex)).thenReturn(expected);

        Optional<Time> optionalTime = extendedResultSet.getOptionalTime(columnIndex);

        assertEquals(expected, optionalTime.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalTimeByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.getTime(columnIndex)).thenReturn(null);

        Optional<Time> optionalTime = extendedResultSet.getOptionalTime(columnIndex);

        assertFalse(optionalTime.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalTimeByColumnName() throws SQLException {
        String columnName = "ignored";
        Time expected = Time.valueOf("04:04:04");
        Mockito.when(mockResultSet.getTime(columnName)).thenReturn(expected);

        Optional<Time> optionalTime = extendedResultSet.getOptionalTime(columnName);

        assertEquals(expected, optionalTime.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalTimeByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.getTime(columnName)).thenReturn(null);

        Optional<Time> optionalTime = extendedResultSet.getOptionalTime(columnName);

        assertFalse(optionalTime.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalTimestampByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Timestamp expected = Timestamp.valueOf("2004-04-04 04:04:04.004");
        Mockito.when(mockResultSet.getTimestamp(columnIndex)).thenReturn(expected);

        Optional<Timestamp> optionalTimestamp = extendedResultSet.getOptionalTimestamp(columnIndex);

        assertEquals(expected, optionalTimestamp.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalTimestampByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.getTimestamp(columnIndex)).thenReturn(null);

        Optional<Timestamp> optionalTimestamp = extendedResultSet.getOptionalTimestamp(columnIndex);

        assertFalse(optionalTimestamp.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalTimestampByColumnName() throws SQLException {
        String columnName = "ignored";
        Timestamp expected = Timestamp.valueOf("2004-04-04 04:04:04.004");
        Mockito.when(mockResultSet.getTimestamp(columnName)).thenReturn(expected);

        Optional<Timestamp> optionalTimestamp = extendedResultSet.getOptionalTimestamp(columnName);

        assertEquals(expected, optionalTimestamp.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalTimestampByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.getTimestamp(columnName)).thenReturn(null);

        Optional<Timestamp> optionalTimestamp = extendedResultSet.getOptionalTimestamp(columnName);

        assertFalse(optionalTimestamp.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalBigDecimalByColumnIndex() throws SQLException {
        int columnIndex = 0;
        BigDecimal expected = BigDecimal.valueOf(40_000L);
        Mockito.when(mockResultSet.getBigDecimal(columnIndex)).thenReturn(expected);

        Optional<BigDecimal> optionalBigDecimal = extendedResultSet.getOptionalBigDecimal(columnIndex);

        assertEquals(expected, optionalBigDecimal.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalBigDecimalByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.getBigDecimal(columnIndex)).thenReturn(null);

        Optional<BigDecimal> optionalBigDecimal = extendedResultSet.getOptionalBigDecimal(columnIndex);

        assertFalse(optionalBigDecimal.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalBigDecimalByColumnName() throws SQLException {
        String columnName = "ignored";
        BigDecimal expected = BigDecimal.valueOf(40_000L);
        Mockito.when(mockResultSet.getBigDecimal(columnName)).thenReturn(expected);

        Optional<BigDecimal> optionalBigDecimal = extendedResultSet.getOptionalBigDecimal(columnName);

        assertEquals(expected, optionalBigDecimal.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalBigDecimalByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.getBigDecimal(columnName)).thenReturn(null);

        Optional<BigDecimal> optionalBigDecimal = extendedResultSet.getOptionalBigDecimal(columnName);

        assertFalse(optionalBigDecimal.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalRefByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Ref expected = new MockRef(40_000);
        Mockito.when(mockResultSet.getRef(columnIndex)).thenReturn(expected);

        Optional<Ref> optionalRef = extendedResultSet.getOptionalRef(columnIndex);

        assertEquals(expected, optionalRef.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalRefByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.getRef(columnIndex)).thenReturn(null);

        Optional<Ref> optionalRef = extendedResultSet.getOptionalRef(columnIndex);

        assertFalse(optionalRef.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalRefByColumnName() throws SQLException {
        String columnName = "ignored";
        Ref expected = new MockRef(40_000);
        Mockito.when(mockResultSet.getRef(columnName)).thenReturn(expected);

        Optional<Ref> optionalRef = extendedResultSet.getOptionalRef(columnName);

        assertEquals(expected, optionalRef.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalRefByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.getRef(columnName)).thenReturn(null);

        Optional<Ref> optionalRef = extendedResultSet.getOptionalRef(columnName);

        assertFalse(optionalRef.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalBlobByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Blob expected = new MockBlob(new byte[]{4, 0, 0, 0, 0});
        Mockito.when(mockResultSet.getBlob(columnIndex)).thenReturn(expected);

        Optional<Blob> optionalBlob = extendedResultSet.getOptionalBlob(columnIndex);

        assertEquals(expected, optionalBlob.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalBlobByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.getBlob(columnIndex)).thenReturn(null);

        Optional<Blob> optionalBlob = extendedResultSet.getOptionalBlob(columnIndex);

        assertFalse(optionalBlob.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalBlobByColumnName() throws SQLException {
        String columnName = "ignored";
        Blob expected = new MockBlob(new byte[]{4, 0, 0, 0, 0});
        Mockito.when(mockResultSet.getBlob(columnName)).thenReturn(expected);

        Optional<Blob> optionalBlob = extendedResultSet.getOptionalBlob(columnName);

        assertEquals(expected, optionalBlob.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalBlobByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.getBlob(columnName)).thenReturn(null);

        Optional<Blob> optionalBlob = extendedResultSet.getOptionalBlob(columnName);

        assertFalse(optionalBlob.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalClobByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Clob expected = new MockClob("forty thousand");
        Mockito.when(mockResultSet.getClob(columnIndex)).thenReturn(expected);

        Optional<Clob> optionalClob = extendedResultSet.getOptionalClob(columnIndex);

        assertEquals(expected, optionalClob.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalClobByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.getClob(columnIndex)).thenReturn(null);

        Optional<Clob> optionalClob = extendedResultSet.getOptionalClob(columnIndex);

        assertFalse(optionalClob.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalClobByColumnName() throws SQLException {
        String columnName = "ignored";
        Clob expected = new MockClob("forty thousand");
        Mockito.when(mockResultSet.getClob(columnName)).thenReturn(expected);

        Optional<Clob> optionalClob = extendedResultSet.getOptionalClob(columnName);

        assertEquals(expected, optionalClob.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalClobByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.getClob(columnName)).thenReturn(null);

        Optional<Clob> optionalClob = extendedResultSet.getOptionalClob(columnName);

        assertFalse(optionalClob.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalArrayByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Array expected = new MockArray("forty thousand");
        Mockito.when(mockResultSet.getArray(columnIndex)).thenReturn(expected);

        Optional<Array> optionalArray = extendedResultSet.getOptionalArray(columnIndex);

        assertEquals(expected, optionalArray.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalArrayByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.getArray(columnIndex)).thenReturn(null);

        Optional<Array> optionalArray = extendedResultSet.getOptionalArray(columnIndex);

        assertFalse(optionalArray.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalArrayByColumnName() throws SQLException {
        String columnName = "ignored";
        Array expected = new MockArray("forty thousand");
        Mockito.when(mockResultSet.getArray(columnName)).thenReturn(expected);

        Optional<Array> optionalArray = extendedResultSet.getOptionalArray(columnName);

        assertEquals(expected, optionalArray.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalArrayByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.getArray(columnName)).thenReturn(null);

        Optional<Array> optionalArray = extendedResultSet.getOptionalArray(columnName);

        assertFalse(optionalArray.isPresent());
    }
}
