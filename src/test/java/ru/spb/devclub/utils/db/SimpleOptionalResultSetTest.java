package ru.spb.devclub.utils.db;

import org.junit.Test;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class SimpleOptionalResultSetTest {
    @Test
    public void checkExpectedValueFromGetOptionalStringByColumnIndex() throws SQLException {
        String expected = "forty thousand";
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public String getString(int columnIndex) {
                return expected;
            }
        });
        Optional<String> optionalString = resultSet.getOptionalString(0);
        assertEquals(expected, optionalString.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkExpectedValueFromGetOptionalBooleanByColumnIndex() throws SQLException {
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public boolean getBoolean(int columnIndex) {
                return true;
            }
        });
        Optional<Boolean> optionalBoolean = resultSet.getOptionalBoolean(0);
        assertEquals(true, optionalBoolean.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    @SuppressWarnings("WrapperTypeMayBePrimitive")
    public void checkExpectedValueFromGetOptionalByteByColumnIndex() throws SQLException {
        Byte expected = 40;
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public byte getByte(int columnIndex) {
                return expected;
            }
        });
        Optional<Byte> optionalByte = resultSet.getOptionalByte(0);
        assertEquals(expected, optionalByte.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    @SuppressWarnings("WrapperTypeMayBePrimitive")
    public void checkExpectedValueFromGetOptionalShortByColumnIndex() throws SQLException {
        Short expected = 4_000;
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public short getShort(int columnIndex) {
                return expected;
            }
        });
        Optional<Short> optionalShort = resultSet.getOptionalShort(0);
        assertEquals(expected, optionalShort.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkExpectedValueFromGetOptionalIntegerByColumnIndex() throws SQLException {
        int expected = 40_000;
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public int getInt(int columnIndex) {
                return expected;
            }
        });
        OptionalInt optionalInteger = resultSet.getOptionalInt(0);
        assertEquals(expected, optionalInteger.orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void checkExpectedValueFromGetOptionalLongByColumnIndex() throws SQLException {
        long expected = 40_000L;
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public long getLong(int columnIndex) {
                return expected;
            }
        });
        OptionalLong optionalLong = resultSet.getOptionalLong(0);
        assertEquals(expected, optionalLong.orElseThrow(IllegalArgumentException::new));
    }

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

    @Test
    @SuppressWarnings("WrapperTypeMayBePrimitive")
    public void checkExpectedValueFromGetOptionalFloatByColumnIndex() throws SQLException {
        Float expected = 40_000F;
        OptionalResultSet resultSet = ResultSetUtils.optional(new AbstractResultSet() {
            @Override
            public float getFloat(int columnIndex) {
                return expected;
            }
        });
        Optional<Float> optionalFloat = resultSet.getOptionalFloat(0);
        assertEquals(expected, optionalFloat.orElseThrow(IllegalArgumentException::new));
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
}