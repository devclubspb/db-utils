package ru.spb.devclub.utils.db;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.*;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class SpringRowMapperTest {
    @Test
    public void test() {
        Entity expected = new Entity(1, "one");
        JdbcOperations jdbcOperations = new JdbcOperations() {
            @Override
            public <T> T execute(ConnectionCallback<T> connectionCallback) throws DataAccessException {
                return null;
            }

            @Override
            public <T> T execute(StatementCallback<T> statementCallback) throws DataAccessException {
                return null;
            }

            @Override
            public void execute(String s) throws DataAccessException {

            }

            @Override
            public <T> T query(String s, ResultSetExtractor<T> resultSetExtractor) throws DataAccessException {
                return null;
            }

            @Override
            public void query(String s, RowCallbackHandler rowCallbackHandler) throws DataAccessException {

            }

            @Override
            public <T> List<T> query(String s, RowMapper<T> rowMapper) throws DataAccessException {
                return null;
            }

            @Override
            public <T> T queryForObject(String s, RowMapper<T> rowMapper) throws DataAccessException {
                return (T) expected;
            }

            @Override
            public <T> T queryForObject(String s, Class<T> aClass) throws DataAccessException {
                return null;
            }

            @Override
            public Map<String, Object> queryForMap(String s) throws DataAccessException {
                return null;
            }

            @Override
            public <T> List<T> queryForList(String s, Class<T> aClass) throws DataAccessException {
                return null;
            }

            @Override
            public List<Map<String, Object>> queryForList(String s) throws DataAccessException {
                return null;
            }

            @Override
            public SqlRowSet queryForRowSet(String s) throws DataAccessException {
                return null;
            }

            @Override
            public int update(String s) throws DataAccessException {
                return 0;
            }

            @Override
            public int[] batchUpdate(String... strings) throws DataAccessException {
                return new int[0];
            }

            @Override
            public <T> T execute(PreparedStatementCreator preparedStatementCreator, PreparedStatementCallback<T> preparedStatementCallback) throws DataAccessException {
                return null;
            }

            @Override
            public <T> T execute(String s, PreparedStatementCallback<T> preparedStatementCallback) throws DataAccessException {
                return null;
            }

            @Override
            public <T> T query(PreparedStatementCreator preparedStatementCreator, ResultSetExtractor<T> resultSetExtractor) throws DataAccessException {
                return null;
            }

            @Override
            public <T> T query(String s, PreparedStatementSetter preparedStatementSetter, ResultSetExtractor<T> resultSetExtractor) throws DataAccessException {
                return null;
            }

            @Override
            public <T> T query(String s, Object[] objects, int[] ints, ResultSetExtractor<T> resultSetExtractor) throws DataAccessException {
                return null;
            }

            @Override
            public <T> T query(String s, Object[] objects, ResultSetExtractor<T> resultSetExtractor) throws DataAccessException {
                return null;
            }

            @Override
            public <T> T query(String s, ResultSetExtractor<T> resultSetExtractor, Object... objects) throws DataAccessException {
                return null;
            }

            @Override
            public void query(PreparedStatementCreator preparedStatementCreator, RowCallbackHandler rowCallbackHandler) throws DataAccessException {

            }

            @Override
            public void query(String s, PreparedStatementSetter preparedStatementSetter, RowCallbackHandler rowCallbackHandler) throws DataAccessException {

            }

            @Override
            public void query(String s, Object[] objects, int[] ints, RowCallbackHandler rowCallbackHandler) throws DataAccessException {

            }

            @Override
            public void query(String s, Object[] objects, RowCallbackHandler rowCallbackHandler) throws DataAccessException {

            }

            @Override
            public void query(String s, RowCallbackHandler rowCallbackHandler, Object... objects) throws DataAccessException {

            }

            @Override
            public <T> List<T> query(PreparedStatementCreator preparedStatementCreator, RowMapper<T> rowMapper) throws DataAccessException {
                return null;
            }

            @Override
            public <T> List<T> query(String s, PreparedStatementSetter preparedStatementSetter, RowMapper<T> rowMapper) throws DataAccessException {
                return null;
            }

            @Override
            public <T> List<T> query(String s, Object[] objects, int[] ints, RowMapper<T> rowMapper) throws DataAccessException {
                return null;
            }

            @Override
            public <T> List<T> query(String s, Object[] objects, RowMapper<T> rowMapper) throws DataAccessException {
                return null;
            }

            @Override
            public <T> List<T> query(String s, RowMapper<T> rowMapper, Object... objects) throws DataAccessException {
                return null;
            }

            @Override
            public <T> T queryForObject(String s, Object[] objects, int[] ints, RowMapper<T> rowMapper) throws DataAccessException {
                return null;
            }

            @Override
            public <T> T queryForObject(String s, Object[] objects, RowMapper<T> rowMapper) throws DataAccessException {
                return null;
            }

            @Override
            public <T> T queryForObject(String s, RowMapper<T> rowMapper, Object... objects) throws DataAccessException {
                return null;
            }

            @Override
            public <T> T queryForObject(String s, Object[] objects, int[] ints, Class<T> aClass) throws DataAccessException {
                return null;
            }

            @Override
            public <T> T queryForObject(String s, Object[] objects, Class<T> aClass) throws DataAccessException {
                return null;
            }

            @Override
            public <T> T queryForObject(String s, Class<T> aClass, Object... objects) throws DataAccessException {
                return null;
            }

            @Override
            public Map<String, Object> queryForMap(String s, Object[] objects, int[] ints) throws DataAccessException {
                return null;
            }

            @Override
            public Map<String, Object> queryForMap(String s, Object... objects) throws DataAccessException {
                return null;
            }

            @Override
            public <T> List<T> queryForList(String s, Object[] objects, int[] ints, Class<T> aClass) throws DataAccessException {
                return null;
            }

            @Override
            public <T> List<T> queryForList(String s, Object[] objects, Class<T> aClass) throws DataAccessException {
                return null;
            }

            @Override
            public <T> List<T> queryForList(String s, Class<T> aClass, Object... objects) throws DataAccessException {
                return null;
            }

            @Override
            public List<Map<String, Object>> queryForList(String s, Object[] objects, int[] ints) throws DataAccessException {
                return null;
            }

            @Override
            public List<Map<String, Object>> queryForList(String s, Object... objects) throws DataAccessException {
                return null;
            }

            @Override
            public SqlRowSet queryForRowSet(String s, Object[] objects, int[] ints) throws DataAccessException {
                return null;
            }

            @Override
            public SqlRowSet queryForRowSet(String s, Object... objects) throws DataAccessException {
                return null;
            }

            @Override
            public int update(PreparedStatementCreator preparedStatementCreator) throws DataAccessException {
                return 0;
            }

            @Override
            public int update(PreparedStatementCreator preparedStatementCreator, KeyHolder keyHolder) throws DataAccessException {
                return 0;
            }

            @Override
            public int update(String s, PreparedStatementSetter preparedStatementSetter) throws DataAccessException {
                return 0;
            }

            @Override
            public int update(String s, Object[] objects, int[] ints) throws DataAccessException {
                return 0;
            }

            @Override
            public int update(String s, Object... objects) throws DataAccessException {
                return 0;
            }

            @Override
            public int[] batchUpdate(String s, BatchPreparedStatementSetter batchPreparedStatementSetter) throws DataAccessException {
                return new int[0];
            }

            @Override
            public int[] batchUpdate(String s, List<Object[]> list) throws DataAccessException {
                return new int[0];
            }

            @Override
            public int[] batchUpdate(String s, List<Object[]> list, int[] ints) throws DataAccessException {
                return new int[0];
            }

            @Override
            public <T> int[][] batchUpdate(String s, Collection<T> collection, int i, ParameterizedPreparedStatementSetter<T> parameterizedPreparedStatementSetter) throws DataAccessException {
                return new int[0][];
            }

            @Override
            public <T> T execute(CallableStatementCreator callableStatementCreator, CallableStatementCallback<T> callableStatementCallback) throws DataAccessException {
                return null;
            }

            @Override
            public <T> T execute(String s, CallableStatementCallback<T> callableStatementCallback) throws DataAccessException {
                return null;
            }

            @Override
            public Map<String, Object> call(CallableStatementCreator callableStatementCreator, List<SqlParameter> list) throws DataAccessException {
                return null;
            }
        };
        RowMapper<Entity> rowMapper = new EntitySpringRowMapper();
        Entity actual = jdbcOperations.queryForObject("select * from entity", rowMapper);
        Assert.assertEquals(expected, actual);
    }

    static class EntitySpringRowMapper extends SpringRowMapper<Entity> implements RowMapper<Entity> {
        @Override
        public Entity mapRow(ExtendedResultSet rs, int rowNum) {
            return null;
        }
    }
}