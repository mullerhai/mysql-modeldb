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
import jooq.sqlite.gen.tables.records.FeatureRecord;

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
public class Feature extends TableImpl<FeatureRecord> {

    private static final long serialVersionUID = 27307203;

    /**
     * The reference instance of <code>modeldb_test.Feature</code>
     */
    public static final Feature FEATURE = new Feature();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FeatureRecord> getRecordType() {
        return FeatureRecord.class;
    }

    /**
     * The column <code>modeldb_test.Feature.id</code>.
     */
    public final TableField<FeatureRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>modeldb_test.Feature.name</code>.
     */
    public final TableField<FeatureRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>modeldb_test.Feature.featureIndex</code>.
     */
    public final TableField<FeatureRecord, Integer> FEATUREINDEX = createField("featureIndex", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.Feature.importance</code>.
     */
    public final TableField<FeatureRecord, Double> IMPORTANCE = createField("importance", org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.Feature.transformer</code>.
     */
    public final TableField<FeatureRecord, Integer> TRANSFORMER = createField("transformer", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>modeldb_test.Feature</code> table reference
     */
    public Feature() {
        this(DSL.name("Feature"), null);
    }

    /**
     * Create an aliased <code>modeldb_test.Feature</code> table reference
     */
    public Feature(String alias) {
        this(DSL.name(alias), FEATURE);
    }

    /**
     * Create an aliased <code>modeldb_test.Feature</code> table reference
     */
    public Feature(Name alias) {
        this(alias, FEATURE);
    }

    private Feature(Name alias, Table<FeatureRecord> aliased) {
        this(alias, aliased, null);
    }

    private Feature(Name alias, Table<FeatureRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Feature(Table<O> child, ForeignKey<O, FeatureRecord> key) {
        super(child, key, FEATURE);
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
        return Arrays.<Index>asList(Indexes.FEATURE_FEATUREINDEXNAME, Indexes.FEATURE_FEATUREINDEXTRANSFORMER, Indexes.FEATURE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FeatureRecord, Integer> getIdentity() {
        return Keys.IDENTITY_FEATURE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FeatureRecord> getPrimaryKey() {
        return Keys.KEY_FEATURE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FeatureRecord>> getKeys() {
        return Arrays.<UniqueKey<FeatureRecord>>asList(Keys.KEY_FEATURE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<FeatureRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<FeatureRecord, ?>>asList(Keys.FEATURE_IBFK_1);
    }

    public Transformer transformer() {
        return new Transformer(this, Keys.FEATURE_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Feature as(String alias) {
        return new Feature(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Feature as(Name alias) {
        return new Feature(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Feature rename(String name) {
        return new Feature(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Feature rename(Name name) {
        return new Feature(name, null);
    }
}
