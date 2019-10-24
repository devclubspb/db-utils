package ru.spb.devclub.utils.db;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import ru.spb.devclub.utils.db.entity.BoxedEntity;
import ru.spb.devclub.utils.db.entity.ComplexEntity;
import ru.spb.devclub.utils.db.entity.PrimitiveEntity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class AwareRowMapperTest {
    @Mock
    private ResultSet mockResultSet;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void checkCompletedPrimitiveMapping() throws SQLException {
        int iValue = 4;
        long lValue = 5L;
        double dValue = 5.5D;
        boolean boolValue = true;
        float fValue = 6.6F;
        short sValue = 7;
        byte bValue = 8;
        char cValue = 'a';
        PrimitiveEntity expected = new PrimitiveEntity(iValue, lValue, dValue, boolValue, fValue, sValue, bValue, cValue);
        Mockito.when(mockResultSet.getInt("INT_FIELD")).thenReturn(iValue);
        Mockito.when(mockResultSet.getLong("LONG_FIELD")).thenReturn(lValue);
        Mockito.when(mockResultSet.getDouble("DOUBLE_FIELD")).thenReturn(dValue);
        Mockito.when(mockResultSet.getBoolean("BOOLEAN_FIELD")).thenReturn(boolValue);
        Mockito.when(mockResultSet.getFloat("FLOAT_FIELD")).thenReturn(fValue);
        Mockito.when(mockResultSet.getShort("SHORT_FIELD")).thenReturn(sValue);
        Mockito.when(mockResultSet.getByte("BYTE_FIELD")).thenReturn(bValue);
        Mockito.when(mockResultSet.getString("CHAR_FIELD")).thenReturn(cValue + "bc");
        AwareRowMapper<PrimitiveEntity> rowMapper = new AwareRowMapper<>(PrimitiveEntity.class);
        PrimitiveEntity actual = rowMapper.mapRow(mockResultSet, 0);
        assertEquals(expected, actual);
    }

    @Test
    public void checkEmptyPrimitiveMapping() throws SQLException {
        PrimitiveEntity expected = new PrimitiveEntity();
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        AwareRowMapper<PrimitiveEntity> rowMapper = new AwareRowMapper<>(PrimitiveEntity.class);
        PrimitiveEntity actual = rowMapper.mapRow(mockResultSet, 0);
        assertEquals(expected, actual);
    }

    @Test
    public void checkCompletedBoxedMapping() throws SQLException {
        Integer iValue = 4;
        Long lValue = 5L;
        Double dValue = 5.5D;
        Boolean boolValue = true;
        Float fValue = 6.6F;
        Short sValue = 7;
        Byte byteValue = 8;
        BoxedEntity expected = new BoxedEntity(iValue, lValue, dValue, boolValue, fValue, sValue, byteValue);
        Mockito.when(mockResultSet.getInt("BOXED_INT_FIELD")).thenReturn(iValue);
        Mockito.when(mockResultSet.getLong("BOXED_LONG_FIELD")).thenReturn(lValue);
        Mockito.when(mockResultSet.getDouble("BOXED_DOUBLE_FIELD")).thenReturn(dValue);
        Mockito.when(mockResultSet.getBoolean("BOXED_BOOLEAN_FIELD")).thenReturn(boolValue);
        Mockito.when(mockResultSet.getFloat("BOXED_FLOAT_FIELD")).thenReturn(fValue);
        Mockito.when(mockResultSet.getShort("BOXED_SHORT_FIELD")).thenReturn(sValue);
        Mockito.when(mockResultSet.getByte("BOXED_BYTE_FIELD")).thenReturn(byteValue);
        AwareRowMapper<BoxedEntity> rowMapper = new AwareRowMapper<>(BoxedEntity.class);
        BoxedEntity actual = rowMapper.mapRow(mockResultSet, 0);
        assertEquals(expected, actual);
    }

    @Test
    public void checkEmptyBoxedMapping() throws SQLException {
        BoxedEntity expected = new BoxedEntity();
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        AwareRowMapper<BoxedEntity> rowMapper = new AwareRowMapper<>(BoxedEntity.class);
        BoxedEntity actual = rowMapper.mapRow(mockResultSet, 0);
        assertEquals(expected, actual);
    }

    @Test
    public void checkCompletedComplexMapping() throws SQLException {
        Long id = 11L;
        String name = "Two";
        int count = 1;
        boolean completed = true;
        Boolean checked = true;
        PrimitiveEntity primitiveChild = null;
        BoxedEntity boxedChild = null;
        ComplexEntity expected = new ComplexEntity(id, name, count, completed, checked, primitiveChild, boxedChild);
        Mockito.when(mockResultSet.getLong("ID")).thenReturn(id);
        Mockito.when(mockResultSet.getString("NAME")).thenReturn(name);
        Mockito.when(mockResultSet.getInt("COUNT")).thenReturn(count);
        Mockito.when(mockResultSet.getBoolean("COMPLETED")).thenReturn(completed);
        Mockito.when(mockResultSet.getBoolean("CHECKED")).thenReturn(checked);
        AwareRowMapper<ComplexEntity> rowMapper = new AwareRowMapper<>(ComplexEntity.class);
        ComplexEntity actual = rowMapper.mapRow(mockResultSet, 0);
        assertEquals(expected, actual);
    }

    @Test
    public void checkEmptyComplexMapping() throws SQLException {
        ComplexEntity expected = new ComplexEntity();
        Mockito.when(mockResultSet.wasNull()).thenReturn(true);
        AwareRowMapper<ComplexEntity> rowMapper = new AwareRowMapper<>(ComplexEntity.class);
        ComplexEntity actual = rowMapper.mapRow(mockResultSet, 0);
        assertEquals(expected, actual);
    }

    @Test
    public void checkDeepCompletedComplexMapping() throws SQLException {
        Long id = 11L;
        String name = "Two";
        int count = 1;
        boolean completed = true;
        Boolean checked = true;
        Mockito.when(mockResultSet.getLong("ID")).thenReturn(id);
        Mockito.when(mockResultSet.getString("NAME")).thenReturn(name);
        Mockito.when(mockResultSet.getInt("COUNT")).thenReturn(count);
        Mockito.when(mockResultSet.getBoolean("COMPLETED")).thenReturn(completed);
        Mockito.when(mockResultSet.getBoolean("CHECKED")).thenReturn(checked);
        int i = 14;
        long l = 15L;
        double d = 15.5D;
        boolean bool = true;
        float f = 16.6F;
        short s = 17;
        byte b = 18;
        char c = 'x';
        Mockito.when(mockResultSet.getInt("INT_FIELD")).thenReturn(i);
        Mockito.when(mockResultSet.getLong("LONG_FIELD")).thenReturn(l);
        Mockito.when(mockResultSet.getDouble("DOUBLE_FIELD")).thenReturn(d);
        Mockito.when(mockResultSet.getBoolean("BOOLEAN_FIELD")).thenReturn(bool);
        Mockito.when(mockResultSet.getFloat("FLOAT_FIELD")).thenReturn(f);
        Mockito.when(mockResultSet.getShort("SHORT_FIELD")).thenReturn(s);
        Mockito.when(mockResultSet.getByte("BYTE_FIELD")).thenReturn(b);
        Mockito.when(mockResultSet.getString("CHAR_FIELD")).thenReturn(c + "bc");
        Integer iValue = 4;
        Long lValue = 5L;
        Double dValue = 5.5D;
        Boolean boolValue = true;
        Float fValue = 6.6F;
        Short sValue = 7;
        Byte byteValue = 8;
        Mockito.when(mockResultSet.getInt("BOXED_INT_FIELD")).thenReturn(iValue);
        Mockito.when(mockResultSet.getLong("BOXED_LONG_FIELD")).thenReturn(lValue);
        Mockito.when(mockResultSet.getDouble("BOXED_DOUBLE_FIELD")).thenReturn(dValue);
        Mockito.when(mockResultSet.getBoolean("BOXED_BOOLEAN_FIELD")).thenReturn(boolValue);
        Mockito.when(mockResultSet.getFloat("BOXED_FLOAT_FIELD")).thenReturn(fValue);
        Mockito.when(mockResultSet.getShort("BOXED_SHORT_FIELD")).thenReturn(sValue);
        Mockito.when(mockResultSet.getByte("BOXED_BYTE_FIELD")).thenReturn(byteValue);
        PrimitiveEntity primitiveChild = new PrimitiveEntity(i, l, d, bool, f, s, b, c);
        BoxedEntity boxedChild = new BoxedEntity(iValue, lValue, dValue, boolValue, fValue, sValue, byteValue);
        ComplexEntity expected = new ComplexEntity(id, name, count, completed, checked, primitiveChild, boxedChild);
        AwareRowMapper<PrimitiveEntity> primitiveRowMapper = new AwareRowMapper<>(PrimitiveEntity.class);
        AwareRowMapper<BoxedEntity> boxedRowMapper = new AwareRowMapper<>(BoxedEntity.class);
        Map<Class<?>, AwareRowMapper<?>> mappers = new HashMap<>();
        mappers.put(PrimitiveEntity.class, primitiveRowMapper);
        mappers.put(BoxedEntity.class, boxedRowMapper);
        AwareRowMapper<ComplexEntity> rowMapper = new AwareRowMapper<>(ComplexEntity.class, mappers);
        ComplexEntity actual = rowMapper.mapRow(mockResultSet, 0);
        assertEquals(expected, actual);
    }
}