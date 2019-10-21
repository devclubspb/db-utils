package ru.spb.devclub.utils.db;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.assertEquals;

public class OptionalRowMapperTest {
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
        Mockito.when(mockResultSet.getInt(OptionalRowMapperTest.EntityRowMapper.ID_COLUMN_NAME)).thenReturn(id);
        Mockito.when(mockResultSet.getString(OptionalRowMapperTest.EntityRowMapper.NAME_COLUMN_NAME)).thenReturn(name);
        OptionalRowMapperTest.EntityRowMapper entityRowMapper = new OptionalRowMapperTest.EntityRowMapper();
        Entity actual = entityRowMapper.mapRow(mockResultSet, rowNum);
        assertEquals(expected, actual);
    }

    public static class EntityRowMapper implements OptionalRowMapper<Entity> {
        static String ID_COLUMN_NAME = "ID";
        static String NAME_COLUMN_NAME = "NAME";

        @Override
        public Entity mapRow(OptionalResultSet rs, int rowNum) throws SQLException {
            Entity entity = new Entity();
            entity.setId(rs.getOptionalInt(ID_COLUMN_NAME).orElseThrow(SQLException::new));
            entity.setName(rs.getOptionalString(NAME_COLUMN_NAME).orElse("none"));
            return entity;
        }
    }
}