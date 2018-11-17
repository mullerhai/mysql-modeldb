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
public class Project implements Serializable {

    private static final long serialVersionUID = 1018406095;

    private Integer   id;
    private String    name;
    private String    author;
    private String    description;
    private Timestamp created;

    public Project() {}

    public Project(Project value) {
        this.id = value.id;
        this.name = value.name;
        this.author = value.author;
        this.description = value.description;
        this.created = value.created;
    }

    public Project(
        Integer   id,
        String    name,
        String    author,
        String    description,
        Timestamp created
    ) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.description = description;
        this.created = created;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getCreated() {
        return this.created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Project (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(author);
        sb.append(", ").append(description);
        sb.append(", ").append(created);

        sb.append(")");
        return sb.toString();
    }
}
