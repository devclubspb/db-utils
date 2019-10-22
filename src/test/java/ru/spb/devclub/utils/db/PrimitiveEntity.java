package ru.spb.devclub.utils.db;

import java.util.Objects;

public class PrimitiveEntity {
    private int integer;
    private long longer;

    public PrimitiveEntity() {
    }

    public PrimitiveEntity(int integer, long longer) {
        this.integer = integer;
        this.longer = longer;
    }

    public void setInteger(int integer) {
        this.integer = integer;
    }

    public void setLonger(long longer) {
        this.longer = longer;
    }

    @Override
    public String toString() {
        return "PrimitiveEntity{" +
                "integer=" + integer +
                ", longer=" + longer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrimitiveEntity that = (PrimitiveEntity) o;
        return integer == that.integer &&
                longer == that.longer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(integer, longer);
    }
}
