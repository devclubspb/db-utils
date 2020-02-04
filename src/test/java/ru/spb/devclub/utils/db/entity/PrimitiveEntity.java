package ru.spb.devclub.utils.db.entity;

import java.util.Objects;

public class PrimitiveEntity {
    private int intField;
    private long longField;
    private double doubleField;
    private boolean booleanField;
    private float floatField;
    private short shortField;
    private byte byteField;
    private char charField;

    public PrimitiveEntity() {
    }

    public PrimitiveEntity(int intField, long longField, double doubleField, boolean booleanField, float floatField,
                           short shortField, byte byteField, char charField) {
        this.intField = intField;
        this.longField = longField;
        this.doubleField = doubleField;
        this.booleanField = booleanField;
        this.floatField = floatField;
        this.shortField = shortField;
        this.byteField = byteField;
        this.charField = charField;
    }

    public void setIntField(int intField) {
        this.intField = intField;
    }

    public void setLongField(long longField) {
        this.longField = longField;
    }

    public void setDoubleField(double doubleField) {
        this.doubleField = doubleField;
    }

    public void setBooleanField(boolean booleanField) {
        this.booleanField = booleanField;
    }

    public void setFloatField(float floatField) {
        this.floatField = floatField;
    }

    public void setShortField(short shortField) {
        this.shortField = shortField;
    }

    public void setByteField(byte byteField) {
        this.byteField = byteField;
    }

    public void setCharField(char charField) {
        this.charField = charField;
    }

    @Override
    public String toString() {
        return "PrimitiveEntity{" +
                "intField=" + intField +
                ", longField=" + longField +
                ", doubleField=" + doubleField +
                ", booleanField=" + booleanField +
                ", floatField=" + floatField +
                ", shortField=" + shortField +
                ", byteField=" + byteField +
                ", charFiled=" + charField +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrimitiveEntity that = (PrimitiveEntity) o;
        return intField == that.intField &&
                longField == that.longField &&
                Double.compare(that.doubleField, doubleField) == 0 &&
                booleanField == that.booleanField &&
                Float.compare(that.floatField, floatField) == 0 &&
                shortField == that.shortField &&
                byteField == that.byteField &&
                charField == that.charField;
    }

    @Override
    public int hashCode() {
        return Objects.hash(intField, longField, doubleField, booleanField, floatField, shortField, byteField, charField);
    }
}
