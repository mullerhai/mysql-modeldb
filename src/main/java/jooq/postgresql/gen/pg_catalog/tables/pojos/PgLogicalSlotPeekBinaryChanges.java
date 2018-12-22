/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.pg_catalog.tables.pojos;


import java.io.Serializable;

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
public class PgLogicalSlotPeekBinaryChanges implements Serializable {

    private static final long serialVersionUID = 523837944;

    private Object lsn;
    private Long   xid;
    private byte[] data;

    public PgLogicalSlotPeekBinaryChanges() {}

    public PgLogicalSlotPeekBinaryChanges(PgLogicalSlotPeekBinaryChanges value) {
        this.lsn = value.lsn;
        this.xid = value.xid;
        this.data = value.data;
    }

    public PgLogicalSlotPeekBinaryChanges(
        Object lsn,
        Long   xid,
        byte[] data
    ) {
        this.lsn = lsn;
        this.xid = xid;
        this.data = data;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getLsn() {
        return this.lsn;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setLsn(Object lsn) {
        this.lsn = lsn;
    }

    public Long getXid() {
        return this.xid;
    }

    public void setXid(Long xid) {
        this.xid = xid;
    }

    public byte[] getData() {
        return this.data;
    }

    public void setData(byte... data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgLogicalSlotPeekBinaryChanges (");

        sb.append(lsn);
        sb.append(", ").append(xid);
        sb.append(", ").append("[binary...]");

        sb.append(")");
        return sb.toString();
    }
}
