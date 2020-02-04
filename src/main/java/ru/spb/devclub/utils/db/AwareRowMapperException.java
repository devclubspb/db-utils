package ru.spb.devclub.utils.db;

import java.sql.SQLException;

/**
 * <p>AwareRowMapperException class.</p>
 *
 * @author Grig Alex
 * @version 0.3.0
 * @since 0.3.0
 */
public class AwareRowMapperException extends SQLException {
    /**
     * <p>Constructor for AwareRowMapperException.</p>
     *
     * @param message a {@link java.lang.String} object.
     */
    public AwareRowMapperException(String message) {
        super(message);
    }

    /**
     * <p>Constructor for AwareRowMapperException.</p>
     *
     * @param message a {@link java.lang.String} object.
     * @param cause   a {@link java.lang.Throwable} object.
     */
    public AwareRowMapperException(String message, Throwable cause) {
        super(message, cause);
    }
}
