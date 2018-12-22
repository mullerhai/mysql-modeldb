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
public class Treenode implements Serializable {

    private static final long serialVersionUID = 1541770604;

    private Integer id;
    private Integer isleaf;
    private Double  prediction;
    private Double  impurity;
    private Double  gain;
    private Integer splitindex;
    private Integer rootnode;

    public Treenode() {}

    public Treenode(Treenode value) {
        this.id = value.id;
        this.isleaf = value.isleaf;
        this.prediction = value.prediction;
        this.impurity = value.impurity;
        this.gain = value.gain;
        this.splitindex = value.splitindex;
        this.rootnode = value.rootnode;
    }

    public Treenode(
        Integer id,
        Integer isleaf,
        Double  prediction,
        Double  impurity,
        Double  gain,
        Integer splitindex,
        Integer rootnode
    ) {
        this.id = id;
        this.isleaf = isleaf;
        this.prediction = prediction;
        this.impurity = impurity;
        this.gain = gain;
        this.splitindex = splitindex;
        this.rootnode = rootnode;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIsleaf() {
        return this.isleaf;
    }

    public void setIsleaf(Integer isleaf) {
        this.isleaf = isleaf;
    }

    public Double getPrediction() {
        return this.prediction;
    }

    public void setPrediction(Double prediction) {
        this.prediction = prediction;
    }

    public Double getImpurity() {
        return this.impurity;
    }

    public void setImpurity(Double impurity) {
        this.impurity = impurity;
    }

    public Double getGain() {
        return this.gain;
    }

    public void setGain(Double gain) {
        this.gain = gain;
    }

    public Integer getSplitindex() {
        return this.splitindex;
    }

    public void setSplitindex(Integer splitindex) {
        this.splitindex = splitindex;
    }

    public Integer getRootnode() {
        return this.rootnode;
    }

    public void setRootnode(Integer rootnode) {
        this.rootnode = rootnode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Treenode (");

        sb.append(id);
        sb.append(", ").append(isleaf);
        sb.append(", ").append(prediction);
        sb.append(", ").append(impurity);
        sb.append(", ").append(gain);
        sb.append(", ").append(splitindex);
        sb.append(", ").append(rootnode);

        sb.append(")");
        return sb.toString();
    }
}
