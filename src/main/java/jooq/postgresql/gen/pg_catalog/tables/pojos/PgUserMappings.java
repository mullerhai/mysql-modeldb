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
public class PgUserMappings implements Serializable {

    private static final long serialVersionUID = -2136799536;

    private Long     umid;
    private Long     srvid;
    private String   srvname;
    private Long     umuser;
    private String   usename;
    private String[] umoptions;

    public PgUserMappings() {}

    public PgUserMappings(PgUserMappings value) {
        this.umid = value.umid;
        this.srvid = value.srvid;
        this.srvname = value.srvname;
        this.umuser = value.umuser;
        this.usename = value.usename;
        this.umoptions = value.umoptions;
    }

    public PgUserMappings(
        Long     umid,
        Long     srvid,
        String   srvname,
        Long     umuser,
        String   usename,
        String[] umoptions
    ) {
        this.umid = umid;
        this.srvid = srvid;
        this.srvname = srvname;
        this.umuser = umuser;
        this.usename = usename;
        this.umoptions = umoptions;
    }

    public Long getUmid() {
        return this.umid;
    }

    public void setUmid(Long umid) {
        this.umid = umid;
    }

    public Long getSrvid() {
        return this.srvid;
    }

    public void setSrvid(Long srvid) {
        this.srvid = srvid;
    }

    public String getSrvname() {
        return this.srvname;
    }

    public void setSrvname(String srvname) {
        this.srvname = srvname;
    }

    public Long getUmuser() {
        return this.umuser;
    }

    public void setUmuser(Long umuser) {
        this.umuser = umuser;
    }

    public String getUsename() {
        return this.usename;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    public String[] getUmoptions() {
        return this.umoptions;
    }

    public void setUmoptions(String... umoptions) {
        this.umoptions = umoptions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgUserMappings (");

        sb.append(umid);
        sb.append(", ").append(srvid);
        sb.append(", ").append(srvname);
        sb.append(", ").append(umuser);
        sb.append(", ").append(usename);
        sb.append(", ").append(Arrays.toString(umoptions));

        sb.append(")");
        return sb.toString();
    }
}