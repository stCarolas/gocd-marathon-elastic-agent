package com.example.elasticagent.models;

import java.util.Objects;

public class AgentStatusReport {

    private final JobIdentifier jobIdentifier;
    private final String elasticAgentId;
    private final Long createdAt;
    //Add fields as needed

    public AgentStatusReport(JobIdentifier jobIdentifier, String elasticAgentId, Long createdAt) {
        this.jobIdentifier = jobIdentifier;
        this.elasticAgentId = elasticAgentId;
        this.createdAt = createdAt;
    }

    public JobIdentifier getJobIdentifier() {
        return jobIdentifier;
    }

    public String getElasticAgentId() {
        return elasticAgentId;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AgentStatusReport that = (AgentStatusReport) o;
        return Objects.equals(jobIdentifier, that.jobIdentifier) &&
                Objects.equals(elasticAgentId, that.elasticAgentId) &&
                Objects.equals(createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobIdentifier, elasticAgentId, createdAt);
    }
}
