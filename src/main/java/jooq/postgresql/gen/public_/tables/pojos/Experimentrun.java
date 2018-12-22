/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.public_.tables.pojos;


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
public class Experimentrun implements Serializable {

    private static final long serialVersionUID = 165373824;

    private Integer   id;
    private Integer   experiment;
    private String    description;
    private String    sha;
    private Timestamp created;

    public Experimentrun() {}

    public Experimentrun(Experimentrun value) {
        this.id = value.id;
        this.experiment = value.experiment;
        this.description = value.description;
        this.sha = value.sha;
        this.created = value.created;
    }

    public Experimentrun(
        Integer   id,
        Integer   experiment,
        String    description,
        String    sha,
        Timestamp created
    ) {
        this.id = id;
        this.experiment = experiment;
        this.description = description;
        this.sha = sha;
        this.created = created;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getExperiment() {
        return this.experiment;
    }

    public void setExperiment(Integer experiment) {
        this.experiment = experiment;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSha() {
        return this.sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public Timestamp getCreated() {
        return this.created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Experimentrun (");

        sb.append(id);
        sb.append(", ").append(experiment);
        sb.append(", ").append(description);
        sb.append(", ").append(sha);
        sb.append(", ").append(created);

        sb.append(")");
        return sb.toString();
    }
}
