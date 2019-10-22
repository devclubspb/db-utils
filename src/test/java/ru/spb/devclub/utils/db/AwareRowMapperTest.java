package ru.spb.devclub.utils.db;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.assertEquals;

public class AwareRowMapperTest {
    @Mock
    private ResultSet mockResultSet;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void check() throws SQLException {
        Mockito.when(mockResultSet.getInt("integer")).thenReturn(10);
        Mockito.when(mockResultSet.getLong("longer")).thenReturn(20L);
        AwareRowMapper<PrimitiveEntity> rowMapper = new AwareRowMapper<>(PrimitiveEntity.class);
        PrimitiveEntity primitiveEntity = rowMapper.mapRow(mockResultSet, 0);
        assertEquals(new PrimitiveEntity(10, 20), primitiveEntity);
    }
}