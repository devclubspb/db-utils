package ru.spb.devclub.utils.db.entity;

import java.util.Objects;

public class BoxedEntity {
    private Integer boxedIntField;
    private Long boxedLongField;
    private Double boxedDoubleField;
    private Boolean boxedBooleanField;
    private Float boxedFloatField;
    private Short boxedShortField;
    private Byte boxedByteField;

    public BoxedEntity() {
    }

    public BoxedEntity(Integer boxedIntField, Long boxedLongField, Double boxedDoubleField, Boolean boxedBooleanField,
                       Float boxedFloatField, Short boxedShortField, Byte boxedByteField) {
        this.boxedIntField = boxedIntField;
        this.boxedLongField = boxedLongField;
        this.boxedDoubleField = boxedDoubleField;
        this.boxedBooleanField = boxedBooleanField;
        this.boxedFloatField = boxedFloatField;
        this.boxedShortField = boxedShortField;
        this.boxedByteField = boxedByteField;
    }

    public void setBoxedIntField(Integer boxedIntField) {
        this.boxedIntField = boxedIntField;
    }

    public void setBoxedLongField(Long boxedLongField) {
        this.boxedLongField = boxedLongField;
    }

    public void setBoxedDoubleField(Double boxedDoubleField) {
        this.boxedDoubleField = boxedDoubleField;
    }

    public void setBoxedBooleanField(Boolean boxedBooleanField) {
        this.boxedBooleanField = boxedBooleanField;
    }

    public void setBoxedFloatField(Float boxedFloatField) {
        this.boxedFloatField = boxedFloatField;
    }

    public void setBoxedShortField(Short boxedShortField) {
        this.boxedShortField = boxedShortField;
    }

    public void setBoxedByteField(Byte boxedByteField) {
        this.boxedByteField = boxedByteField;
    }

    @Override
    public String toString() {
        return "BoxedEntity{" +
                "boxedIntField=" + boxedIntField +
                ", boxedLongField=" + boxedLongField +
                ", boxedDoubleField=" + boxedDoubleField +
                ", boxedBooleanField=" + boxedBooleanField +
                ", boxedFloatField=" + boxedFloatField +
                ", boxedShortField=" + boxedShortField +
                ", boxedByteField=" + boxedByteField +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoxedEntity that = (BoxedEntity) o;
        return Objects.equals(boxedIntField, that.boxedIntField) &&
                Objects.equals(boxedLongField, that.boxedLongField) &&
                Objects.equals(boxedDoubleField, that.boxedDoubleField) &&
                Objects.equals(boxedBooleanField, that.boxedBooleanField) &&
                Objects.equals(boxedFloatField, that.boxedFloatField) &&
                Objects.equals(boxedShortField, that.boxedShortField) &&
                Objects.equals(boxedByteField, that.boxedByteField);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boxedIntField, boxedLongField, boxedDoubleField, boxedBooleanField, boxedFloatField, boxedShortField, boxedByteField);
    }
}
