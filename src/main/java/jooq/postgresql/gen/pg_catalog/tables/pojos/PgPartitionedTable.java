/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.pg_catalog.tables.pojos;


import java.io.Serializable;
import java.util.Arrays;

import javax.annotation.Generated;


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
public class PgPartitionedTable implements Serializable {

    private static final long serialVersionUID = -1574222026;

    private Long     partrelid;
    private String   partstrat;
    private Short    partnatts;
    private Object[] partattrs;
    private Long[]   partclass;
    private Long[]   partcollation;
    private Object   partexprs;

    public PgPartitionedTable() {}

    public PgPartitionedTable(PgPartitionedTable value) {
        this.partrelid = value.partrelid;
        this.partstrat = value.partstrat;
        this.partnatts = value.partnatts;
        this.partattrs = value.partattrs;
        this.partclass = value.partclass;
        this.partcollation = value.partcollation;
        this.partexprs = value.partexprs;
    }

    public PgPartitionedTable(
        Long     partrelid,
        String   partstrat,
        Short    partnatts,
        Object[] partattrs,
        Long[]   partclass,
        Long[]   partcollation,
        Object   partexprs
    ) {
        this.partrelid = partrelid;
        this.partstrat = partstrat;
        this.partnatts = partnatts;
        this.partattrs = partattrs;
        this.partclass = partclass;
        this.partcollation = partcollation;
        this.partexprs = partexprs;
    }

    public Long getPartrelid() {
        return this.partrelid;
    }

    public void setPartrelid(Long partrelid) {
        this.partrelid = partrelid;
    }

    public String getPartstrat() {
        return this.partstrat;
    }

    public void setPartstrat(String partstrat) {
        this.partstrat = partstrat;
    }

    public Short getPartnatts() {
        return this.partnatts;
    }

    public void setPartnatts(Short partnatts) {
        this.partnatts = partnatts;
    }

    public Object[] getPartattrs() {
        return this.partattrs;
    }

    public void setPartattrs(Object... partattrs) {
        this.partattrs = partattrs;
    }

    public Long[] getPartclass() {
        return this.partclass;
    }

    public void setPartclass(Long... partclass) {
        this.partclass = partclass;
    }

    public Long[] getPartcollation() {
        return this.partcollation;
    }

    public void setPartcollation(Long... partcollation) {
        this.partcollation = partcollation;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getPartexprs() {
        return this.partexprs;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setPartexprs(Object partexprs) {
        this.partexprs = partexprs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgPartitionedTable (");

        sb.append(partrelid);
        sb.append(", ").append(partstrat);
        sb.append(", ").append(partnatts);
        sb.append(", ").append(Arrays.toString(partattrs));
        sb.append(", ").append(Arrays.toString(partclass));
        sb.append(", ").append(Arrays.toString(partcollation));
        sb.append(", ").append(partexprs);

        sb.append(")");
        return sb.toString();
    }
}