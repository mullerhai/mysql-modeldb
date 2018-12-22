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
public class PgExtension implements Serializable {

    private static final long serialVersionUID = 251308192;

    private String   extname;
    private Long     extowner;
    private Long     extnamespace;
    private Boolean  extrelocatable;
    private String   extversion;
    private Long[]   extconfig;
    private String[] extcondition;

    public PgExtension() {}

    public PgExtension(PgExtension value) {
        this.extname = value.extname;
        this.extowner = value.extowner;
        this.extnamespace = value.extnamespace;
        this.extrelocatable = value.extrelocatable;
        this.extversion = value.extversion;
        this.extconfig = value.extconfig;
        this.extcondition = value.extcondition;
    }

    public PgExtension(
        String   extname,
        Long     extowner,
        Long     extnamespace,
        Boolean  extrelocatable,
        String   extversion,
        Long[]   extconfig,
        String[] extcondition
    ) {
        this.extname = extname;
        this.extowner = extowner;
        this.extnamespace = extnamespace;
        this.extrelocatable = extrelocatable;
        this.extversion = extversion;
        this.extconfig = extconfig;
        this.extcondition = extcondition;
    }

    public String getExtname() {
        return this.extname;
    }

    public void setExtname(String extname) {
        this.extname = extname;
    }

    public Long getExtowner() {
        return this.extowner;
    }

    public void setExtowner(Long extowner) {
        this.extowner = extowner;
    }

    public Long getExtnamespace() {
        return this.extnamespace;
    }

    public void setExtnamespace(Long extnamespace) {
        this.extnamespace = extnamespace;
    }

    public Boolean getExtrelocatable() {
        return this.extrelocatable;
    }

    public void setExtrelocatable(Boolean extrelocatable) {
        this.extrelocatable = extrelocatable;
    }

    public String getExtversion() {
        return this.extversion;
    }

    public void setExtversion(String extversion) {
        this.extversion = extversion;
    }

    public Long[] getExtconfig() {
        return this.extconfig;
    }

    public void setExtconfig(Long... extconfig) {
        this.extconfig = extconfig;
    }

    public String[] getExtcondition() {
        return this.extcondition;
    }

    public void setExtcondition(String... extcondition) {
        this.extcondition = extcondition;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgExtension (");

        sb.append(extname);
        sb.append(", ").append(extowner);
        sb.append(", ").append(extnamespace);
        sb.append(", ").append(extrelocatable);
        sb.append(", ").append(extversion);
        sb.append(", ").append(Arrays.toString(extconfig));
        sb.append(", ").append(Arrays.toString(extcondition));

        sb.append(")");
        return sb.toString();
    }
}
