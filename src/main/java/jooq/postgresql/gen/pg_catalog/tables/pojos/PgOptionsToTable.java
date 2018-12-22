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
public class PgOptionsToTable implements Serializable {

    private static final long serialVersionUID = -1268533761;

    private String optionName;
    private String optionValue;

    public PgOptionsToTable() {}

    public PgOptionsToTable(PgOptionsToTable value) {
        this.optionName = value.optionName;
        this.optionValue = value.optionValue;
    }

    public PgOptionsToTable(
        String optionName,
        String optionValue
    ) {
        this.optionName = optionName;
        this.optionValue = optionValue;
    }

    public String getOptionName() {
        return this.optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public String getOptionValue() {
        return this.optionValue;
    }

    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgOptionsToTable (");

        sb.append(optionName);
        sb.append(", ").append(optionValue);

        sb.append(")");
        return sb.toString();
    }
}
