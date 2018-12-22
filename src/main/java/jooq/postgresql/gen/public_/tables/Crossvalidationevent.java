/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.public_.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.postgresql.gen.public_.Indexes;
import jooq.postgresql.gen.public_.Keys;
import jooq.postgresql.gen.public_.Public;
import jooq.postgresql.gen.public_.tables.records.CrossvalidationeventRecord;

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
public class Crossvalidationevent extends TableImpl<CrossvalidationeventRecord> {

    private static final long serialVersionUID = -956311381;

    /**
     * The reference instance of <code>public.crossvalidationevent</code>
     */
    public static final Crossvalidationevent CROSSVALIDATIONEVENT = new Crossvalidationevent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CrossvalidationeventRecord> getRecordType() {
        return CrossvalidationeventRecord.class;
    }

    /**
     * The column <code>public.crossvalidationevent.id</code>.
     */
    public final TableField<CrossvalidationeventRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('crossvalidationevent_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.crossvalidationevent.df</code>.
     */
    public final TableField<CrossvalidationeventRecord, Integer> DF = createField("df", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.crossvalidationevent.spec</code>.
     */
    public final TableField<CrossvalidationeventRecord, Integer> SPEC = createField("spec", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.crossvalidationevent.numfolds</code>.
     */
    public final TableField<CrossvalidationeventRecord, Integer> NUMFOLDS = createField("numfolds", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.crossvalidationevent.randomseed</code>.
     */
    public final TableField<CrossvalidationeventRecord, Long> RANDOMSEED = createField("randomseed", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.crossvalidationevent.evaluator</code>.
     */
    public final TableField<CrossvalidationeventRecord, String> EVALUATOR = createField("evaluator", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.crossvalidationevent.experimentrun</code>.
     */
    public final TableField<CrossvalidationeventRecord, Integer> EXPERIMENTRUN = createField("experimentrun", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>public.crossvalidationevent</code> table reference
     */
    public Crossvalidationevent() {
        this(DSL.name("crossvalidationevent"), null);
    }

    /**
     * Create an aliased <code>public.crossvalidationevent</code> table reference
     */
    public Crossvalidationevent(String alias) {
        this(DSL.name(alias), CROSSVALIDATIONEVENT);
    }

    /**
     * Create an aliased <code>public.crossvalidationevent</code> table reference
     */
    public Crossvalidationevent(Name alias) {
        this(alias, CROSSVALIDATIONEVENT);
    }

    private Crossvalidationevent(Name alias, Table<CrossvalidationeventRecord> aliased) {
        this(alias, aliased, null);
    }

    private Crossvalidationevent(Name alias, Table<CrossvalidationeventRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Crossvalidationevent(Table<O> child, ForeignKey<O, CrossvalidationeventRecord> key) {
        super(child, key, CROSSVALIDATIONEVENT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CROSSVALIDATIONEVENT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CrossvalidationeventRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CROSSVALIDATIONEVENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CrossvalidationeventRecord> getPrimaryKey() {
        return Keys.CROSSVALIDATIONEVENT_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CrossvalidationeventRecord>> getKeys() {
        return Arrays.<UniqueKey<CrossvalidationeventRecord>>asList(Keys.CROSSVALIDATIONEVENT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CrossvalidationeventRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CrossvalidationeventRecord, ?>>asList(Keys.CROSSVALIDATIONEVENT__CROSSVALIDATIONEVENT_DF_FKEY, Keys.CROSSVALIDATIONEVENT__CROSSVALIDATIONEVENT_SPEC_FKEY, Keys.CROSSVALIDATIONEVENT__CROSSVALIDATIONEVENT_EXPERIMENTRUN_FKEY);
    }

    public Dataframe dataframe() {
        return new Dataframe(this, Keys.CROSSVALIDATIONEVENT__CROSSVALIDATIONEVENT_DF_FKEY);
    }

    public Transformerspec transformerspec() {
        return new Transformerspec(this, Keys.CROSSVALIDATIONEVENT__CROSSVALIDATIONEVENT_SPEC_FKEY);
    }

    public Experimentrun experimentrun() {
        return new Experimentrun(this, Keys.CROSSVALIDATIONEVENT__CROSSVALIDATIONEVENT_EXPERIMENTRUN_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Crossvalidationevent as(String alias) {
        return new Crossvalidationevent(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Crossvalidationevent as(Name alias) {
        return new Crossvalidationevent(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Crossvalidationevent rename(String name) {
        return new Crossvalidationevent(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Crossvalidationevent rename(Name name) {
        return new Crossvalidationevent(name, null);
    }
}