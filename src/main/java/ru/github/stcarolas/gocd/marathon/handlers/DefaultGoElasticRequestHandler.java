package ru.github.stcarolas.gocd.marathon.handlers;

abstract public class DefaultGoElasticRequestHandler extends AbstractRequestHandler  {
    
    public static final String ELASTIC_AGENT_REQUEST_PREFIX = "cd.go.elastic-agent.";

    @Override
    public String getCommandPrefix() {
        return ELASTIC_AGENT_REQUEST_PREFIX;
    }
} 
