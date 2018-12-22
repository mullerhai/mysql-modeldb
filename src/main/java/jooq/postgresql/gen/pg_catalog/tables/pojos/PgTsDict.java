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
public class PgTsDict implements Serializable {

    private static final long serialVersionUID = 528676151;

    private String dictname;
    private Long   dictnamespace;
    private Long   dictowner;
    private Long   dicttemplate;
    private String dictinitoption;

    public PgTsDict() {}

    public PgTsDict(PgTsDict value) {
        this.dictname = value.dictname;
        this.dictnamespace = value.dictnamespace;
        this.dictowner = value.dictowner;
        this.dicttemplate = value.dicttemplate;
        this.dictinitoption = value.dictinitoption;
    }

    public PgTsDict(
        String dictname,
        Long   dictnamespace,
        Long   dictowner,
        Long   dicttemplate,
        String dictinitoption
    ) {
        this.dictname = dictname;
        this.dictnamespace = dictnamespace;
        this.dictowner = dictowner;
        this.dicttemplate = dicttemplate;
        this.dictinitoption = dictinitoption;
    }

    public String getDictname() {
        return this.dictname;
    }

    public void setDictname(String dictname) {
        this.dictname = dictname;
    }

    public Long getDictnamespace() {
        return this.dictnamespace;
    }

    public void setDictnamespace(Long dictnamespace) {
        this.dictnamespace = dictnamespace;
    }

    public Long getDictowner() {
        return this.dictowner;
    }

    public void setDictowner(Long dictowner) {
        this.dictowner = dictowner;
    }

    public Long getDicttemplate() {
        return this.dicttemplate;
    }

    public void setDicttemplate(Long dicttemplate) {
        this.dicttemplate = dicttemplate;
    }

    public String getDictinitoption() {
        return this.dictinitoption;
    }

    public void setDictinitoption(String dictinitoption) {
        this.dictinitoption = dictinitoption;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgTsDict (");

        sb.append(dictname);
        sb.append(", ").append(dictnamespace);
        sb.append(", ").append(dictowner);
        sb.append(", ").append(dicttemplate);
        sb.append(", ").append(dictinitoption);

        sb.append(")");
        return sb.toString();
    }
}
