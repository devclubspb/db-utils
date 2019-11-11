package ru.spb.devclub.utils.db;

import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.sql.ResultSet;

public abstract class BaseResultSetMockTest {
    @Mock
    protected ResultSet mockResultSet;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
}
