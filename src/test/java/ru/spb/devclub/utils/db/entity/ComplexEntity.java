package ru.spb.devclub.utils.db.entity;

import java.util.Objects;

public class ComplexEntity {
    private Long id;
    private String name;
    private int count;
    private boolean completed;
    private Boolean checked;
    private PrimitiveEntity primitiveChild;
    private BoxedEntity boxedChild;

    public ComplexEntity() {
    }

    public ComplexEntity(Long id, String name, int count, boolean completed, Boolean checked) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.completed = completed;
        this.checked = checked;
    }

    public ComplexEntity(Long id, String name, int count, boolean completed, Boolean checked,
                         PrimitiveEntity primitiveChild, BoxedEntity boxedChild) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.completed = completed;
        this.checked = checked;
        this.primitiveChild = primitiveChild;
        this.boxedChild = boxedChild;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }


    public void setPrimitiveChild(PrimitiveEntity primitiveChild) {
        this.primitiveChild = primitiveChild;
    }

    public void setBoxedChild(BoxedEntity boxedChild) {
        this.boxedChild = boxedChild;
    }

    @Override
    public String toString() {
        return "ComplexEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", completed=" + completed +
                ", checked=" + checked +
                ", primitiveChild=" + primitiveChild +
                ", boxedChild=" + boxedChild +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexEntity that = (ComplexEntity) o;
        return count == that.count &&
                completed == that.completed &&
                Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(checked, that.checked) &&
                Objects.equals(primitiveChild, that.primitiveChild) &&
                Objects.equals(boxedChild, that.boxedChild);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, count, completed, checked, primitiveChild, boxedChild);
    }
}
