package ru.spb.devclub.utils.db;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.sql.ResultSet;

@RunWith(MockitoJUnitRunner.class)
public abstract class BaseResultSetMockTest {
    @Mock
    protected ResultSet mockResultSet;
}
