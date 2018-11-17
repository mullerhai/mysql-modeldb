/*
 * This file is generated by jOOQ.
 */
package jooq.sqlite.gen.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

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
public class Annotation implements Serializable {

    private static final long serialVersionUID = -1049824846;

    private Integer   id;
    private Timestamp posted;
    private Integer   experimentrun;

    public Annotation() {}

    public Annotation(Annotation value) {
        this.id = value.id;
        this.posted = value.posted;
        this.experimentrun = value.experimentrun;
    }

    public Annotation(
        Integer   id,
        Timestamp posted,
        Integer   experimentrun
    ) {
        this.id = id;
        this.posted = posted;
        this.experimentrun = experimentrun;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getPosted() {
        return this.posted;
    }

    public void setPosted(Timestamp posted) {
        this.posted = posted;
    }

    public Integer getExperimentrun() {
        return this.experimentrun;
    }

    public void setExperimentrun(Integer experimentrun) {
        this.experimentrun = experimentrun;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Annotation (");

        sb.append(id);
        sb.append(", ").append(posted);
        sb.append(", ").append(experimentrun);

        sb.append(")");
        return sb.toString();
    }
}
