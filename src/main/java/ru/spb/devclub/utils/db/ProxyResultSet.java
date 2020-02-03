package ru.spb.devclub.utils.db;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.Calendar;
import java.util.Map;

abstract class ProxyResultSet implements ResultSet {
    @SuppressWarnings("WeakerAccess")
    protected final ResultSet resultSet;

    @SuppressWarnings("WeakerAccess")
    /**
     * <p>Constructor for ProxyResultSet.</p>
     *
     * @param resultSet a {@link java.sql.ResultSet} object.
     */
    protected ProxyResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean next() throws SQLException {
        return resultSet.next();
    }

    /** {@inheritDoc} */
    @Override
    public void close() throws SQLException {
        resultSet.close();
    }

    /** {@inheritDoc} */
    @Override
    public boolean wasNull() throws SQLException {
        return resultSet.wasNull();
    }

    /** {@inheritDoc} */
    @Override
    public String getString(int columnIndex) throws SQLException {
        return resultSet.getString(columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public boolean getBoolean(int columnIndex) throws SQLException {
        return resultSet.getBoolean(columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public byte getByte(int columnIndex) throws SQLException {
        return resultSet.getByte(columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public short getShort(int columnIndex) throws SQLException {
        return resultSet.getShort(columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public int getInt(int columnIndex) throws SQLException {
        return resultSet.getInt(columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public long getLong(int columnIndex) throws SQLException {
        return resultSet.getLong(columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public float getFloat(int columnIndex) throws SQLException {
        return resultSet.getFloat(columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public double getDouble(int columnIndex) throws SQLException {
        return resultSet.getDouble(columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    @Deprecated
    public BigDecimal getBigDecimal(int columnIndex, int scale) throws SQLException {
        return resultSet.getBigDecimal(columnIndex, scale);
    }

    /** {@inheritDoc} */
    @Override
    public byte[] getBytes(int columnIndex) throws SQLException {
        return resultSet.getBytes(columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public Date getDate(int columnIndex) throws SQLException {
        return resultSet.getDate(columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public Time getTime(int columnIndex) throws SQLException {
        return resultSet.getTime(columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public Timestamp getTimestamp(int columnIndex) throws SQLException {
        return resultSet.getTimestamp(columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public InputStream getAsciiStream(int columnIndex) throws SQLException {
        return resultSet.getAsciiStream(columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    @Deprecated
    public InputStream getUnicodeStream(int columnIndex) throws SQLException {
        return resultSet.getUnicodeStream(columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public InputStream getBinaryStream(int columnIndex) throws SQLException {
        return resultSet.getBinaryStream(columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public String getString(String columnLabel) throws SQLException {
        return resultSet.getString(columnLabel);
    }

    /** {@inheritDoc} */
    @Override
    public boolean getBoolean(String columnLabel) throws SQLException {
        return resultSet.getBoolean(columnLabel);
    }

    /** {@inheritDoc} */
    @Override
    public byte getByte(String columnLabel) throws SQLException {
        return resultSet.getByte(columnLabel);
    }

    /** {@inheritDoc} */
    @Override
    public short getShort(String columnLabel) throws SQLException {
        return resultSet.getShort(columnLabel);
    }

    /** {@inheritDoc} */
    @Override
    public int getInt(String columnLabel) throws SQLException {
        return resultSet.getInt(columnLabel);
    }

    /** {@inheritDoc} */
    @Override
    public long getLong(String columnLabel) throws SQLException {
        return resultSet.getLong(columnLabel);
    }

    /** {@inheritDoc} */
    @Override
    public float getFloat(String columnLabel) throws SQLException {
        return resultSet.getFloat(columnLabel);
    }

    /** {@inheritDoc} */
    @Override
    public double getDouble(String columnLabel) throws SQLException {
        return resultSet.getDouble(columnLabel);
    }

    /** {@inheritDoc} */
    @Override
    @Deprecated
    public BigDecimal getBigDecimal(String columnLabel, int scale) throws SQLException {
        return resultSet.getBigDecimal(columnLabel, scale);
    }

    /** {@inheritDoc} */
    @Override
    public byte[] getBytes(String columnLabel) throws SQLException {
        return resultSet.getBytes(columnLabel);
    }

    /** {@inheritDoc} */
    @Override
    public Date getDate(String columnLabel) throws SQLException {
        return resultSet.getDate(columnLabel);
    }

    /** {@inheritDoc} */
    @Override
    public Time getTime(String columnLabel) throws SQLException {
        return resultSet.getTime(columnLabel);
    }

    /** {@inheritDoc} */
    @Override
    public Timestamp getTimestamp(String columnLabel) throws SQLException {
        return resultSet.getTimestamp(columnLabel);
    }

    /** {@inheritDoc} */
    @Override
    public InputStream getAsciiStream(String columnLabel) throws SQLException {
        return resultSet.getAsciiStream(columnLabel);
    }

    /** {@inheritDoc} */
    @Override
    @Deprecated
    public InputStream getUnicodeStream(String columnLabel) throws SQLException {
        return resultSet.getUnicodeStream(columnLabel);
    }

    /** {@inheritDoc} */
    @Override
    public InputStream getBinaryStream(String columnLabel) throws SQLException {
        return resultSet.getBinaryStream(columnLabel);
    }

    /** {@inheritDoc} */
    @Override
    public SQLWarning getWarnings() throws SQLException {
        return resultSet.getWarnings();
    }

    /** {@inheritDoc} */
    @Override
    public void clearWarnings() throws SQLException {
        resultSet.clearWarnings();
    }

    /** {@inheritDoc} */
    @Override
    public String getCursorName() throws SQLException {
        return resultSet.getCursorName();
    }

    /** {@inheritDoc} */
    @Override
    public ResultSetMetaData getMetaData() throws SQLException {
        return resultSet.getMetaData();
    }

    /** {@inheritDoc} */
    @Override
    public Object getObject(int columnIndex) throws SQLException {
        return resultSet.getObject(columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public Object getObject(String columnLabel) throws SQLException {
        return resultSet.getObject(columnLabel);
    }

    /** {@inheritDoc} */
    @Override
    public int findColumn(String columnLabel) throws SQLException {
        return resultSet.findColumn(columnLabel);
    }

    /** {@inheritDoc} */
    @Override
    public Reader getCharacterStream(int columnIndex) throws SQLException {
        return resultSet.getCharacterStream(columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public Reader getCharacterStream(String columnLabel) throws SQLException {
        return resultSet.getCharacterStream(columnLabel);
    }

    /** {@inheritDoc} */
    @Override
    public BigDecimal getBigDecimal(int columnIndex) throws SQLException {
        return resultSet.getBigDecimal(columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public BigDecimal getBigDecimal(String columnLabel) throws SQLException {
        return resultSet.getBigDecimal(columnLabel);
    }

    /** {@inheritDoc} */
    @Override
    public boolean isBeforeFirst() throws SQLException {
        return resultSet.isBeforeFirst();
    }

    /** {@inheritDoc} */
    @Override
    public boolean isAfterLast() throws SQLException {
        return resultSet.isAfterLast();
    }

    /** {@inheritDoc} */
    @Override
    public boolean isFirst() throws SQLException {
        return resultSet.isFirst();
    }

    /** {@inheritDoc} */
    @Override
    public boolean isLast() throws SQLException {
        return resultSet.isLast();
    }

    /** {@inheritDoc} */
    @Override
    public void beforeFirst() throws SQLException {
        resultSet.beforeFirst();
    }

    /** {@inheritDoc} */
    @Override
    public void afterLast() throws SQLException {
        resultSet.afterLast();
    }

    /** {@inheritDoc} */
    @Override
    public boolean first() throws SQLException {
        return resultSet.first();
    }

    /** {@inheritDoc} */
    @Override
    public boolean last() throws SQLException {
        return resultSet.last();
    }

    /** {@inheritDoc} */
    @Override
    public int getRow() throws SQLException {
        return resultSet.getRow();
    }

    /** {@inheritDoc} */
    @Override
    public boolean absolute(int row) throws SQLException {
        return resultSet.absolute(row);
    }

    /** {@inheritDoc} */
    @Override
    public boolean relative(int rows) throws SQLException {
        return resultSet.relative(rows);
    }

    /** {@inheritDoc} */
    @Override
    public boolean previous() throws SQLException {
        return resultSet.previous();
    }

    /** {@inheritDoc} */
    @Override
    public int getFetchDirection() throws SQLException {
        return resultSet.getFetchDirection();
    }

    /** {@inheritDoc} */
    @Override
    public void setFetchDirection(int direction) throws SQLException {
        resultSet.setFetchDirection(direction);
    }

    /** {@inheritDoc} */
    @Override
    public int getFetchSize() throws SQLException {
        return resultSet.getFetchSize();
    }

    /** {@inheritDoc} */
    @Override
    public void setFetchSize(int rows) throws SQLException {
        resultSet.setFetchSize(rows);
    }

    /** {@inheritDoc} */
    @Override
    public int getType() throws SQLException {
        return resultSet.getType();
    }

    /** {@inheritDoc} */
    @Override
    public int getConcurrency() throws SQLException {
        return resultSet.getConcurrency();
    }

    /** {@inheritDoc} */
    @Override
    public boolean rowUpdated() throws SQLException {
        return resultSet.rowUpdated();
    }

    /** {@inheritDoc} */
    @Override
    public boolean rowInserted() throws SQLException {
        return resultSet.rowInserted();
    }

    /** {@inheritDoc} */
    @Override
    public boolean rowDeleted() throws SQLException {
        return resultSet.rowDeleted();
    }

    /** {@inheritDoc} */
    @Override
    public void updateNull(int columnIndex) throws SQLException {
        resultSet.updateNull(columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public void updateBoolean(int columnIndex, boolean x) throws SQLException {
        resultSet.updateBoolean(columnIndex, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateByte(int columnIndex, byte x) throws SQLException {
        resultSet.updateByte(columnIndex, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateShort(int columnIndex, short x) throws SQLException {
        resultSet.updateShort(columnIndex, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateInt(int columnIndex, int x) throws SQLException {
        resultSet.updateInt(columnIndex, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateLong(int columnIndex, long x) throws SQLException {
        resultSet.updateLong(columnIndex, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateFloat(int columnIndex, float x) throws SQLException {
        resultSet.updateFloat(columnIndex, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateDouble(int columnIndex, double x) throws SQLException {
        resultSet.updateDouble(columnIndex, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateBigDecimal(int columnIndex, BigDecimal x) throws SQLException {
        resultSet.updateBigDecimal(columnIndex, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateString(int columnIndex, String x) throws SQLException {
        resultSet.updateString(columnIndex, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateBytes(int columnIndex, byte[] x) throws SQLException {
        resultSet.updateBytes(columnIndex, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateDate(int columnIndex, Date x) throws SQLException {
        resultSet.updateDate(columnIndex, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateTime(int columnIndex, Time x) throws SQLException {
        resultSet.updateTime(columnIndex, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateTimestamp(int columnIndex, Timestamp x) throws SQLException {
        resultSet.updateTimestamp(columnIndex, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateAsciiStream(int columnIndex, InputStream x, int length) throws SQLException {
        resultSet.updateAsciiStream(columnIndex, x, length);
    }

    /** {@inheritDoc} */
    @Override
    public void updateBinaryStream(int columnIndex, InputStream x, int length) throws SQLException {
        resultSet.updateBinaryStream(columnIndex, x, length);
    }

    /** {@inheritDoc} */
    @Override
    public void updateCharacterStream(int columnIndex, Reader x, int length) throws SQLException {
        resultSet.updateCharacterStream(columnIndex, x, length);
    }

    /** {@inheritDoc} */
    @Override
    public void updateObject(int columnIndex, Object x, int scaleOrLength) throws SQLException {
        resultSet.updateObject(columnIndex, x, scaleOrLength);
    }

    /** {@inheritDoc} */
    @Override
    public void updateObject(int columnIndex, Object x) throws SQLException {
        resultSet.updateObject(columnIndex, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateNull(String columnLabel) throws SQLException {
        resultSet.updateNull(columnLabel);
    }

    /** {@inheritDoc} */
    @Override
    public void updateBoolean(String columnLabel, boolean x) throws SQLException {
        resultSet.updateBoolean(columnLabel, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateByte(String columnLabel, byte x) throws SQLException {
        resultSet.updateByte(columnLabel, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateShort(String columnLabel, short x) throws SQLException {
        resultSet.updateShort(columnLabel, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateInt(String columnLabel, int x) throws SQLException {
        resultSet.updateInt(columnLabel, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateLong(String columnLabel, long x) throws SQLException {
        resultSet.updateLong(columnLabel, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateFloat(String columnLabel, float x) throws SQLException {
        resultSet.updateFloat(columnLabel, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateDouble(String columnLabel, double x) throws SQLException {
        resultSet.updateDouble(columnLabel, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateBigDecimal(String columnLabel, BigDecimal x) throws SQLException {
        resultSet.updateBigDecimal(columnLabel, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateString(String columnLabel, String x) throws SQLException {
        resultSet.updateString(columnLabel, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateBytes(String columnLabel, byte[] x) throws SQLException {
        resultSet.updateBytes(columnLabel, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateDate(String columnLabel, Date x) throws SQLException {
        resultSet.updateDate(columnLabel, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateTime(String columnLabel, Time x) throws SQLException {
        resultSet.updateTime(columnLabel, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateTimestamp(String columnLabel, Timestamp x) throws SQLException {
        resultSet.updateTimestamp(columnLabel, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateAsciiStream(String columnLabel, InputStream x, int length) throws SQLException {
        resultSet.updateBinaryStream(columnLabel, x, length);
    }

    /** {@inheritDoc} */
    @Override
    public void updateBinaryStream(String columnLabel, InputStream x, int length) throws SQLException {
        resultSet.updateBinaryStream(columnLabel, x, length);
    }

    /** {@inheritDoc} */
    @Override
    public void updateCharacterStream(String columnLabel, Reader reader, int length) throws SQLException {
        resultSet.updateCharacterStream(columnLabel, reader, length);
    }

    /** {@inheritDoc} */
    @Override
    public void updateObject(String columnLabel, Object x, int scaleOrLength) throws SQLException {
        resultSet.updateObject(columnLabel, x, scaleOrLength);
    }

    /** {@inheritDoc} */
    @Override
    public void updateObject(String columnLabel, Object x) throws SQLException {
        resultSet.updateObject(columnLabel, x);
    }

    /** {@inheritDoc} */
    @Override
    public void insertRow() throws SQLException {
        resultSet.insertRow();
    }

    /** {@inheritDoc} */
    @Override
    public void updateRow() throws SQLException {
        resultSet.updateRow();
    }

    /** {@inheritDoc} */
    @Override
    public void deleteRow() throws SQLException {
        resultSet.deleteRow();
    }

    /** {@inheritDoc} */
    @Override
    public void refreshRow() throws SQLException {
        resultSet.refreshRow();
    }

    /** {@inheritDoc} */
    @Override
    public void cancelRowUpdates() throws SQLException {
        resultSet.cancelRowUpdates();
    }

    /** {@inheritDoc} */
    @Override
    public void moveToInsertRow() throws SQLException {
        resultSet.moveToInsertRow();
    }

    /** {@inheritDoc} */
    @Override
    public void moveToCurrentRow() throws SQLException {
        resultSet.moveToCurrentRow();
    }

    /** {@inheritDoc} */
    @Override
    public Statement getStatement() throws SQLException {
        return resultSet.getStatement();
    }

    /** {@inheritDoc} */
    @Override
    public Object getObject(int columnIndex, Map<String, Class<?>> map) throws SQLException {
        return resultSet.getObject(columnIndex, map);
    }

    /** {@inheritDoc} */
    @Override
    public Ref getRef(int columnIndex) throws SQLException {
        return resultSet.getRef(columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public Blob getBlob(int columnIndex) throws SQLException {
        return resultSet.getBlob(columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public Clob getClob(int columnIndex) throws SQLException {
        return resultSet.getClob(columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public Array getArray(int columnIndex) throws SQLException {
        return resultSet.getArray(columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public Object getObject(String columnLabel, Map<String, Class<?>> map) throws SQLException {
        return resultSet.getObject(columnLabel, map);
    }

    /** {@inheritDoc} */
    @Override
    public Ref getRef(String columnLabel) throws SQLException {
        return resultSet.getRef(columnLabel);
    }

    /** {@inheritDoc} */
    @Override
    public Blob getBlob(String columnLabel) throws SQLException {
        return resultSet.getBlob(columnLabel);
    }

    /** {@inheritDoc} */
    @Override
    public Clob getClob(String columnLabel) throws SQLException {
        return resultSet.getClob(columnLabel);
    }

    /** {@inheritDoc} */
    @Override
    public Array getArray(String columnLabel) throws SQLException {
        return resultSet.getArray(columnLabel);
    }

    /** {@inheritDoc} */
    @Override
    public Date getDate(int columnIndex, Calendar cal) throws SQLException {
        return resultSet.getDate(columnIndex, cal);
    }

    /** {@inheritDoc} */
    @Override
    public Date getDate(String columnLabel, Calendar cal) throws SQLException {
        return resultSet.getDate(columnLabel, cal);
    }

    /** {@inheritDoc} */
    @Override
    public Time getTime(int columnIndex, Calendar cal) throws SQLException {
        return resultSet.getTime(columnIndex, cal);
    }

    /** {@inheritDoc} */
    @Override
    public Time getTime(String columnLabel, Calendar cal) throws SQLException {
        return resultSet.getTime(columnLabel, cal);
    }

    /** {@inheritDoc} */
    @Override
    public Timestamp getTimestamp(int columnIndex, Calendar cal) throws SQLException {
        return resultSet.getTimestamp(columnIndex, cal);
    }

    /** {@inheritDoc} */
    @Override
    public Timestamp getTimestamp(String columnLabel, Calendar cal) throws SQLException {
        return resultSet.getTimestamp(columnLabel, cal);
    }

    /** {@inheritDoc} */
    @Override
    public URL getURL(int columnIndex) throws SQLException {
        return resultSet.getURL(columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public URL getURL(String columnLabel) throws SQLException {
        return resultSet.getURL(columnLabel);
    }

    /** {@inheritDoc} */
    @Override
    public void updateRef(int columnIndex, Ref x) throws SQLException {
        resultSet.updateRef(columnIndex, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateRef(String columnLabel, Ref x) throws SQLException {
        resultSet.updateRef(columnLabel, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateBlob(int columnIndex, Blob x) throws SQLException {
        resultSet.updateBlob(columnIndex, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateBlob(String columnLabel, Blob x) throws SQLException {
        resultSet.updateBlob(columnLabel, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateClob(int columnIndex, Clob x) throws SQLException {
        resultSet.updateClob(columnIndex, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateClob(String columnLabel, Clob x) throws SQLException {
        resultSet.updateClob(columnLabel, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateArray(int columnIndex, Array x) throws SQLException {
        resultSet.updateArray(columnIndex, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateArray(String columnLabel, Array x) throws SQLException {
        resultSet.updateArray(columnLabel, x);
    }

    /** {@inheritDoc} */
    @Override
    public RowId getRowId(int columnIndex) throws SQLException {
        return resultSet.getRowId(columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public RowId getRowId(String columnLabel) throws SQLException {
        return resultSet.getRowId(columnLabel);
    }

    /** {@inheritDoc} */
    @Override
    public void updateRowId(int columnIndex, RowId x) throws SQLException {
        resultSet.updateRowId(columnIndex, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateRowId(String columnLabel, RowId x) throws SQLException {
        resultSet.updateRowId(columnLabel, x);
    }

    /** {@inheritDoc} */
    @Override
    public int getHoldability() throws SQLException {
        return resultSet.getHoldability();
    }

    /** {@inheritDoc} */
    @Override
    public boolean isClosed() throws SQLException {
        return resultSet.isClosed();
    }

    /** {@inheritDoc} */
    @Override
    public void updateNString(int columnIndex, String nString) throws SQLException {
        resultSet.updateNString(columnIndex, nString);
    }

    /** {@inheritDoc} */
    @Override
    public void updateNString(String columnLabel, String nString) throws SQLException {
        resultSet.updateNString(columnLabel, nString);
    }

    /** {@inheritDoc} */
    @Override
    public void updateNClob(int columnIndex, NClob nClob) throws SQLException {
        resultSet.updateNClob(columnIndex, nClob);
    }

    /** {@inheritDoc} */
    @Override
    public void updateNClob(String columnLabel, NClob nClob) throws SQLException {
        resultSet.updateNClob(columnLabel, nClob);
    }

    /** {@inheritDoc} */
    @Override
    public NClob getNClob(int columnIndex) throws SQLException {
        return resultSet.getNClob(columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public NClob getNClob(String columnLabel) throws SQLException {
        return resultSet.getNClob(columnLabel);
    }

    /** {@inheritDoc} */
    @Override
    public SQLXML getSQLXML(int columnIndex) throws SQLException {
        return resultSet.getSQLXML(columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public SQLXML getSQLXML(String columnLabel) throws SQLException {
        return resultSet.getSQLXML(columnLabel);
    }

    /** {@inheritDoc} */
    @Override
    public void updateSQLXML(int columnIndex, SQLXML xmlObject) throws SQLException {
        resultSet.updateSQLXML(columnIndex, xmlObject);
    }

    /** {@inheritDoc} */
    @Override
    public void updateSQLXML(String columnLabel, SQLXML xmlObject) throws SQLException {
        resultSet.updateSQLXML(columnLabel, xmlObject);
    }

    /** {@inheritDoc} */
    @Override
    public String getNString(int columnIndex) throws SQLException {
        return resultSet.getNString(columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public String getNString(String columnLabel) throws SQLException {
        return resultSet.getNString(columnLabel);
    }

    /** {@inheritDoc} */
    @Override
    public Reader getNCharacterStream(int columnIndex) throws SQLException {
        return resultSet.getNCharacterStream(columnIndex);
    }

    /** {@inheritDoc} */
    @Override
    public Reader getNCharacterStream(String columnLabel) throws SQLException {
        return resultSet.getNCharacterStream(columnLabel);
    }

    /** {@inheritDoc} */
    @Override
    public void updateNCharacterStream(int columnIndex, Reader x, long length) throws SQLException {
        resultSet.updateNCharacterStream(columnIndex, x, length);
    }

    /** {@inheritDoc} */
    @Override
    public void updateNCharacterStream(String columnLabel, Reader reader, long length) throws SQLException {
        resultSet.updateNCharacterStream(columnLabel, reader, length);
    }

    /** {@inheritDoc} */
    @Override
    public void updateAsciiStream(int columnIndex, InputStream x, long length) throws SQLException {
        resultSet.updateAsciiStream(columnIndex, x, length);
    }

    /** {@inheritDoc} */
    @Override
    public void updateBinaryStream(int columnIndex, InputStream x, long length) throws SQLException {
        resultSet.updateBinaryStream(columnIndex, x, length);
    }

    /** {@inheritDoc} */
    @Override
    public void updateCharacterStream(int columnIndex, Reader x, long length) throws SQLException {
        resultSet.updateCharacterStream(columnIndex, x, length);
    }

    /** {@inheritDoc} */
    @Override
    public void updateAsciiStream(String columnLabel, InputStream x, long length) throws SQLException {
        resultSet.updateAsciiStream(columnLabel, x, length);
    }

    /** {@inheritDoc} */
    @Override
    public void updateBinaryStream(String columnLabel, InputStream x, long length) throws SQLException {
        resultSet.updateBinaryStream(columnLabel, x, length);
    }

    /** {@inheritDoc} */
    @Override
    public void updateCharacterStream(String columnLabel, Reader reader, long length) throws SQLException {
        resultSet.updateCharacterStream(columnLabel, reader, length);
    }

    /** {@inheritDoc} */
    @Override
    public void updateBlob(int columnIndex, InputStream inputStream, long length) throws SQLException {
        resultSet.updateBlob(columnIndex, inputStream, length);
    }

    /** {@inheritDoc} */
    @Override
    public void updateBlob(String columnLabel, InputStream inputStream, long length) throws SQLException {
        resultSet.updateBlob(columnLabel, inputStream, length);
    }

    /** {@inheritDoc} */
    @Override
    public void updateClob(int columnIndex, Reader reader, long length) throws SQLException {
        resultSet.updateClob(columnIndex, reader, length);
    }

    /** {@inheritDoc} */
    @Override
    public void updateClob(String columnLabel, Reader reader, long length) throws SQLException {
        resultSet.updateClob(columnLabel, reader, length);
    }

    /** {@inheritDoc} */
    @Override
    public void updateNClob(int columnIndex, Reader reader, long length) throws SQLException {
        resultSet.updateNClob(columnIndex, reader, length);
    }

    /** {@inheritDoc} */
    @Override
    public void updateNClob(String columnLabel, Reader reader, long length) throws SQLException {
        resultSet.updateNClob(columnLabel, reader, length);
    }

    /** {@inheritDoc} */
    @Override
    public void updateNCharacterStream(int columnIndex, Reader x) throws SQLException {
        resultSet.updateNCharacterStream(columnIndex, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateNCharacterStream(String columnLabel, Reader reader) throws SQLException {
        resultSet.updateNCharacterStream(columnLabel, reader);
    }

    /** {@inheritDoc} */
    @Override
    public void updateAsciiStream(int columnIndex, InputStream x) throws SQLException {
        resultSet.updateAsciiStream(columnIndex, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateBinaryStream(int columnIndex, InputStream x) throws SQLException {
        resultSet.updateBinaryStream(columnIndex, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateCharacterStream(int columnIndex, Reader x) throws SQLException {
        resultSet.updateCharacterStream(columnIndex, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateAsciiStream(String columnLabel, InputStream x) throws SQLException {
        resultSet.updateAsciiStream(columnLabel, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateBinaryStream(String columnLabel, InputStream x) throws SQLException {
        resultSet.updateBinaryStream(columnLabel, x);
    }

    /** {@inheritDoc} */
    @Override
    public void updateCharacterStream(String columnLabel, Reader reader) throws SQLException {
        resultSet.updateCharacterStream(columnLabel, reader);
    }

    /** {@inheritDoc} */
    @Override
    public void updateBlob(int columnIndex, InputStream inputStream) throws SQLException {
        resultSet.updateBlob(columnIndex, inputStream);
    }

    /** {@inheritDoc} */
    @Override
    public void updateBlob(String columnLabel, InputStream inputStream) throws SQLException {
        resultSet.updateBlob(columnLabel, inputStream);
    }

    /** {@inheritDoc} */
    @Override
    public void updateClob(int columnIndex, Reader reader) throws SQLException {
        resultSet.updateClob(columnIndex, reader);
    }

    /** {@inheritDoc} */
    @Override
    public void updateClob(String columnLabel, Reader reader) throws SQLException {
        resultSet.updateClob(columnLabel, reader);
    }

    /** {@inheritDoc} */
    @Override
    public void updateNClob(int columnIndex, Reader reader) throws SQLException {
        resultSet.updateNClob(columnIndex, reader);
    }

    /** {@inheritDoc} */
    @Override
    public void updateNClob(String columnLabel, Reader reader) throws SQLException {
        resultSet.updateNClob(columnLabel, reader);
    }

    /** {@inheritDoc} */
    @Override
    public <T> T getObject(int columnIndex, Class<T> type) throws SQLException {
        return resultSet.getObject(columnIndex, type);
    }

    /** {@inheritDoc} */
    @Override
    public <T> T getObject(String columnLabel, Class<T> type) throws SQLException {
        return resultSet.getObject(columnLabel, type);
    }

    /** {@inheritDoc} */
    @Override
    public void updateObject(int columnIndex, Object x, SQLType targetSqlType, int scaleOrLength) throws SQLException {
        resultSet.updateObject(columnIndex, x, targetSqlType);
    }

    /** {@inheritDoc} */
    @Override
    public void updateObject(String columnLabel, Object x, SQLType targetSqlType, int scaleOrLength) throws SQLException {
        resultSet.updateObject(columnLabel, x, targetSqlType);
    }

    /** {@inheritDoc} */
    @Override
    public void updateObject(int columnIndex, Object x, SQLType targetSqlType) throws SQLException {
        resultSet.updateObject(columnIndex, x, targetSqlType);
    }

    /** {@inheritDoc} */
    @Override
    public void updateObject(String columnLabel, Object x, SQLType targetSqlType) throws SQLException {
        resultSet.updateObject(columnLabel, x, targetSqlType);
    }

    /** {@inheritDoc} */
    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return resultSet.unwrap(iface);
    }

    /** {@inheritDoc} */
    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return resultSet.isWrapperFor(iface);
    }
}
