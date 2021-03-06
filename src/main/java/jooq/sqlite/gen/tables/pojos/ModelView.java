/*
 * This file is generated by jOOQ.
 */
package jooq.sqlite.gen.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ModelView implements Serializable {

    private static final long serialVersionUID = -1031050332;

    private Integer feId;
    private String  modelType;
    private Integer model;
    private Integer specId;
    private Integer trainDf;

    public ModelView() {}

    public ModelView(ModelView value) {
        this.feId = value.feId;
        this.modelType = value.modelType;
        this.model = value.model;
        this.specId = value.specId;
        this.trainDf = value.trainDf;
    }

    public ModelView(
        Integer feId,
        String  modelType,
        Integer model,
        Integer specId,
        Integer trainDf
    ) {
        this.feId = feId;
        this.modelType = modelType;
        this.model = model;
        this.specId = specId;
        this.trainDf = trainDf;
    }

    public Integer getFeId() {
        return this.feId;
    }

    public void setFeId(Integer feId) {
        this.feId = feId;
    }

    public String getModelType() {
        return this.modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public Integer getModel() {
        return this.model;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    public Integer getSpecId() {
        return this.specId;
    }

    public void setSpecId(Integer specId) {
        this.specId = specId;
    }

    public Integer getTrainDf() {
        return this.trainDf;
    }

    public void setTrainDf(Integer trainDf) {
        this.trainDf = trainDf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ModelView (");

        sb.append(feId);
        sb.append(", ").append(modelType);
        sb.append(", ").append(model);
        sb.append(", ").append(specId);
        sb.append(", ").append(trainDf);

        sb.append(")");
        return sb.toString();
    }
}
