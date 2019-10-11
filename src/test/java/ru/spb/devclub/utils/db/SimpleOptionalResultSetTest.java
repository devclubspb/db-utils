package ru.spb.devclub.utils.db;

import com.mockrunner.mock.jdbc.MockArray;
import com.mockrunner.mock.jdbc.MockBlob;
import com.mockrunner.mock.jdbc.MockClob;
import com.mockrunner.mock.jdbc.MockRef;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;
import java.sql.*;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class SimpleOptionalResultSetTest {
    @Mock
    private ResultSet mockResultSet;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void checkExpectedValueFromGetOptionalStringByColumnIndex() throws SQLException {
        int columnIndex = 0;
        String expected = "forty thousand";
        Mockito.when(mockResultSet.getString(columnIndex)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<String> optionalString = resultSet.getOptionalString(columnIndex);
        assertEquals(expected, optionalString.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalStringByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<String> optionalString = resultSet.getOptionalString(columnIndex);
        assertFalse(optionalString.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalStringByColumnName() throws SQLException {
        String columnName = "ignored";
        String expected = "forty thousand";
        Mockito.when(mockResultSet.getString(columnName)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<String> optionalString = resultSet.getOptionalString(columnName);
        assertEquals(expected, optionalString.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalStringByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<String> optionalString = resultSet.getOptionalString(columnName);
        assertFalse(optionalString.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalBooleanByColumnIndex() throws SQLException {
        int columnIndex = 0;
        boolean expected = true;
        Mockito.when(mockResultSet.getBoolean(columnIndex)).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Boolean> optionalBoolean = resultSet.getOptionalBoolean(columnIndex);
        assertEquals(expected, optionalBoolean.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalBooleanByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Boolean> optionalBoolean = resultSet.getOptionalBoolean(columnIndex);
        assertFalse(optionalBoolean.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalBooleanByColumnName() throws SQLException {
        String columnName = "ignored";
        boolean expected = true;
        Mockito.when(mockResultSet.getBoolean(columnName)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Boolean> optionalBoolean = resultSet.getOptionalBoolean(columnName);
        assertEquals(expected, optionalBoolean.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalBooleanByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Boolean> optionalBoolean = resultSet.getOptionalBoolean(columnName);
        assertFalse(optionalBoolean.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalByteByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Byte expected = 40;
        Mockito.when(mockResultSet.getByte(columnIndex)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Byte> optionalByte = resultSet.getOptionalByte(columnIndex);
        assertEquals(expected, optionalByte.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalByteByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Byte> optionalByte = resultSet.getOptionalByte(columnIndex);
        assertFalse(optionalByte.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalByteByColumnName() throws SQLException {
        String columnName = "ignored";
        Byte expected = 40;
        Mockito.when(mockResultSet.getByte(columnName)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Byte> optionalByte = resultSet.getOptionalByte(columnName);
        assertEquals(expected, optionalByte.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalByteByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Byte> optionalByte = resultSet.getOptionalByte(columnName);
        assertFalse(optionalByte.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalShortByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Short expected = 4_000;
        Mockito.when(mockResultSet.getShort(columnIndex)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Short> optionalShort = resultSet.getOptionalShort(columnIndex);
        assertEquals(expected, optionalShort.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalShortByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Short> optionalShort = resultSet.getOptionalShort(columnIndex);
        assertFalse(optionalShort.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalShortByColumnName() throws SQLException {
        String columnName = "ignored";
        Short expected = 4_000;
        Mockito.when(mockResultSet.getShort(columnName)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Short> optionalShort = resultSet.getOptionalShort(columnName);
        assertEquals(expected, optionalShort.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalShortByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Short> optionalShort = resultSet.getOptionalShort(columnName);
        assertFalse(optionalShort.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalIntegerByColumnIndex() throws SQLException {
        int columnIndex = 0;
        int expected = 40_000;
        Mockito.when(mockResultSet.getInt(columnIndex)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        OptionalInt optionalInteger = resultSet.getOptionalInt(columnIndex);
        assertEquals(expected, optionalInteger.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalIntegerByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        OptionalInt optionalInteger = resultSet.getOptionalInt(columnIndex);
        assertFalse(optionalInteger.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalIntegerByColumnName() throws SQLException {
        String columnName = "ignored";
        int expected = 40_000;
        Mockito.when(mockResultSet.getInt(columnName)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        OptionalInt optionalInteger = resultSet.getOptionalInt(columnName);
        assertEquals(expected, optionalInteger.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalIntegerByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        OptionalInt optionalInteger = resultSet.getOptionalInt(columnName);
        assertFalse(optionalInteger.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalLongByColumnIndex() throws SQLException {
        int columnIndex = 0;
        long expected = 40_000L;
        Mockito.when(mockResultSet.getLong(columnIndex)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        OptionalLong optionalLong = resultSet.getOptionalLong(columnIndex);
        assertEquals(expected, optionalLong.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalLongByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        OptionalLong optionalLong = resultSet.getOptionalLong(columnIndex);
        assertFalse(optionalLong.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalLongByColumnName() throws SQLException {
        String columnName = "ignored";
        long expected = 40_000L;
        Mockito.when(mockResultSet.getLong(columnName)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        OptionalLong optionalLong = resultSet.getOptionalLong(columnName);
        assertEquals(expected, optionalLong.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalLongByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        OptionalLong optionalLong = resultSet.getOptionalLong(columnName);
        assertFalse(optionalLong.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalFloatByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Float expected = 40_000F;
        Mockito.when(mockResultSet.getFloat(columnIndex)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Float> optionalFloat = resultSet.getOptionalFloat(columnIndex);
        assertEquals(expected, optionalFloat.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalFloatByColumnIndex() throws SQLException {
        int columnIndex = 0;
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Float> optionalFloat = resultSet.getOptionalFloat(columnIndex);
        assertFalse(optionalFloat.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalFloatByColumnName() throws SQLException {
        String columnName = "ignored";
        Float expected = 40_000F;
        Mockito.when(mockResultSet.getFloat(columnName)).thenReturn(expected);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Float> optionalFloat = resultSet.getOptionalFloat(columnName);
        assertEquals(expected, optionalFloat.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalFloatByColumnName() throws SQLException {
        String columnName = "ignored";
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        OptionalResultSet resultSet = ResultSetUtils.optional(mockResultSet);
        Optional<Float> optionalFloat = resultSet.getOptionalFloat(columnName);
        assertFalse(optionalFloat.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalDoubleByColumnIndex() throws SQLException {
        double expected = 40_000D;
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public double getDouble(int columnIndex) {
                return expected;
            }
        });
        OptionalDouble optionalDouble = resultSet.getOptionalDouble(0);
        assertEquals(expected, optionalDouble.orElseThrow(IllegalArgumentException::new), .1);
    }

    @Test
    public void checkNullFromGetOptionalDoubleByColumnIndex() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        OptionalDouble optionalDouble = resultSet.getOptionalDouble(0);
        assertFalse(optionalDouble.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalDoubleByColumnName() throws SQLException {
        double expected = 40_000D;
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public double getDouble(String columnName) {
                return expected;
            }
        });
        OptionalDouble optionalDouble = resultSet.getOptionalDouble("ignored");
        assertEquals(expected, optionalDouble.orElseThrow(IllegalArgumentException::new), .1);
    }

    @Test
    public void checkNullFromGetOptionalDoubleByColumnName() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        OptionalDouble optionalDouble = resultSet.getOptionalDouble("ignored");
        assertFalse(optionalDouble.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalBytesByColumnIndex() throws SQLException {
        byte[] expected = new byte[]{4, 0, 0, 0, 0};
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public byte[] getBytes(int columnIndex) {
                return expected;
            }
        });
        Optional<byte[]> optionalBytes = resultSet.getOptionalBytes(0);
        assertEquals(expected, optionalBytes.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalBytesByColumnIndex() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        Optional<byte[]> optionalBytes = resultSet.getOptionalBytes(0);
        assertFalse(optionalBytes.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalBytesByColumnName() throws SQLException {
        byte[] expected = new byte[]{4, 0, 0, 0, 0};
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public byte[] getBytes(String columnName) {
                return expected;
            }
        });
        Optional<byte[]> optionalBytes = resultSet.getOptionalBytes("ignored");
        assertEquals(expected, optionalBytes.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalBytesByColumnName() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        Optional<byte[]> optionalBytes = resultSet.getOptionalBytes("ignored");
        assertFalse(optionalBytes.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalDateByColumnIndex() throws SQLException {
        Date expected = Date.valueOf("2004-04-04");
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public Date getDate(int columnIndex) {
                return expected;
            }
        });
        Optional<Date> optionalDate = resultSet.getOptionalDate(0);
        assertEquals(expected, optionalDate.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalDateByColumnIndex() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        Optional<Date> optionalDate = resultSet.getOptionalDate(0);
        assertFalse(optionalDate.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalDateByColumnName() throws SQLException {
        Date expected = Date.valueOf("2004-04-04");
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public Date getDate(String columnName) {
                return expected;
            }
        });
        Optional<Date> optionalDate = resultSet.getOptionalDate("ignored");
        assertEquals(expected, optionalDate.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalDateByColumnName() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        Optional<Date> optionalDate = resultSet.getOptionalDate("ignored");
        assertFalse(optionalDate.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalTimeByColumnIndex() throws SQLException {
        Time expected = Time.valueOf("04:04:04");
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public Time getTime(int columnIndex) {
                return expected;
            }
        });
        Optional<Time> optionalTime = resultSet.getOptionalTime(0);
        assertEquals(expected, optionalTime.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalTimeByColumnIndex() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        Optional<Time> optionalTime = resultSet.getOptionalTime(0);
        assertFalse(optionalTime.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalTimeByColumnName() throws SQLException {
        Time expected = Time.valueOf("04:04:04");
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public Time getTime(String columnName) {
                return expected;
            }
        });
        Optional<Time> optionalTime = resultSet.getOptionalTime("ignored");
        assertEquals(expected, optionalTime.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalTimeByColumnName() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        Optional<Time> optionalTime = resultSet.getOptionalTime("ignored");
        assertFalse(optionalTime.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalTimestampByColumnIndex() throws SQLException {
        Timestamp expected = Timestamp.valueOf("2004-04-04 04:04:04.004");
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public Timestamp getTimestamp(int columnIndex) {
                return expected;
            }
        });
        Optional<Timestamp> optionalTimestamp = resultSet.getOptionalTimestamp(0);
        assertEquals(expected, optionalTimestamp.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalTimestampByColumnIndex() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        Optional<Timestamp> optionalTimestamp = resultSet.getOptionalTimestamp(0);
        assertFalse(optionalTimestamp.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalTimestampByColumnName() throws SQLException {
        Timestamp expected = Timestamp.valueOf("2004-04-04 04:04:04.004");
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public Timestamp getTimestamp(String columnName) {
                return expected;
            }
        });
        Optional<Timestamp> optionalTimestamp = resultSet.getOptionalTimestamp("ignored");
        assertEquals(expected, optionalTimestamp.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalTimestampByColumnName() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        Optional<Timestamp> optionalTimestamp = resultSet.getOptionalTimestamp("ignored");
        assertFalse(optionalTimestamp.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalBigDecimalByColumnIndex() throws SQLException {
        BigDecimal expected = BigDecimal.valueOf(40_000L);
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public BigDecimal getBigDecimal(int columnIndex) {
                return expected;
            }
        });
        Optional<BigDecimal> optionalBigDecimal = resultSet.getOptionalBigDecimal(0);
        assertEquals(expected, optionalBigDecimal.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalBigDecimalByColumnIndex() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        Optional<BigDecimal> optionalBigDecimal = resultSet.getOptionalBigDecimal(0);
        assertFalse(optionalBigDecimal.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalBigDecimalByColumnName() throws SQLException {
        BigDecimal expected = BigDecimal.valueOf(40_000L);
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public BigDecimal getBigDecimal(String columnName) {
                return expected;
            }
        });
        Optional<BigDecimal> optionalBigDecimal = resultSet.getOptionalBigDecimal("ignored");
        assertEquals(expected, optionalBigDecimal.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalBigDecimalByColumnName() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        Optional<BigDecimal> optionalBigDecimal = resultSet.getOptionalBigDecimal("ignored");
        assertFalse(optionalBigDecimal.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalRefByColumnIndex() throws SQLException {
        Ref expected = new MockRef(40_000);
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public Ref getRef(int columnIndex) {
                return expected;
            }
        });
        Optional<Ref> optionalRef = resultSet.getOptionalRef(0);
        assertEquals(expected, optionalRef.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalRefByColumnIndex() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        Optional<Ref> optionalRef = resultSet.getOptionalRef(0);
        assertFalse(optionalRef.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalRefByColumnName() throws SQLException {
        Ref expected = new MockRef(40_000);
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public Ref getRef(String columnName) {
                return expected;
            }
        });
        Optional<Ref> optionalRef = resultSet.getOptionalRef("ignored");
        assertEquals(expected, optionalRef.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalRefByColumnName() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        Optional<Ref> optionalRef = resultSet.getOptionalRef("ignored");
        assertFalse(optionalRef.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalBlobByColumnIndex() throws SQLException {
        Blob expected = new MockBlob(new byte[]{4, 0, 0, 0, 0});
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public Blob getBlob(int columnIndex) {
                return expected;
            }
        });
        Optional<Blob> optionalBlob = resultSet.getOptionalBlob(0);
        assertEquals(expected, optionalBlob.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalBlobByColumnIndex() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        Optional<Blob> optionalBlob = resultSet.getOptionalBlob(0);
        assertFalse(optionalBlob.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalBlobByColumnName() throws SQLException {
        Blob expected = new MockBlob(new byte[]{4, 0, 0, 0, 0});
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public Blob getBlob(String columnName) {
                return expected;
            }
        });
        Optional<Blob> optionalBlob = resultSet.getOptionalBlob("ignored");
        assertEquals(expected, optionalBlob.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalBlobByColumnName() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        Optional<Blob> optionalBlob = resultSet.getOptionalBlob("ignored");
        assertFalse(optionalBlob.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalClobByColumnIndex() throws SQLException {
        Clob expected = new MockClob("forty thousand");
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public Clob getClob(int columnIndex) {
                return expected;
            }
        });
        Optional<Clob> optionalClob = resultSet.getOptionalClob(0);
        assertEquals(expected, optionalClob.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalClobByColumnIndex() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        Optional<Clob> optionalClob = resultSet.getOptionalClob(0);
        assertFalse(optionalClob.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalClobByColumnName() throws SQLException {
        Clob expected = new MockClob("forty thousand");
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public Clob getClob(String columnName) {
                return expected;
            }
        });
        Optional<Clob> optionalClob = resultSet.getOptionalClob("ignored");
        assertEquals(expected, optionalClob.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalClobByColumnName() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        Optional<Clob> optionalClob = resultSet.getOptionalClob("ignored");
        assertFalse(optionalClob.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalArrayByColumnIndex() throws SQLException {
        Array expected = new MockArray("forty thousand");
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public Array getArray(int columnIndex) {
                return expected;
            }
        });
        Optional<Array> optionalArray = resultSet.getOptionalArray(0);
        assertEquals(expected, optionalArray.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalArrayByColumnIndex() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        Optional<Array> optionalArray = resultSet.getOptionalArray(0);
        assertFalse(optionalArray.isPresent());
    }

    @Test
    public void checkExpectedValueFromGetOptionalArrayByColumnName() throws SQLException {
        Array expected = new MockArray("forty thousand");
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public Array getArray(String columnName) {
                return expected;
            }
        });
        Optional<Array> optionalArray = resultSet.getOptionalArray("ignored");
        assertEquals(expected, optionalArray.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkNullFromGetOptionalArrayByColumnName() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean wasNull() {
                return true;
            }
        });
        Optional<Array> optionalArray = resultSet.getOptionalArray("ignored");
        assertFalse(optionalArray.isPresent());
    }
}