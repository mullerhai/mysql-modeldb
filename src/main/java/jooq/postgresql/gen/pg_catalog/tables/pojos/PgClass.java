/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.pg_catalog.tables.pojos;


import java.io.Serializable;
import java.util.Arrays;

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
public class PgClass implements Serializable {

    private static final long serialVersionUID = -977520182;

    private String   relname;
    private Long     relnamespace;
    private Long     reltype;
    private Long     reloftype;
    private Long     relowner;
    private Long     relam;
    private Long     relfilenode;
    private Long     reltablespace;
    private Integer  relpages;
    private Float    reltuples;
    private Integer  relallvisible;
    private Long     reltoastrelid;
    private Boolean  relhasindex;
    private Boolean  relisshared;
    private String   relpersistence;
    private String   relkind;
    private Short    relnatts;
    private Short    relchecks;
    private Boolean  relhasoids;
    private Boolean  relhaspkey;
    private Boolean  relhasrules;
    private Boolean  relhastriggers;
    private Boolean  relhassubclass;
    private Boolean  relrowsecurity;
    private Boolean  relforcerowsecurity;
    private Boolean  relispopulated;
    private String   relreplident;
    private Boolean  relispartition;
    private Long     relfrozenxid;
    private Long     relminmxid;
    private String[] relacl;
    private String[] reloptions;
    private Object   relpartbound;

    public PgClass() {}

    public PgClass(PgClass value) {
        this.relname = value.relname;
        this.relnamespace = value.relnamespace;
        this.reltype = value.reltype;
        this.reloftype = value.reloftype;
        this.relowner = value.relowner;
        this.relam = value.relam;
        this.relfilenode = value.relfilenode;
        this.reltablespace = value.reltablespace;
        this.relpages = value.relpages;
        this.reltuples = value.reltuples;
        this.relallvisible = value.relallvisible;
        this.reltoastrelid = value.reltoastrelid;
        this.relhasindex = value.relhasindex;
        this.relisshared = value.relisshared;
        this.relpersistence = value.relpersistence;
        this.relkind = value.relkind;
        this.relnatts = value.relnatts;
        this.relchecks = value.relchecks;
        this.relhasoids = value.relhasoids;
        this.relhaspkey = value.relhaspkey;
        this.relhasrules = value.relhasrules;
        this.relhastriggers = value.relhastriggers;
        this.relhassubclass = value.relhassubclass;
        this.relrowsecurity = value.relrowsecurity;
        this.relforcerowsecurity = value.relforcerowsecurity;
        this.relispopulated = value.relispopulated;
        this.relreplident = value.relreplident;
        this.relispartition = value.relispartition;
        this.relfrozenxid = value.relfrozenxid;
        this.relminmxid = value.relminmxid;
        this.relacl = value.relacl;
        this.reloptions = value.reloptions;
        this.relpartbound = value.relpartbound;
    }

    public PgClass(
        String   relname,
        Long     relnamespace,
        Long     reltype,
        Long     reloftype,
        Long     relowner,
        Long     relam,
        Long     relfilenode,
        Long     reltablespace,
        Integer  relpages,
        Float    reltuples,
        Integer  relallvisible,
        Long     reltoastrelid,
        Boolean  relhasindex,
        Boolean  relisshared,
        String   relpersistence,
        String   relkind,
        Short    relnatts,
        Short    relchecks,
        Boolean  relhasoids,
        Boolean  relhaspkey,
        Boolean  relhasrules,
        Boolean  relhastriggers,
        Boolean  relhassubclass,
        Boolean  relrowsecurity,
        Boolean  relforcerowsecurity,
        Boolean  relispopulated,
        String   relreplident,
        Boolean  relispartition,
        Long     relfrozenxid,
        Long     relminmxid,
        String[] relacl,
        String[] reloptions,
        Object   relpartbound
    ) {
        this.relname = relname;
        this.relnamespace = relnamespace;
        this.reltype = reltype;
        this.reloftype = reloftype;
        this.relowner = relowner;
        this.relam = relam;
        this.relfilenode = relfilenode;
        this.reltablespace = reltablespace;
        this.relpages = relpages;
        this.reltuples = reltuples;
        this.relallvisible = relallvisible;
        this.reltoastrelid = reltoastrelid;
        this.relhasindex = relhasindex;
        this.relisshared = relisshared;
        this.relpersistence = relpersistence;
        this.relkind = relkind;
        this.relnatts = relnatts;
        this.relchecks = relchecks;
        this.relhasoids = relhasoids;
        this.relhaspkey = relhaspkey;
        this.relhasrules = relhasrules;
        this.relhastriggers = relhastriggers;
        this.relhassubclass = relhassubclass;
        this.relrowsecurity = relrowsecurity;
        this.relforcerowsecurity = relforcerowsecurity;
        this.relispopulated = relispopulated;
        this.relreplident = relreplident;
        this.relispartition = relispartition;
        this.relfrozenxid = relfrozenxid;
        this.relminmxid = relminmxid;
        this.relacl = relacl;
        this.reloptions = reloptions;
        this.relpartbound = relpartbound;
    }

