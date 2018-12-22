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
public class PgEventTrigger implements Serializable {

    private static final long serialVersionUID = 1633422990;

    private String   evtname;
    private String   evtevent;
    private Long     evtowner;
    private Long     evtfoid;
    private String   evtenabled;
    private String[] evttags;

    public PgEventTrigger() {}

    public PgEventTrigger(PgEventTrigger value) {
        this.evtname = value.evtname;
        this.evtevent = value.evtevent;
        this.evtowner = value.evtowner;
        this.evtfoid = value.evtfoid;
        this.evtenabled = value.evtenabled;
        this.evttags = value.evttags;
    }

    public PgEventTrigger(
        String   evtname,
        String   evtevent,
        Long     evtowner,
        Long     evtfoid,
        String   evtenabled,
        String[] evttags
    ) {
        this.evtname = evtname;
        this.evtevent = evtevent;
        this.evtowner = evtowner;
        this.evtfoid = evtfoid;
        this.evtenabled = evtenabled;
        this.evttags = evttags;
    }

    public String getEvtname() {
        return this.evtname;
    }

    public void setEvtname(String evtname) {
        this.evtname = evtname;
    }

    public String getEvtevent() {
        return this.evtevent;
    }

    public void setEvtevent(String evtevent) {
        this.evtevent = evtevent;
    }

    public Long getEvtowner() {
        return this.evtowner;
    }

    public void setEvtowner(Long evtowner) {
        this.evtowner = evtowner;
    }

    public Long getEvtfoid() {
        return this.evtfoid;
    }

    public void setEvtfoid(Long evtfoid) {
        this.evtfoid = evtfoid;
    }

    public String getEvtenabled() {
        return this.evtenabled;
    }

    public void setEvtenabled(String evtenabled) {
        this.evtenabled = evtenabled;
    }

    public String[] getEvttags() {
        return this.evttags;
    }

    public void setEvttags(String... evttags) {
        this.evttags = evttags;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgEventTrigger (");

        sb.append(evtname);
        sb.append(", ").append(evtevent);
        sb.append(", ").append(evtowner);
        sb.append(", ").append(evtfoid);
        sb.append(", ").append(evtenabled);
        sb.append(", ").append(Arrays.toString(evttags));

        sb.append(")");
        return sb.toString();
    }
}
