# Migration between releases

List of version [changes](CHANGES.md).

## 0.3.0

In ExtendedRowMapper implementation add `extends SpringRowMapper<T>`, if implementation used like Spring-Jdbc
[RowMapper](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/jdbc/core/RowMapper.html) 
implementation.

```java
class EntityRowMapper extends SpringRowMapper<Entity> implements ExtendedRowMapper<Entity> {
    @Override
    public Entity mapRow(ExtendedResultSet rs, int rowNum) {
        Entity entity = new Entity();
        // get values from rs and set to entity
        return entity;
    }
}
```

## 0.2.0

Replace BoxedResultSet and OptionalResultSet with ExtendedResultSet.

Replace BoxedRowMapper and OptionalRowMapper with ExtendedRowMapper.
