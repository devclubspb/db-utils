package ru.spb.devclub.utils.db;

import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLException;

public class ResultSetUtilsTest {

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
}