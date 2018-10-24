/**
 * This class is generated by jOOQ
 */
package jooq.sqlite.gen.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.sqlite.gen.Keys;
import jooq.sqlite.gen.ModeldbTest;
import jooq.sqlite.gen.tables.records.RandomspliteventRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Randomsplitevent extends TableImpl<RandomspliteventRecord> {

    private static final long serialVersionUID = -183214129;

    /**
     * The reference instance of <code>modeldb_test.RandomSplitEvent</code>
     */
    public static final Randomsplitevent RANDOMSPLITEVENT = new Randomsplitevent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RandomspliteventRecord> getRecordType() {
        return RandomspliteventRecord.class;
    }

    /**
     * The column <code>modeldb_test.RandomSplitEvent.id</code>.
     */
    public final TableField<RandomspliteventRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.RandomSplitEvent.inputDataFrameId</code>.
     */
    public final TableField<RandomspliteventRecord, Integer> INPUTDATAFRAMEID = createField("inputDataFrameId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.RandomSplitEvent.randomSeed</code>.
     */
    public final TableField<RandomspliteventRecord, Long> RANDOMSEED = createField("randomSeed", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.RandomSplitEvent.experimentRun</code>.
     */
    public final TableField<RandomspliteventRecord, Integer> EXPERIMENTRUN = createField("experimentRun", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>modeldb_test.RandomSplitEvent</code> table reference
     */
    public Randomsplitevent() {
        this("RandomSplitEvent", null);
    }

    /**
     * Create an aliased <code>modeldb_test.RandomSplitEvent</code> table reference
     */
    public Randomsplitevent(String alias) {
        this(alias, RANDOMSPLITEVENT);
    }

    private Randomsplitevent(String alias, Table<RandomspliteventRecord> aliased) {
        this(alias, aliased, null);
    }

    private Randomsplitevent(String alias, Table<RandomspliteventRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
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
    public Identity<RandomspliteventRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RANDOMSPLITEVENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RandomspliteventRecord> getPrimaryKey() {
        return Keys.KEY_RANDOMSPLITEVENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RandomspliteventRecord>> getKeys() {
        return Arrays.<UniqueKey<RandomspliteventRecord>>asList(Keys.KEY_RANDOMSPLITEVENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<RandomspliteventRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<RandomspliteventRecord, ?>>asList(Keys.RANDOMSPLITEVENT_IBFK_1, Keys.RANDOMSPLITEVENT_IBFK_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Randomsplitevent as(String alias) {
        return new Randomsplitevent(alias, this);
    }

    /**
     * Rename this table
     */
    public Randomsplitevent rename(String name) {
        return new Randomsplitevent(name, null);
    }
}