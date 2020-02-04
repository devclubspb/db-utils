package ru.spb.devclub.utils.db;

import org.junit.Test;
import org.mockito.Mockito;

import java.sql.SQLException;

import static org.junit.Assert.assertEquals;

public class ExtendedRowMapperTest extends BaseResultSetMockTest {
    @Test
    public void checkBoxedExpectedValue() throws SQLException {
        int rowNum = 0;
        int id = 40_000;
        String name = "forty thousand";
        Entity expected = new Entity(id, name);
        Mockito.when(mockResultSet.getInt(BoxedEntityRowMapper.ID_COLUMN_NAME)).thenReturn(id);
        Mockito.when(mockResultSet.getString(BoxedEntityRowMapper.NAME_COLUMN_NAME)).thenReturn(name);
        BoxedEntityRowMapper extendedRowMapper = new BoxedEntityRowMapper();
        Entity actual = extendedRowMapper.mapRow(mockResultSet, rowNum);
        assertEquals(expected, actual);
    }

    public static class BoxedEntityRowMapper extends SpringRowMapper<Entity> implements ExtendedRowMapper<Entity> {
        static String ID_COLUMN_NAME = "ID";
        static String NAME_COLUMN_NAME = "NAME";

        @Override
        public Entity mapRow(ExtendedResultSet rs, int rowNum) throws SQLException {
            Entity entity = new Entity();
            entity.setId(rs.getIntOrNull(ID_COLUMN_NAME));
            entity.setName(rs.getString(NAME_COLUMN_NAME));
            return entity;
        }
    }

    @Test
    public void checkOptionalExpectedValue() throws SQLException {
        int rowNum = 0;
        int id = 40_000;
        String name = "forty thousand";
        Entity expected = new Entity(id, name);
        Mockito.when(mockResultSet.getInt(OptionalEntityRowMapper.ID_COLUMN_NAME)).thenReturn(id);
        Mockito.when(mockResultSet.getString(OptionalEntityRowMapper.NAME_COLUMN_NAME)).thenReturn(name);
        OptionalEntityRowMapper extendedRowMapper = new OptionalEntityRowMapper();
        Entity actual = extendedRowMapper.mapRow(mockResultSet, rowNum);
        assertEquals(expected, actual);
    }

    public static class OptionalEntityRowMapper extends SpringRowMapper<Entity> implements ExtendedRowMapper<Entity> {
        static String ID_COLUMN_NAME = "ID";
        static String NAME_COLUMN_NAME = "NAME";

        @Override
        public Entity mapRow(ExtendedResultSet rs, int rowNum) throws SQLException {
            Entity entity = new Entity();
            entity.setId(rs.getOptionalInt(ID_COLUMN_NAME).orElseThrow(SQLException::new));
            entity.setName(rs.getOptionalString(NAME_COLUMN_NAME).orElse("none"));
            return entity;
        }
    }
}
