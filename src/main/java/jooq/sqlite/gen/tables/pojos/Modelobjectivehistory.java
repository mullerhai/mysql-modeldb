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
public class Modelobjectivehistory implements Serializable {

    private static final long serialVersionUID = 1482623149;

    private Integer id;
    private Integer model;
    private Integer iteration;
    private Double  objectivevalue;

    public Modelobjectivehistory() {}

    public Modelobjectivehistory(Modelobjectivehistory value) {
        this.id = value.id;
        this.model = value.model;
        this.iteration = value.iteration;
        this.objectivevalue = value.objectivevalue;
    }

    public Modelobjectivehistory(
        Integer id,
        Integer model,
        Integer iteration,
        Double  objectivevalue
    ) {
        this.id = id;
        this.model = model;
        this.iteration = iteration;
        this.objectivevalue = objectivevalue;
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

    public Integer getIteration() {
        return this.iteration;
    }

    public void setIteration(Integer iteration) {
        this.iteration = iteration;
    }

    public Double getObjectivevalue() {
        return this.objectivevalue;
    }

    public void setObjectivevalue(Double objectivevalue) {
        this.objectivevalue = objectivevalue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Modelobjectivehistory (");

        sb.append(id);
        sb.append(", ").append(model);
        sb.append(", ").append(iteration);
        sb.append(", ").append(objectivevalue);

        sb.append(")");
        return sb.toString();
    }
}
