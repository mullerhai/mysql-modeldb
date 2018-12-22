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
public class PgForeignTable implements Serializable {

    private static final long serialVersionUID = -122320273;

    private Long     ftrelid;
    private Long     ftserver;
    private String[] ftoptions;

    public PgForeignTable() {}

    public PgForeignTable(PgForeignTable value) {
        this.ftrelid = value.ftrelid;
        this.ftserver = value.ftserver;
        this.ftoptions = value.ftoptions;
    }

    public PgForeignTable(
        Long     ftrelid,
        Long     ftserver,
        String[] ftoptions
    ) {
        this.ftrelid = ftrelid;
        this.ftserver = ftserver;
        this.ftoptions = ftoptions;
    }

    public Long getFtrelid() {
        return this.ftrelid;
    }

    public void setFtrelid(Long ftrelid) {
        this.ftrelid = ftrelid;
    }

    public Long getFtserver() {
        return this.ftserver;
    }

    public void setFtserver(Long ftserver) {
        this.ftserver = ftserver;
    }

    public String[] getFtoptions() {
        return this.ftoptions;
    }

    public void setFtoptions(String... ftoptions) {
        this.ftoptions = ftoptions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgForeignTable (");

        sb.append(ftrelid);
        sb.append(", ").append(ftserver);
        sb.append(", ").append(Arrays.toString(ftoptions));

        sb.append(")");
        return sb.toString();
    }
}
