/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.pg_catalog.tables.pojos;


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
public class PgStatBgwriter implements Serializable {

    private static final long serialVersionUID = -309689141;

    private Long           checkpointsTimed;
    private Long           checkpointsReq;
    private Double         checkpointWriteTime;
    private Double         checkpointSyncTime;
    private Long           buffersCheckpoint;
    private Long           buffersClean;
    private Long           maxwrittenClean;
    private Long           buffersBackend;
    private Long           buffersBackendFsync;
    private Long           buffersAlloc;
    private OffsetDateTime statsReset;

    public PgStatBgwriter() {}

    public PgStatBgwriter(PgStatBgwriter value) {
        this.checkpointsTimed = value.checkpointsTimed;
        this.checkpointsReq = value.checkpointsReq;
        this.checkpointWriteTime = value.checkpointWriteTime;
        this.checkpointSyncTime = value.checkpointSyncTime;
        this.buffersCheckpoint = value.buffersCheckpoint;
        this.buffersClean = value.buffersClean;
        this.maxwrittenClean = value.maxwrittenClean;
        this.buffersBackend = value.buffersBackend;
        this.buffersBackendFsync = value.buffersBackendFsync;
        this.buffersAlloc = value.buffersAlloc;
        this.statsReset = value.statsReset;
    }

    public PgStatBgwriter(
        Long           checkpointsTimed,
        Long           checkpointsReq,
        Double         checkpointWriteTime,
        Double         checkpointSyncTime,
        Long           buffersCheckpoint,
        Long           buffersClean,
        Long           maxwrittenClean,
        Long           buffersBackend,
        Long           buffersBackendFsync,
        Long           buffersAlloc,
        OffsetDateTime statsReset
    ) {
        this.checkpointsTimed = checkpointsTimed;
        this.checkpointsReq = checkpointsReq;
        this.checkpointWriteTime = checkpointWriteTime;
        this.checkpointSyncTime = checkpointSyncTime;
        this.buffersCheckpoint = buffersCheckpoint;
        this.buffersClean = buffersClean;
        this.maxwrittenClean = maxwrittenClean;
        this.buffersBackend = buffersBackend;
        this.buffersBackendFsync = buffersBackendFsync;
        this.buffersAlloc = buffersAlloc;
        this.statsReset = statsReset;
    }

    public Long getCheckpointsTimed() {
        return this.checkpointsTimed;
    }

    public void setCheckpointsTimed(Long checkpointsTimed) {
        this.checkpointsTimed = checkpointsTimed;
    }

    public Long getCheckpointsReq() {
        return this.checkpointsReq;
    }

    public void setCheckpointsReq(Long checkpointsReq) {
        this.checkpointsReq = checkpointsReq;
    }

    public Double getCheckpointWriteTime() {
        return this.checkpointWriteTime;
    }

    public void setCheckpointWriteTime(Double checkpointWriteTime) {
        this.checkpointWriteTime = checkpointWriteTime;
    }

    public Double getCheckpointSyncTime() {
        return this.checkpointSyncTime;
    }

    public void setCheckpointSyncTime(Double checkpointSyncTime) {
        this.checkpointSyncTime = checkpointSyncTime;
    }

    public Long getBuffersCheckpoint() {
        return this.buffersCheckpoint;
    }

    public void setBuffersCheckpoint(Long buffersCheckpoint) {
        this.buffersCheckpoint = buffersCheckpoint;
    }

    public Long getBuffersClean() {
        return this.buffersClean;
    }

    public void setBuffersClean(Long buffersClean) {
        this.buffersClean = buffersClean;
    }

    public Long getMaxwrittenClean() {
        return this.maxwrittenClean;
    }

    public void setMaxwrittenClean(Long maxwrittenClean) {
        this.maxwrittenClean = maxwrittenClean;
    }

    public Long getBuffersBackend() {
        return this.buffersBackend;
    }

    public void setBuffersBackend(Long buffersBackend) {
        this.buffersBackend = buffersBackend;
    }

    public Long getBuffersBackendFsync() {
        return this.buffersBackendFsync;
    }

    public void setBuffersBackendFsync(Long buffersBackendFsync) {
        this.buffersBackendFsync = buffersBackendFsync;
    }

    public Long getBuffersAlloc() {
        return this.buffersAlloc;
    }

    public void setBuffersAlloc(Long buffersAlloc) {
        this.buffersAlloc = buffersAlloc;
    }

    public OffsetDateTime getStatsReset() {
        return this.statsReset;
    }

    public void setStatsReset(OffsetDateTime statsReset) {
        this.statsReset = statsReset;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PgStatBgwriter (");

        sb.append(checkpointsTimed);
        sb.append(", ").append(checkpointsReq);
        sb.append(", ").append(checkpointWriteTime);
        sb.append(", ").append(checkpointSyncTime);
        sb.append(", ").append(buffersCheckpoint);
        sb.append(", ").append(buffersClean);
        sb.append(", ").append(maxwrittenClean);
        sb.append(", ").append(buffersBackend);
        sb.append(", ").append(buffersBackendFsync);
        sb.append(", ").append(buffersAlloc);
        sb.append(", ").append(statsReset);

        sb.append(")");
        return sb.toString();
    }
}
