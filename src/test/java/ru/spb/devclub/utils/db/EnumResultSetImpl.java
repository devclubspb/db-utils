package ru.spb.devclub.utils.db;

import java.sql.SQLException;

public class EnumResultSetImpl extends AbstractResultSet {
    private String value;

    public EnumResultSetImpl(String value) {
        this.value = value;
    }

    public String getString(String columnLabel) throws SQLException {
        return value;
    }
}
