/*
 * This file is generated by jOOQ.
 */
package jooq.sqlite.gen.tables.pojos;


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
public class Dataframe implements Serializable {

    private static final long serialVersionUID = -785617279;

    private Integer id;
    private String  tag;
    private Integer numrows;
    private Integer experimentrun;
    private String  filepath;

    public Dataframe() {}

    public Dataframe(Dataframe value) {
        this.id = value.id;
        this.tag = value.tag;
        this.numrows = value.numrows;
        this.experimentrun = value.experimentrun;
        this.filepath = value.filepath;
    }

    public Dataframe(
        Integer id,
        String  tag,
        Integer numrows,
        Integer experimentrun,
        String  filepath
    ) {
        this.id = id;
        this.tag = tag;
        this.numrows = numrows;
        this.experimentrun = experimentrun;
        this.filepath = filepath;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getNumrows() {
        return this.numrows;
    }

    public void setNumrows(Integer numrows) {
        this.numrows = numrows;
    }

    public Integer getExperimentrun() {
        return this.experimentrun;
    }

    public void setExperimentrun(Integer experimentrun) {
        this.experimentrun = experimentrun;
    }

    public String getFilepath() {
        return this.filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Dataframe (");

        sb.append(id);
        sb.append(", ").append(tag);
        sb.append(", ").append(numrows);
        sb.append(", ").append(experimentrun);
        sb.append(", ").append(filepath);

        sb.append(")");
        return sb.toString();
    }
}
