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
public class RoleRoutineGrants implements Serializable {

    private static final long serialVersionUID = -195388948;

    private String grantor;
    private String grantee;
    private String specificCatalog;
    private String specificSchema;
    private String specificName;
    private String routineCatalog;
    private String routineSchema;
    private String routineName;
    private String privilegeType;
    private String isGrantable;

    public RoleRoutineGrants() {}

    public RoleRoutineGrants(RoleRoutineGrants value) {
        this.grantor = value.grantor;
        this.grantee = value.grantee;
        this.specificCatalog = value.specificCatalog;
        this.specificSchema = value.specificSchema;
        this.specificName = value.specificName;
        this.routineCatalog = value.routineCatalog;
        this.routineSchema = value.routineSchema;
        this.routineName = value.routineName;
        this.privilegeType = value.privilegeType;
        this.isGrantable = value.isGrantable;
    }

    public RoleRoutineGrants(
        String grantor,
        String grantee,
        String specificCatalog,
        String specificSchema,
        String specificName,
        String routineCatalog,
        String routineSchema,
        String routineName,
        String privilegeType,
        String isGrantable
    ) {
        this.grantor = grantor;
        this.grantee = grantee;
        this.specificCatalog = specificCatalog;
        this.specificSchema = specificSchema;
        this.specificName = specificName;
        this.routineCatalog = routineCatalog;
        this.routineSchema = routineSchema;
        this.routineName = routineName;
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

    public String getSpecificCatalog() {
        return this.specificCatalog;
    }

    public void setSpecificCatalog(String specificCatalog) {
        this.specificCatalog = specificCatalog;
    }

    public String getSpecificSchema() {
        return this.specificSchema;
    }

    public void setSpecificSchema(String specificSchema) {
        this.specificSchema = specificSchema;
    }

    public String getSpecificName() {
        return this.specificName;
    }

    public void setSpecificName(String specificName) {
        this.specificName = specificName;
    }

    public String getRoutineCatalog() {
        return this.routineCatalog;
    }

    public void setRoutineCatalog(String routineCatalog) {
        this.routineCatalog = routineCatalog;
    }

    public String getRoutineSchema() {
        return this.routineSchema;
    }

    public void setRoutineSchema(String routineSchema) {
        this.routineSchema = routineSchema;
    }

    public String getRoutineName() {
        return this.routineName;
    }

    public void setRoutineName(String routineName) {
        this.routineName = routineName;
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
        StringBuilder sb = new StringBuilder("RoleRoutineGrants (");

        sb.append(grantor);
        sb.append(", ").append(grantee);
        sb.append(", ").append(specificCatalog);
        sb.append(", ").append(specificSchema);
        sb.append(", ").append(specificName);
        sb.append(", ").append(routineCatalog);
        sb.append(", ").append(routineSchema);
        sb.append(", ").append(routineName);
        sb.append(", ").append(privilegeType);
        sb.append(", ").append(isGrantable);

        sb.append(")");
        return sb.toString();
    }
}
