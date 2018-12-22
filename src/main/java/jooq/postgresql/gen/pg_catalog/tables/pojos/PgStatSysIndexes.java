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
public class PgStatSysIndexes implements Serializable {

    private static final long serialVersionUID = 1295635695;

    private Long   relid;
    private Long   indexrelid;
    private String schemaname;
    private String relname;
    private String indexrelname;
    private Long   idxScan;
    private Long   idxTupRead;
    private Long   idxTupFetch;

    public PgStatSysIndexes() {}

    public PgStatSysIndexes(PgStatSysIndexes value) {
        this.relid = value.relid;
        this.indexrelid = value.indexrelid;
        this.schemaname = value.schemaname;
        this.relname = value.relname;
        this.indexrelname = value.indexrelname;
        this.idxScan = value.idxScan;
        this.idxTupRead = value.idxTupRead;
        this.idxTupFetch = value.idxTupFetch;
    }

    public PgStatSysIndexes(
        Long   relid,
        Long   indexrelid,
        String schemaname,
        String relname,
        String indexrelname,
        Long   idxScan,
        Long   idxTupRead,
        Long   idxTupFetch
    ) {
        this.relid = relid;
        this.indexrelid = indexrelid;
        this.schemaname = schemaname;
        this.relname = relname;
        this.indexrelname = indexrelname;
        this.idxScan = idxScan;
        this.idxTupRead = idxTupRead;
        this.idxTupFetch = idxTupFetch;
    }

    public Long getRelid() {
        return this.relid;
    }

    public void setRelid(Long relid) {
        this.relid = relid;
    }

    public Long getIndexrelid() {
        return this.indexrelid;
    }

    public void setIndexrelid(Long indexrelid) {
        this.indexrelid = indexrelid;
    }

    public String getSchemaname() {
        return this.schemaname;
    }

    public void setSchemaname(String schemaname) {
        this.schemaname = schemaname;
    }

    public String getRelname() {
        return this.relname;
    }

    public void setRelname(String relname) {
        this.relname = relname;
    }

    public String getIndexrelname() {
        return this.indexrelname;
    }

    public void setIndexrelname(String indexrelname) {
        this.indexrelname = indexrelname;
    }

    public Long getIdxScan() {
        return this.idxScan;
    }

    public void setIdxScan(Long idxScan) {
        this.idxScan = idxScan;
    }

    public Long getIdxTupRead() {
        return this.idxTupRead;
    }

    public void setIdxTupRead(Long idxTupRead) {
        this.idxTupRead = idxTupRead;
    }

    public Long getIdxTupFetch() {
        return this.idxTupFetch;
    }

    public void setIdxTupFetch(Long idxTupFetch) {
        this.idxTupFetch = idxTupFetch;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgStatSysIndexes (");

        sb.append(relid);
        sb.append(", ").append(indexrelid);
        sb.append(", ").append(schemaname);
        sb.append(", ").append(relname);
        sb.append(", ").append(indexrelname);
        sb.append(", ").append(idxScan);
        sb.append(", ").append(idxTupRead);
        sb.append(", ").append(idxTupFetch);

        sb.append(")");
        return sb.toString();
    }
}
