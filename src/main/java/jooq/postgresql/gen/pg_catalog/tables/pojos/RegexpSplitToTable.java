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
public class RegexpSplitToTable implements Serializable {

    private static final long serialVersionUID = 1182339301;

    private String regexpSplitToTable;

    public RegexpSplitToTable() {}

    public RegexpSplitToTable(RegexpSplitToTable value) {
        this.regexpSplitToTable = value.regexpSplitToTable;
    }

    public RegexpSplitToTable(
        String regexpSplitToTable
    ) {
        this.regexpSplitToTable = regexpSplitToTable;
    }

    public String getRegexpSplitToTable() {
        return this.regexpSplitToTable;
    }

    public void setRegexpSplitToTable(String regexpSplitToTable) {
        this.regexpSplitToTable = regexpSplitToTable;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RegexpSplitToTable (");

        sb.append(regexpSplitToTable);

        sb.append(")");
        return sb.toString();
    }
}