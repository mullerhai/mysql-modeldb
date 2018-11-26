/*
 * This file is generated by jOOQ.
 */
package jooq.mysql.gen.tables.records;


import javax.annotation.Generated;

import jooq.mysql.gen.tables.Dataframemetadata;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DataframemetadataRecord extends UpdatableRecordImpl<DataframemetadataRecord> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = 1384899512;

    /**
     * Setter for <code>modeldb_test.DataFrameMetadata.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>modeldb_test.DataFrameMetadata.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>modeldb_test.DataFrameMetadata.dfId</code>.
     */
    public void setDfid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>modeldb_test.DataFrameMetadata.dfId</code>.
     */
    public Integer getDfid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>modeldb_test.DataFrameMetadata.metadataKvId</code>.
     */
    public void setMetadatakvid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>modeldb_test.DataFrameMetadata.metadataKvId</code>.
     */
    public Integer getMetadatakvid() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Dataframemetadata.DATAFRAMEMETADATA.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Dataframemetadata.DATAFRAMEMETADATA.DFID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Dataframemetadata.DATAFRAMEMETADATA.METADATAKVID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getDfid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getMetadatakvid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getDfid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getMetadatakvid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataframemetadataRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataframemetadataRecord value2(Integer value) {
        setDfid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataframemetadataRecord value3(Integer value) {
        setMetadatakvid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DataframemetadataRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DataframemetadataRecord
     */
    public DataframemetadataRecord() {
        super(Dataframemetadata.DATAFRAMEMETADATA);
    }

    /**
     * Create a detached, initialised DataframemetadataRecord
     */
    public DataframemetadataRecord(Integer id, Integer dfid, Integer metadatakvid) {
        super(Dataframemetadata.DATAFRAMEMETADATA);

        set(0, id);
        set(1, dfid);
        set(2, metadatakvid);
    }
}