    public String getRelname() {
        return this.relname;
    }

    public void setRelname(String relname) {
        this.relname = relname;
    }

    public Long getRelnamespace() {
        return this.relnamespace;
    }

    public void setRelnamespace(Long relnamespace) {
        this.relnamespace = relnamespace;
    }

    public Long getReltype() {
        return this.reltype;
    }

    public void setReltype(Long reltype) {
        this.reltype = reltype;
    }

    public Long getReloftype() {
        return this.reloftype;
    }

    public void setReloftype(Long reloftype) {
        this.reloftype = reloftype;
    }

    public Long getRelowner() {
        return this.relowner;
    }

    public void setRelowner(Long relowner) {
        this.relowner = relowner;
    }

    public Long getRelam() {
        return this.relam;
    }

    public void setRelam(Long relam) {
        this.relam = relam;
    }

    public Long getRelfilenode() {
        return this.relfilenode;
    }

    public void setRelfilenode(Long relfilenode) {
        this.relfilenode = relfilenode;
    }

    public Long getReltablespace() {
        return this.reltablespace;
    }

    public void setReltablespace(Long reltablespace) {
        this.reltablespace = reltablespace;
    }

    public Integer getRelpages() {
        return this.relpages;
    }

    public void setRelpages(Integer relpages) {
        this.relpages = relpages;
    }

    public Float getReltuples() {
        return this.reltuples;
    }

    public void setReltuples(Float reltuples) {
        this.reltuples = reltuples;
    }

    public Integer getRelallvisible() {
        return this.relallvisible;
    }

    public void setRelallvisible(Integer relallvisible) {
        this.relallvisible = relallvisible;
    }

    public Long getReltoastrelid() {
        return this.reltoastrelid;
    }

    public void setReltoastrelid(Long reltoastrelid) {
        this.reltoastrelid = reltoastrelid;
    }

    public Boolean getRelhasindex() {
        return this.relhasindex;
    }

    public void setRelhasindex(Boolean relhasindex) {
        this.relhasindex = relhasindex;
    }

    public Boolean getRelisshared() {
        return this.relisshared;
    }

    public void setRelisshared(Boolean relisshared) {
        this.relisshared = relisshared;
    }

    public String getRelpersistence() {
        return this.relpersistence;
    }

    public void setRelpersistence(String relpersistence) {
        this.relpersistence = relpersistence;
    }

    public String getRelkind() {
        return this.relkind;
    }

    public void setRelkind(String relkind) {
        this.relkind = relkind;
    }

    public Short getRelnatts() {
        return this.relnatts;
    }

    public void setRelnatts(Short relnatts) {
        this.relnatts = relnatts;
    }

    public Short getRelchecks() {
        return this.relchecks;
    }

    public void setRelchecks(Short relchecks) {
        this.relchecks = relchecks;
    }

    public Boolean getRelhasoids() {
        return this.relhasoids;
    }

    public void setRelhasoids(Boolean relhasoids) {
        this.relhasoids = relhasoids;
    }

