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
public class JsonPopulateRecordset implements Serializable {

    private static final long serialVersionUID = -347513578;

    private Object jsonPopulateRecordset;

    public JsonPopulateRecordset() {}

    public JsonPopulateRecordset(JsonPopulateRecordset value) {
        this.jsonPopulateRecordset = value.jsonPopulateRecordset;
    }

    public JsonPopulateRecordset(
        Object jsonPopulateRecordset
    ) {
        this.jsonPopulateRecordset = jsonPopulateRecordset;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getJsonPopulateRecordset() {
        return this.jsonPopulateRecordset;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setJsonPopulateRecordset(Object jsonPopulateRecordset) {
        this.jsonPopulateRecordset = jsonPopulateRecordset;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JsonPopulateRecordset (");

        sb.append(jsonPopulateRecordset);

        sb.append(")");
        return sb.toString();
    }
}
