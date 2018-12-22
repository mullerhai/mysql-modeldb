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
public class RoleUdtGrants implements Serializable {

    private static final long serialVersionUID = 1868594168;

    private String grantor;
    private String grantee;
    private String udtCatalog;
    private String udtSchema;
    private String udtName;
    private String privilegeType;
    private String isGrantable;

    public RoleUdtGrants() {}

    public RoleUdtGrants(RoleUdtGrants value) {
        this.grantor = value.grantor;
        this.grantee = value.grantee;
        this.udtCatalog = value.udtCatalog;
        this.udtSchema = value.udtSchema;
        this.udtName = value.udtName;
        this.privilegeType = value.privilegeType;
        this.isGrantable = value.isGrantable;
    }

    public RoleUdtGrants(
        String grantor,
        String grantee,
        String udtCatalog,
        String udtSchema,
        String udtName,
        String privilegeType,
        String isGrantable
    ) {
        this.grantor = grantor;
        this.grantee = grantee;
        this.udtCatalog = udtCatalog;
        this.udtSchema = udtSchema;
        this.udtName = udtName;
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

    public String getUdtCatalog() {
        return this.udtCatalog;
    }

    public void setUdtCatalog(String udtCatalog) {
        this.udtCatalog = udtCatalog;
    }

    public String getUdtSchema() {
        return this.udtSchema;
    }

    public void setUdtSchema(String udtSchema) {
        this.udtSchema = udtSchema;
    }

    public String getUdtName() {
        return this.udtName;
    }

    public void setUdtName(String udtName) {
        this.udtName = udtName;
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
        StringBuilder sb = new StringBuilder("RoleUdtGrants (");

        sb.append(grantor);
        sb.append(", ").append(grantee);
        sb.append(", ").append(udtCatalog);
        sb.append(", ").append(udtSchema);
        sb.append(", ").append(udtName);
        sb.append(", ").append(privilegeType);
        sb.append(", ").append(isGrantable);

        sb.append(")");
        return sb.toString();
    }
}
