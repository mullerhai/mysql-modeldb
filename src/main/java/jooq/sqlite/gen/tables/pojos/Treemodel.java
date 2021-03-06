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
public class Treemodel implements Serializable {

    private static final long serialVersionUID = 1633433683;

    private Integer id;
    private Integer model;
    private String  modeltype;

    public Treemodel() {}

    public Treemodel(Treemodel value) {
        this.id = value.id;
        this.model = value.model;
        this.modeltype = value.modeltype;
    }

    public Treemodel(
        Integer id,
        Integer model,
        String  modeltype
    ) {
        this.id = id;
        this.model = model;
        this.modeltype = modeltype;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getModel() {
        return this.model;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    public String getModeltype() {
        return this.modeltype;
    }

    public void setModeltype(String modeltype) {
        this.modeltype = modeltype;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Treemodel (");

        sb.append(id);
        sb.append(", ").append(model);
        sb.append(", ").append(modeltype);

        sb.append(")");
        return sb.toString();
    }
}
