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
public class PgGetKeywords implements Serializable {

    private static final long serialVersionUID = 584572021;

    private String word;
    private String catcode;
    private String catdesc;

    public PgGetKeywords() {}

    public PgGetKeywords(PgGetKeywords value) {
        this.word = value.word;
        this.catcode = value.catcode;
        this.catdesc = value.catdesc;
    }

    public PgGetKeywords(
        String word,
        String catcode,
        String catdesc
    ) {
        this.word = word;
        this.catcode = catcode;
        this.catdesc = catdesc;
    }

    public String getWord() {
        return this.word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getCatcode() {
        return this.catcode;
    }

    public void setCatcode(String catcode) {
        this.catcode = catcode;
    }

    public String getCatdesc() {
        return this.catdesc;
    }

    public void setCatdesc(String catdesc) {
        this.catdesc = catdesc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgGetKeywords (");

        sb.append(word);
        sb.append(", ").append(catcode);
        sb.append(", ").append(catdesc);

        sb.append(")");
        return sb.toString();
    }
}