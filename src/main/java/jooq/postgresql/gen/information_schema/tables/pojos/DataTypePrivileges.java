/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.information_schema.tables.pojos;


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
public class DataTypePrivileges implements Serializable {

    private static final long serialVersionUID = -179633368;

    private String objectCatalog;
    private String objectSchema;
    private String objectName;
    private String objectType;
    private String dtdIdentifier;

    public DataTypePrivileges() {}

    public DataTypePrivileges(DataTypePrivileges value) {
        this.objectCatalog = value.objectCatalog;
        this.objectSchema = value.objectSchema;
        this.objectName = value.objectName;
        this.objectType = value.objectType;
        this.dtdIdentifier = value.dtdIdentifier;
    }

    public DataTypePrivileges(
        String objectCatalog,
        String objectSchema,
        String objectName,
        String objectType,
        String dtdIdentifier
    ) {
        this.objectCatalog = objectCatalog;
        this.objectSchema = objectSchema;
        this.objectName = objectName;
        this.objectType = objectType;
        this.dtdIdentifier = dtdIdentifier;
    }

    public String getObjectCatalog() {
        return this.objectCatalog;
    }

    public void setObjectCatalog(String objectCatalog) {
        this.objectCatalog = objectCatalog;
    }

    public String getObjectSchema() {
        return this.objectSchema;
    }

    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema;
    }

    public String getObjectName() {
        return this.objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getObjectType() {
        return this.objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getDtdIdentifier() {
        return this.dtdIdentifier;
    }

    public void setDtdIdentifier(String dtdIdentifier) {
        this.dtdIdentifier = dtdIdentifier;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DataTypePrivileges (");

        sb.append(objectCatalog);
        sb.append(", ").append(objectSchema);
        sb.append(", ").append(objectName);
        sb.append(", ").append(objectType);
        sb.append(", ").append(dtdIdentifier);

        sb.append(")");
        return sb.toString();
    }
}
