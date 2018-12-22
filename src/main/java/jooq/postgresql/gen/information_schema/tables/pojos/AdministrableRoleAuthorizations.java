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
public class AdministrableRoleAuthorizations implements Serializable {

    private static final long serialVersionUID = 1977378105;

    private String grantee;
    private String roleName;
    private String isGrantable;

    public AdministrableRoleAuthorizations() {}

    public AdministrableRoleAuthorizations(AdministrableRoleAuthorizations value) {
        this.grantee = value.grantee;
        this.roleName = value.roleName;
        this.isGrantable = value.isGrantable;
    }

    public AdministrableRoleAuthorizations(
        String grantee,
        String roleName,
        String isGrantable
    ) {
        this.grantee = grantee;
        this.roleName = roleName;
        this.isGrantable = isGrantable;
    }

    public String getGrantee() {
        return this.grantee;
    }

    public void setGrantee(String grantee) {
        this.grantee = grantee;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getIsGrantable() {
        return this.isGrantable;
    }

    public void setIsGrantable(String isGrantable) {
        this.isGrantable = isGrantable;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AdministrableRoleAuthorizations (");

        sb.append(grantee);
        sb.append(", ").append(roleName);
        sb.append(", ").append(isGrantable);

        sb.append(")");
        return sb.toString();
    }
}
