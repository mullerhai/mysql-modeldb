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
public class RoleUsageGrants implements Serializable {

    private static final long serialVersionUID = -2046963493;

    private String grantor;
    private String grantee;
    private String objectCatalog;
    private String objectSchema;
    private String objectName;
    private String objectType;
    private String privilegeType;
    private String isGrantable;

    public RoleUsageGrants() {}

    public RoleUsageGrants(RoleUsageGrants value) {
        this.grantor = value.grantor;
        this.grantee = value.grantee;
        this.objectCatalog = value.objectCatalog;
        this.objectSchema = value.objectSchema;
        this.objectName = value.objectName;
        this.objectType = value.objectType;
        this.privilegeType = value.privilegeType;
        this.isGrantable = value.isGrantable;
    }

    public RoleUsageGrants(
        String grantor,
        String grantee,
        String objectCatalog,
        String objectSchema,
        String objectName,
        String objectType,
        String privilegeType,
        String isGrantable
    ) {
        this.grantor = grantor;
        this.grantee = grantee;
        this.objectCatalog = objectCatalog;
        this.objectSchema = objectSchema;
        this.objectName = objectName;
        this.objectType = objectType;
        this.privilegeType = privilegeType;
        this.isGrantable = isGrantable;
    }

    public String getGrantor() {
        return this.grantor;
    }

    public void setGrantor(String grantor) {
        this.grantor = grantor;
    }

    public String getGrantee() {
        return this.grantee;
    }

    public void setGrantee(String grantee) {
        this.grantee = grantee;
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

    public String getPrivilegeType() {
        return this.privilegeType;
    }

    public void setPrivilegeType(String privilegeType) {
        this.privilegeType = privilegeType;
    }

    public String getIsGrantable() {
        return this.isGrantable;
    }

    public void setIsGrantable(String isGrantable) {
        this.isGrantable = isGrantable;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RoleUsageGrants (");

        sb.append(grantor);
        sb.append(", ").append(grantee);
        sb.append(", ").append(objectCatalog);
        sb.append(", ").append(objectSchema);
        sb.append(", ").append(objectName);
        sb.append(", ").append(objectType);
        sb.append(", ").append(privilegeType);
        sb.append(", ").append(isGrantable);

        sb.append(")");
        return sb.toString();
    }
}
