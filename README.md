# db-utils [![Maven Central](https://img.shields.io/maven-central/v/ru.spb.devclub.utils/db-utils)](https://search.maven.org/artifact/ru.spb.devclub.utils/db-utils/0.3.2/jar)[![Javadocs](https://www.javadoc.io/badge/ru.spb.devclub.utils/db-utils.svg)](https://www.javadoc.io/doc/ru.spb.devclub.utils/db-utils/0.3.2)[![GitHub](https://img.shields.io/github/license/devclubspb/db-utils?style=flat&&color=informational)](LICENSE)

[![Build Status](https://travis-ci.com/devclubspb/db-utils.svg?branch=master)](https://travis-ci.com/devclubspb/db-utils)[![Codacy Badge](https://api.codacy.com/project/badge/Grade/cf3eeffef5864b09aa9f29ca7c4cd8b9)](https://www.codacy.com/manual/alexengrig/db-utils?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=devclubspb/db-utils&amp;utm_campaign=Badge_Grade)

This library contains useful utility classes to work with the database and to reduce boilerplate code.

## Installation

Releases are available in [Maven Central](https://repo1.maven.org/maven2/ru/spb/devclub/utils/db-utils/).

List of version [changes](CHANGES.md). 
List of version [migrations](MIGRATION.md).

### Maven

Add this snippet to the pom.xml `dependencies` section:

```xml
<dependency>
  <groupId>ru.spb.devclub.utils</groupId>
  <artifactId>db-utils</artifactId>
  <version>0.3.2</version>
</dependency>
```

### Gradle

Add this snippet to the build.gradle `dependencies` section:

```groovy
implementation 'ru.spb.devclub.utils:db-utils:0.3.2'
```

### Others

Others snippets are available in [The Central Repository](https://search.maven.org/artifact/ru.spb.devclub.utils/db-utils/0.3.2/jar).

## Usage

### ExtendedResultSet

The `java.sql.ResultSet` returns the default value for primitive types if the value is SQL `NULL`.

_ExtendedResultSet_ adds:

- boxed primitive types usage methods:

```java
void example(ExtendedResultSet rs) {
    Boolean booleanValue = rs.getBooleanOrNull(0);
    Integer intValue = rs.getIntOrNull("one");
    Long longValue = rs.getLongOrNull(2);
}
```

- local dates usage methods:

```java
void example(ExtendedResultSet rs) {
    LocalDate date = rs.getLocalDate(0);
    LocalTime time = rs.getLocalTime("one");
    LocalDateTime dateTime = rs.getLocalDateTime(2);
}
```

- enum usage methods:

```java
void example(ExtendedResultSet rs) {
    Thread.State zeroState = rs.getEnumByName(0);
    Thread.State firstState = rs.getEnumByOrdinal("one");
}
```

- `java.util.Optional` usage methods:

```java
void example(ExtendedResultSet rs){
    Optional<Boolean> booleanOptional = rs.getOptionalBoolean(0);
    Optional<Integer> intOptional = rs.getOptionalInt("one");
    Optional<Long> longOptional = rs.getOptionalLong(2);
}
```

Also for the all types from ResultSet.

### ExtendedRowMapper

The Spring-Jdbc 
[RowMapper](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/jdbc/core/RowMapper.html)
provides the `mapRow(rs:ResultSet, rowNum:int)` method.

_ExtendedRowMapper_ replaces the _ResultSet_ argument type of _RowMapper#mapRow_ with the _ExtendedResultSet_.

```java
import java.sql.SQLException;

public class ShortRowMapper implements ExtendedRowMapper<Short> {
    @Override
    public Short mapRow(ExtendedResultSet rs, int rowNum) throws SQLException {
        return rs.getShortOrNull(0);
    }
}
```

For use as Spring-Jdbc 
[RowMapper](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/jdbc/core/RowMapper.html)
, add `extends SpringRowMapper<T>` to _ExtendedRowMapper_ implementation.

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

## License

This project is [licensed](LICENSE) under [MIT License](https://opensource.org/licenses/MIT).
