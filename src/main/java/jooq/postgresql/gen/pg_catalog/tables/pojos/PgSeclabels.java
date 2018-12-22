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
public class PgSeclabels implements Serializable {

    private static final long serialVersionUID = -1203493304;

    private Long    objoid;
    private Long    classoid;
    private Integer objsubid;
    private String  objtype;
    private Long    objnamespace;
    private String  objname;
    private String  provider;
    private String  label;

    public PgSeclabels() {}

    public PgSeclabels(PgSeclabels value) {
        this.objoid = value.objoid;
        this.classoid = value.classoid;
        this.objsubid = value.objsubid;
        this.objtype = value.objtype;
        this.objnamespace = value.objnamespace;
        this.objname = value.objname;
        this.provider = value.provider;
        this.label = value.label;
    }

    public PgSeclabels(
        Long    objoid,
        Long    classoid,
        Integer objsubid,
        String  objtype,
        Long    objnamespace,
        String  objname,
        String  provider,
        String  label
    ) {
        this.objoid = objoid;
        this.classoid = classoid;
        this.objsubid = objsubid;
        this.objtype = objtype;
        this.objnamespace = objnamespace;
        this.objname = objname;
        this.provider = provider;
        this.label = label;
    }

    public Long getObjoid() {
        return this.objoid;
    }

    public void setObjoid(Long objoid) {
        this.objoid = objoid;
    }

    public Long getClassoid() {
        return this.classoid;
    }

    public void setClassoid(Long classoid) {
        this.classoid = classoid;
    }

    public Integer getObjsubid() {
        return this.objsubid;
    }

    public void setObjsubid(Integer objsubid) {
        this.objsubid = objsubid;
    }

    public String getObjtype() {
        return this.objtype;
    }

    public void setObjtype(String objtype) {
        this.objtype = objtype;
    }

    public Long getObjnamespace() {
        return this.objnamespace;
    }

    public void setObjnamespace(Long objnamespace) {
        this.objnamespace = objnamespace;
    }

    public String getObjname() {
        return this.objname;
    }

    public void setObjname(String objname) {
        this.objname = objname;
    }

    public String getProvider() {
        return this.provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgSeclabels (");

        sb.append(objoid);
        sb.append(", ").append(classoid);
        sb.append(", ").append(objsubid);
        sb.append(", ").append(objtype);
        sb.append(", ").append(objnamespace);
        sb.append(", ").append(objname);
        sb.append(", ").append(provider);
        sb.append(", ").append(label);

        sb.append(")");
        return sb.toString();
    }
}