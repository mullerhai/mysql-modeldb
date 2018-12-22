/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.public_.tables.pojos;


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
public class Transformer implements Serializable {

    private static final long serialVersionUID = -784064367;

    private Integer id;
    private String  transformertype;
    private String  tag;
    private Integer experimentrun;
    private String  filepath;

    public Transformer() {}

    public Transformer(Transformer value) {
        this.id = value.id;
        this.transformertype = value.transformertype;
        this.tag = value.tag;
        this.experimentrun = value.experimentrun;
        this.filepath = value.filepath;
    }

    public Transformer(
        Integer id,
        String  transformertype,
        String  tag,
        Integer experimentrun,
        String  filepath
    ) {
        this.id = id;
        this.transformertype = transformertype;
        this.tag = tag;
        this.experimentrun = experimentrun;
        this.filepath = filepath;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTransformertype() {
        return this.transformertype;
    }

    public void setTransformertype(String transformertype) {
        this.transformertype = transformertype;
    }

    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
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
        StringBuilder sb = new StringBuilder("Transformer (");

        sb.append(id);
        sb.append(", ").append(transformertype);
        sb.append(", ").append(tag);
        sb.append(", ").append(experimentrun);
        sb.append(", ").append(filepath);

        sb.append(")");
        return sb.toString();
    }
}
