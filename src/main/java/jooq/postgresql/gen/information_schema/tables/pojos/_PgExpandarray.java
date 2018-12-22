/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.information_schema.tables.pojos;


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
public class _PgExpandarray implements Serializable {

    private static final long serialVersionUID = -139496152;

    private Object  x;
    private Integer n;

    public _PgExpandarray() {}

    public _PgExpandarray(_PgExpandarray value) {
        this.x = value.x;
        this.n = value.n;
    }

    public _PgExpandarray(
        Object  x,
        Integer n
    ) {
        this.x = x;
        this.n = n;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getX() {
        return this.x;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setX(Object x) {
        this.x = x;
    }

    public Integer getN() {
        return this.n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("_PgExpandarray (");

        sb.append(x);
        sb.append(", ").append(n);

        sb.append(")");
        return sb.toString();
    }
}