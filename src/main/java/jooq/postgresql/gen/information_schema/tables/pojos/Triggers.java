/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.information_schema.tables.pojos;


import java.io.Serializable;
import java.time.OffsetDateTime;

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
public class Triggers implements Serializable {

    private static final long serialVersionUID = -1750102282;

    private String         triggerCatalog;
    private String         triggerSchema;
    private String         triggerName;
    private String         eventManipulation;
    private String         eventObjectCatalog;
    private String         eventObjectSchema;
    private String         eventObjectTable;
    private Integer        actionOrder;
    private String         actionCondition;
    private String         actionStatement;
    private String         actionOrientation;
    private String         actionTiming;
    private String         actionReferenceOldTable;
    private String         actionReferenceNewTable;
    private String         actionReferenceOldRow;
    private String         actionReferenceNewRow;
    private OffsetDateTime created;

    public Triggers() {}

    public Triggers(Triggers value) {
        this.triggerCatalog = value.triggerCatalog;
        this.triggerSchema = value.triggerSchema;
        this.triggerName = value.triggerName;
        this.eventManipulation = value.eventManipulation;
        this.eventObjectCatalog = value.eventObjectCatalog;
        this.eventObjectSchema = value.eventObjectSchema;
        this.eventObjectTable = value.eventObjectTable;
        this.actionOrder = value.actionOrder;
        this.actionCondition = value.actionCondition;
        this.actionStatement = value.actionStatement;
        this.actionOrientation = value.actionOrientation;
        this.actionTiming = value.actionTiming;
        this.actionReferenceOldTable = value.actionReferenceOldTable;
        this.actionReferenceNewTable = value.actionReferenceNewTable;
        this.actionReferenceOldRow = value.actionReferenceOldRow;
        this.actionReferenceNewRow = value.actionReferenceNewRow;
        this.created = value.created;
    }

    public Triggers(
        String         triggerCatalog,
        String         triggerSchema,
        String         triggerName,
        String         eventManipulation,
        String         eventObjectCatalog,
        String         eventObjectSchema,
        String         eventObjectTable,
        Integer        actionOrder,
        String         actionCondition,
        String         actionStatement,
        String         actionOrientation,
        String         actionTiming,
        String         actionReferenceOldTable,
        String         actionReferenceNewTable,
        String         actionReferenceOldRow,
        String         actionReferenceNewRow,
        OffsetDateTime created
    ) {
        this.triggerCatalog = triggerCatalog;
        this.triggerSchema = triggerSchema;
        this.triggerName = triggerName;
        this.eventManipulation = eventManipulation;
        this.eventObjectCatalog = eventObjectCatalog;
        this.eventObjectSchema = eventObjectSchema;
        this.eventObjectTable = eventObjectTable;
        this.actionOrder = actionOrder;
        this.actionCondition = actionCondition;
        this.actionStatement = actionStatement;
        this.actionOrientation = actionOrientation;
        this.actionTiming = actionTiming;
        this.actionReferenceOldTable = actionReferenceOldTable;
        this.actionReferenceNewTable = actionReferenceNewTable;
        this.actionReferenceOldRow = actionReferenceOldRow;
        this.actionReferenceNewRow = actionReferenceNewRow;
        this.created = created;
    }

    public String getTriggerCatalog() {
        return this.triggerCatalog;
    }

    public void setTriggerCatalog(String triggerCatalog) {
        this.triggerCatalog = triggerCatalog;
    }

    public String getTriggerSchema() {
        return this.triggerSchema;
    }

    public void setTriggerSchema(String triggerSchema) {
        this.triggerSchema = triggerSchema;
    }

    public String getTriggerName() {
        return this.triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    public String getEventManipulation() {
        return this.eventManipulation;
    }

    public void setEventManipulation(String eventManipulation) {
        this.eventManipulation = eventManipulation;
    }

    public String getEventObjectCatalog() {
        return this.eventObjectCatalog;
    }

    public void setEventObjectCatalog(String eventObjectCatalog) {
        this.eventObjectCatalog = eventObjectCatalog;
    }

    public String getEventObjectSchema() {
        return this.eventObjectSchema;
    }

    public void setEventObjectSchema(String eventObjectSchema) {
        this.eventObjectSchema = eventObjectSchema;
    }

    public String getEventObjectTable() {
        return this.eventObjectTable;
    }

    public void setEventObjectTable(String eventObjectTable) {
        this.eventObjectTable = eventObjectTable;
    }

    public Integer getActionOrder() {
        return this.actionOrder;
    }

    public void setActionOrder(Integer actionOrder) {
        this.actionOrder = actionOrder;
    }

    public String getActionCondition() {
        return this.actionCondition;
    }

    public void setActionCondition(String actionCondition) {
        this.actionCondition = actionCondition;
    }

    public String getActionStatement() {
        return this.actionStatement;
    }

    public void setActionStatement(String actionStatement) {
        this.actionStatement = actionStatement;
    }

    public String getActionOrientation() {
        return this.actionOrientation;
    }

    public void setActionOrientation(String actionOrientation) {
        this.actionOrientation = actionOrientation;
    }

    public String getActionTiming() {
        return this.actionTiming;
    }

    public void setActionTiming(String actionTiming) {
        this.actionTiming = actionTiming;
    }

    public String getActionReferenceOldTable() {
        return this.actionReferenceOldTable;
    }

    public void setActionReferenceOldTable(String actionReferenceOldTable) {
        this.actionReferenceOldTable = actionReferenceOldTable;
    }

    public String getActionReferenceNewTable() {
        return this.actionReferenceNewTable;
    }

    public void setActionReferenceNewTable(String actionReferenceNewTable) {
        this.actionReferenceNewTable = actionReferenceNewTable;
    }

    public String getActionReferenceOldRow() {
        return this.actionReferenceOldRow;
    }

    public void setActionReferenceOldRow(String actionReferenceOldRow) {
        this.actionReferenceOldRow = actionReferenceOldRow;
    }

    public String getActionReferenceNewRow() {
        return this.actionReferenceNewRow;
    }

    public void setActionReferenceNewRow(String actionReferenceNewRow) {
        this.actionReferenceNewRow = actionReferenceNewRow;
    }

    public OffsetDateTime getCreated() {
        return this.created;
    }

    public void setCreated(OffsetDateTime created) {
        this.created = created;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Triggers (");

        sb.append(triggerCatalog);
        sb.append(", ").append(triggerSchema);
        sb.append(", ").append(triggerName);
        sb.append(", ").append(eventManipulation);
        sb.append(", ").append(eventObjectCatalog);
        sb.append(", ").append(eventObjectSchema);
        sb.append(", ").append(eventObjectTable);
        sb.append(", ").append(actionOrder);
        sb.append(", ").append(actionCondition);
        sb.append(", ").append(actionStatement);
        sb.append(", ").append(actionOrientation);
        sb.append(", ").append(actionTiming);
        sb.append(", ").append(actionReferenceOldTable);
        sb.append(", ").append(actionReferenceNewTable);
        sb.append(", ").append(actionReferenceOldRow);
        sb.append(", ").append(actionReferenceNewRow);
        sb.append(", ").append(created);

        sb.append(")");
        return sb.toString();
    }
}
