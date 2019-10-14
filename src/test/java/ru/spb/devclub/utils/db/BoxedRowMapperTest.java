package ru.spb.devclub.utils.db;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.assertEquals;

public class BoxedRowMapperTest {
    @Mock
    private ResultSet mockResultSet;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void checkExpectedValue() throws SQLException {
        int rowNum = 0;
        int id = 40_000;
        String name = "forty thousand";
        Entity expected = new Entity(id, name);
        Mockito.when(mockResultSet.getInt(EntityRowMapper.ID_COLUMN_NAME)).thenReturn(id);
        Mockito.when(mockResultSet.getString(EntityRowMapper.NAME_COLUMN_NAME)).thenReturn(name);
        EntityRowMapper entityRowMapper = new EntityRowMapper();
        Entity actual = entityRowMapper.mapRow(mockResultSet, rowNum);
        assertEquals(expected, actual);
    }

    public static class EntityRowMapper implements BoxedRowMapper<Entity> {
        public static String ID_COLUMN_NAME = "ID";
        public static String NAME_COLUMN_NAME = "NAME";

        @Override
        public Entity mapRow(BoxedResultSet resultSet, int i) throws SQLException {
            Entity entity = new Entity();
            entity.setId(resultSet.getIntOrNull(ID_COLUMN_NAME));
            entity.setName(resultSet.getString(NAME_COLUMN_NAME));
            return entity;
        }
    }
}