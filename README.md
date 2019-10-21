# db-utils [![Maven Central](https://img.shields.io/maven-central/v/ru.spb.devclub.utils/db-utils)](https://search.maven.org/artifact/ru.spb.devclub.utils/db-utils/0.1.0/jar)[![Javadocs](https://www.javadoc.io/badge/ru.spb.devclub.utils/db-utils.svg)](https://www.javadoc.io/doc/ru.spb.devclub.utils/db-utils/0.1.0)[![GitHub](https://img.shields.io/github/license/devclubspb/db-utils?style=flat&&color=informational)](LICENSE)

[![Build Status](https://travis-ci.com/devclubspb/db-utils.svg?branch=master)](https://travis-ci.com/devclubspb/db-utils)[![Codacy Badge](https://api.codacy.com/project/badge/Grade/cf3eeffef5864b09aa9f29ca7c4cd8b9)](https://www.codacy.com/manual/alexengrig/db-utils?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=devclubspb/db-utils&amp;utm_campaign=Badge_Grade)

Database utilities.

## Installation

Releases are available in [Maven Central](https://repo1.maven.org/maven2/ru/spb/devclub/utils/db-utils/).

List of version [changes](CHANGES.md).

### Maven

Add this snippet to the pom.xml `dependencies` section:

```xml
<dependency>
  <groupId>ru.spb.devclub.utils</groupId>
  <artifactId>db-utils</artifactId>
  <version>0.1.0</version>
</dependency>
```

### Gradle

Add this snippet to the build.gradle `dependencies` section:

```groovy
implementation 'ru.spb.devclub.utils:db-utils:0.1.0'
```

### Others

Others snippets are available in [The Central Repository](https://search.maven.org/artifact/ru.spb.devclub.utils/db-utils/0.1.0/jar).

## Usage

### Extended ResultSet

#### BoxedResultSet

The `java.sql.ResultSet` returns the default value for primitive types if the value is SQL `NULL`.
_BoxedResultSet_ adds boxed primitive types usage methods.

```java
void example(BoxedResultSet rs) {
    Boolean booleanValue = rs.getBooleanOrNull(0);
    booleanValue = rs.getBooleanOrNull("zero");
    Byte byteValue = rs.getByteOrNull(1);
    byteValue = rs.getByteOrNull("one");
    Short shortValue = rs.getShortOrNull(2);
    shortValue = rs.getShortOrNull("two");
    Integer intValue = rs.getIntOrNull(3);
    intValue = rs.getIntOrNull("three");
    Long longValue = rs.getLongOrNull(4);
    longValue = rs.getLongOrNull("four");
    Float floatValue = rs.getFloatOrNull(5);
    floatValue = rs.getFloatOrNull("five");
    Double doubleValue = rs.getDoubleOrNull(6);
    doubleValue = rs.getDoubleOrNull("six");
}
```

#### OptionalResultSet

_OptionalResultSet_ adds `java.util.Optional` usage methods.

```java
void example(OptionalResultSet rs){
    Optional<Boolean> booleanOptional = rs.getOptionalBoolean(0);
    booleanOptional = rs.getOptionalBoolean("zero");
    Optional<Byte> byteOptional = rs.getOptionalByte(1);
    byteOptional = rs.getOptionalByte("one");
    Optional<Short> shortOptional = rs.getOptionalShort(2);
    shortOptional = rs.getOptionalShort("two");
    Optional<Integer> intOptional = rs.getOptionalInt(3);
    intOptional = rs.getOptionalInt("three");
    Optional<Long> longOptional = rs.getOptionalLong(4);
    longOptional = rs.getOptionalLong("four");
    Optional<Float> floatOptional = rs.getOptionalFloat(5);
    floatOptional = rs.getOptionalFloat("five");
    Optional<Double> doubleOptional = rs.getOptionalDouble(6);
    doubleOptional = rs.getOptionalDouble("six");
}
```

Also for the following types: `byte[], BigDecimal, Date, Time, Timestamp, Ref, Blob, Clob, Array`.

### Extended RowMapper

The `org.springframework.jdbc.core.RowMapper` provides the `mapRow(rs:ResultSet, rowNum:int)` method.

#### BoxedRowMapper

_BoxedRowMapper_ replaces the _ResultSet_ argument type of _RowMapper#mapRow_ with the _BoxedResultSet_.

```java
import java.sql.SQLException;

import ru.spb.devclub.utils.db.BoxedResultSet;
import ru.spb.devclub.utils.db.BoxedRowMapper;

public class ShortRowMapper implements BoxedRowMapper<Short> {
    @Override
    public Short mapRow(BoxedResultSet rs, int rowNum) throws SQLException {
        return rs.getShortOrNull(0);
    }
}
```

#### OptionalRowMapper

_OptionalRowMapper_ replaces the _ResultSet_ argument type of _RowMapper#mapRow_ with the _OptionalResultSet_.

```java
import java.sql.SQLException;

import ru.spb.devclub.utils.db.OptionalResultSet;
import ru.spb.devclub.utils.db.OptionalRowMapper;

public class FloatRowMapper implements OptionalRowMapper<Float> {
    @Override
    public Float mapRow(OptionalResultSet rs, int rowNum) throws SQLException {
        return rs.getOptionalFloat(0).orElse(-1.0f);
    }
}
```

## License

This project is [licensed](LICENSE) under [MIT License](https://opensource.org/licenses/MIT).
