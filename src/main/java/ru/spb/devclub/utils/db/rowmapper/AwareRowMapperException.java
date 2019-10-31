package ru.spb.devclub.utils.db.rowmapper;

import java.sql.SQLException;

public class AwareRowMapperException extends SQLException {
    public AwareRowMapperException(String message) {
        super(message);
    }

    public AwareRowMapperException(String message, Throwable cause) {
        super(message, cause);
    }
}
