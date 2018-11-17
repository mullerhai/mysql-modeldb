/*
 * This file is generated by jOOQ.
 */
package jooq.mysql.gen.tables.pojos;


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
public class Crossvalidationevent implements Serializable {

    private static final long serialVersionUID = 1567079353;

    private Integer id;
    private Integer df;
    private Integer spec;
    private Integer numfolds;
    private Long    randomseed;
    private String  evaluator;
    private Integer experimentrun;

    public Crossvalidationevent() {}

    public Crossvalidationevent(Crossvalidationevent value) {
        this.id = value.id;
        this.df = value.df;
        this.spec = value.spec;
        this.numfolds = value.numfolds;
        this.randomseed = value.randomseed;
        this.evaluator = value.evaluator;
        this.experimentrun = value.experimentrun;
    }

    public Crossvalidationevent(
        Integer id,
        Integer df,
        Integer spec,
        Integer numfolds,
        Long    randomseed,
        String  evaluator,
        Integer experimentrun
    ) {
        this.id = id;
        this.df = df;
        this.spec = spec;
        this.numfolds = numfolds;
        this.randomseed = randomseed;
        this.evaluator = evaluator;
        this.experimentrun = experimentrun;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDf() {
        return this.df;
    }

    public void setDf(Integer df) {
        this.df = df;
    }

    public Integer getSpec() {
        return this.spec;
    }

    public void setSpec(Integer spec) {
        this.spec = spec;
    }

    public Integer getNumfolds() {
        return this.numfolds;
    }

    public void setNumfolds(Integer numfolds) {
        this.numfolds = numfolds;
    }

    public Long getRandomseed() {
        return this.randomseed;
    }

    public void setRandomseed(Long randomseed) {
        this.randomseed = randomseed;
    }

    public String getEvaluator() {
        return this.evaluator;
    }

    public void setEvaluator(String evaluator) {
        this.evaluator = evaluator;
    }

    public Integer getExperimentrun() {
        return this.experimentrun;
    }

    public void setExperimentrun(Integer experimentrun) {
        this.experimentrun = experimentrun;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Crossvalidationevent (");

        sb.append(id);
        sb.append(", ").append(df);
        sb.append(", ").append(spec);
        sb.append(", ").append(numfolds);
        sb.append(", ").append(randomseed);
        sb.append(", ").append(evaluator);
        sb.append(", ").append(experimentrun);

        sb.append(")");
        return sb.toString();
    }
}