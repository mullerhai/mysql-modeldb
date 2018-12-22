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
public class TsParse implements Serializable {

    private static final long serialVersionUID = 187250063;

    private Integer tokid;

    private String  token;

    public TsParse() {}

    public TsParse(TsParse value) {
        this.tokid = value.tokid;

        this.token = value.token;
    }

    public TsParse(
        Integer tokid,

        String  token
    ) {
        this.tokid = tokid;

        this.token = token;
    }

    public Integer getTokid() {
        return this.tokid;
    }

    public void setTokid(Integer tokid) {
        this.tokid = tokid;
    }


    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TsParse (");

        sb.append(tokid);

        sb.append(", ").append(token);

        sb.append(")");
        return sb.toString();
    }
}