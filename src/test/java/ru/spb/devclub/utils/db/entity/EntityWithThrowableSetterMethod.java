package ru.spb.devclub.utils.db.entity;

public class EntityWithThrowableSetterMethod {
    @SuppressWarnings("unused")
    private String ignored;

    @SuppressWarnings("unused")
    public void setIgnored(@SuppressWarnings("unused") String ignored) throws IllegalAccessException {
        throw new IllegalAccessException();
    }
}
