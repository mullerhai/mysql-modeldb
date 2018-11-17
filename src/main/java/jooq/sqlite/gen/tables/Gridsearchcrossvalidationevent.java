/*
 * This file is generated by jOOQ.
 */
package jooq.sqlite.gen.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.sqlite.gen.Indexes;
import jooq.sqlite.gen.Keys;
import jooq.sqlite.gen.ModeldbTest;
import jooq.sqlite.gen.tables.records.GridsearchcrossvalidationeventRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Gridsearchcrossvalidationevent extends TableImpl<GridsearchcrossvalidationeventRecord> {

    private static final long serialVersionUID = 1242426087;

    /**
     * The reference instance of <code>modeldb_test.GridSearchCrossValidationEvent</code>
     */
    public static final Gridsearchcrossvalidationevent GRIDSEARCHCROSSVALIDATIONEVENT = new Gridsearchcrossvalidationevent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GridsearchcrossvalidationeventRecord> getRecordType() {
        return GridsearchcrossvalidationeventRecord.class;
    }

    /**
     * The column <code>modeldb_test.GridSearchCrossValidationEvent.id</code>.
     */
    public final TableField<GridsearchcrossvalidationeventRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>modeldb_test.GridSearchCrossValidationEvent.numFolds</code>.
     */
    public final TableField<GridsearchcrossvalidationeventRecord, Integer> NUMFOLDS = createField("numFolds", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.GridSearchCrossValidationEvent.best</code>.
     */
    public final TableField<GridsearchcrossvalidationeventRecord, Integer> BEST = createField("best", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.GridSearchCrossValidationEvent.experimentRun</code>.
     */
    public final TableField<GridsearchcrossvalidationeventRecord, Integer> EXPERIMENTRUN = createField("experimentRun", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>modeldb_test.GridSearchCrossValidationEvent</code> table reference
     */
    public Gridsearchcrossvalidationevent() {
        this(DSL.name("GridSearchCrossValidationEvent"), null);
    }

    /**
     * Create an aliased <code>modeldb_test.GridSearchCrossValidationEvent</code> table reference
     */
    public Gridsearchcrossvalidationevent(String alias) {
        this(DSL.name(alias), GRIDSEARCHCROSSVALIDATIONEVENT);
    }

    /**
     * Create an aliased <code>modeldb_test.GridSearchCrossValidationEvent</code> table reference
     */
    public Gridsearchcrossvalidationevent(Name alias) {
        this(alias, GRIDSEARCHCROSSVALIDATIONEVENT);
    }

    private Gridsearchcrossvalidationevent(Name alias, Table<GridsearchcrossvalidationeventRecord> aliased) {
        this(alias, aliased, null);
    }

    private Gridsearchcrossvalidationevent(Name alias, Table<GridsearchcrossvalidationeventRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Gridsearchcrossvalidationevent(Table<O> child, ForeignKey<O, GridsearchcrossvalidationeventRecord> key) {
        super(child, key, GRIDSEARCHCROSSVALIDATIONEVENT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return ModeldbTest.MODELDB_TEST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.GRIDSEARCHCROSSVALIDATIONEVENT_BEST, Indexes.GRIDSEARCHCROSSVALIDATIONEVENT_EXPERIMENTRUN, Indexes.GRIDSEARCHCROSSVALIDATIONEVENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<GridsearchcrossvalidationeventRecord, Integer> getIdentity() {
        return Keys.IDENTITY_GRIDSEARCHCROSSVALIDATIONEVENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GridsearchcrossvalidationeventRecord> getPrimaryKey() {
        return Keys.KEY_GRIDSEARCHCROSSVALIDATIONEVENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GridsearchcrossvalidationeventRecord>> getKeys() {
        return Arrays.<UniqueKey<GridsearchcrossvalidationeventRecord>>asList(Keys.KEY_GRIDSEARCHCROSSVALIDATIONEVENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<GridsearchcrossvalidationeventRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<GridsearchcrossvalidationeventRecord, ?>>asList(Keys.GRIDSEARCHCROSSVALIDATIONEVENT_IBFK_1, Keys.GRIDSEARCHCROSSVALIDATIONEVENT_IBFK_2);
    }

    public Fitevent fitevent() {
        return new Fitevent(this, Keys.GRIDSEARCHCROSSVALIDATIONEVENT_IBFK_1);
    }

    public Experimentrun experimentrun() {
        return new Experimentrun(this, Keys.GRIDSEARCHCROSSVALIDATIONEVENT_IBFK_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Gridsearchcrossvalidationevent as(String alias) {
        return new Gridsearchcrossvalidationevent(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Gridsearchcrossvalidationevent as(Name alias) {
        return new Gridsearchcrossvalidationevent(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Gridsearchcrossvalidationevent rename(String name) {
        return new Gridsearchcrossvalidationevent(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Gridsearchcrossvalidationevent rename(Name name) {
        return new Gridsearchcrossvalidationevent(name, null);
    }
}