    public Boolean getRelhaspkey() {
        return this.relhaspkey;
    }

    public void setRelhaspkey(Boolean relhaspkey) {
        this.relhaspkey = relhaspkey;
    }

    public Boolean getRelhasrules() {
        return this.relhasrules;
    }

    public void setRelhasrules(Boolean relhasrules) {
        this.relhasrules = relhasrules;
    }

    public Boolean getRelhastriggers() {
        return this.relhastriggers;
    }

    public void setRelhastriggers(Boolean relhastriggers) {
        this.relhastriggers = relhastriggers;
    }

    public Boolean getRelhassubclass() {
        return this.relhassubclass;
    }

    public void setRelhassubclass(Boolean relhassubclass) {
        this.relhassubclass = relhassubclass;
    }

    public Boolean getRelrowsecurity() {
        return this.relrowsecurity;
    }

    public void setRelrowsecurity(Boolean relrowsecurity) {
        this.relrowsecurity = relrowsecurity;
    }

    public Boolean getRelforcerowsecurity() {
        return this.relforcerowsecurity;
    }

    public void setRelforcerowsecurity(Boolean relforcerowsecurity) {
        this.relforcerowsecurity = relforcerowsecurity;
    }

    public Boolean getRelispopulated() {
        return this.relispopulated;
    }

    public void setRelispopulated(Boolean relispopulated) {
        this.relispopulated = relispopulated;
    }

    public String getRelreplident() {
        return this.relreplident;
    }

    public void setRelreplident(String relreplident) {
        this.relreplident = relreplident;
    }

    public Boolean getRelispartition() {
        return this.relispartition;
    }

    public void setRelispartition(Boolean relispartition) {
        this.relispartition = relispartition;
    }

    public Long getRelfrozenxid() {
        return this.relfrozenxid;
    }

    public void setRelfrozenxid(Long relfrozenxid) {
        this.relfrozenxid = relfrozenxid;
    }

    public Long getRelminmxid() {
        return this.relminmxid;
    }

    public void setRelminmxid(Long relminmxid) {
        this.relminmxid = relminmxid;
    }

    public String[] getRelacl() {
        return this.relacl;
    }

    public void setRelacl(String... relacl) {
        this.relacl = relacl;
    }

    public String[] getReloptions() {
        return this.reloptions;
    }

    public void setReloptions(String... reloptions) {
        this.reloptions = reloptions;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getRelpartbound() {
        return this.relpartbound;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setRelpartbound(Object relpartbound) {
        this.relpartbound = relpartbound;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgClass (");

        sb.append(relname);
        sb.append(", ").append(relnamespace);
        sb.append(", ").append(reltype);
        sb.append(", ").append(reloftype);
        sb.append(", ").append(relowner);
        sb.append(", ").append(relam);
        sb.append(", ").append(relfilenode);
        sb.append(", ").append(reltablespace);
        sb.append(", ").append(relpages);
        sb.append(", ").append(reltuples);
        sb.append(", ").append(relallvisible);
        sb.append(", ").append(reltoastrelid);
        sb.append(", ").append(relhasindex);
        sb.append(", ").append(relisshared);
        sb.append(", ").append(relpersistence);
        sb.append(", ").append(relkind);
        sb.append(", ").append(relnatts);
        sb.append(", ").append(relchecks);
        sb.append(", ").append(relhasoids);
        sb.append(", ").append(relhaspkey);
        sb.append(", ").append(relhasrules);
        sb.append(", ").append(relhastriggers);
        sb.append(", ").append(relhassubclass);
        sb.append(", ").append(relrowsecurity);
        sb.append(", ").append(relforcerowsecurity);
        sb.append(", ").append(relispopulated);
        sb.append(", ").append(relreplident);
        sb.append(", ").append(relispartition);
        sb.append(", ").append(relfrozenxid);
        sb.append(", ").append(relminmxid);
        sb.append(", ").append(Arrays.toString(relacl));
        sb.append(", ").append(Arrays.toString(reloptions));
        sb.append(", ").append(relpartbound);

        sb.append(")");
        return sb.toString();
    }
}
