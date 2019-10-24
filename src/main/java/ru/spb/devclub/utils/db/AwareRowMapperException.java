package ru.spb.devclub.utils.db;

import java.sql.SQLException;

public class AwareRowMapperException extends SQLException {
    public AwareRowMapperException(String message, Throwable cause) {
        super(message, cause);
    }
}
