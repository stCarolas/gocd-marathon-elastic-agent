package ru.github.stcarolas.gocd.marathon.handlers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

abstract public class DefaultGoElasticRequestHandler extends AbstractRequestHandler  {

    protected final Gson gson = new GsonBuilder().create();
    
    public static final String ELASTIC_AGENT_REQUEST_PREFIX = "cd.go.elastic-agent.";

    @Override
    public String getCommandPrefix() {
        return ELASTIC_AGENT_REQUEST_PREFIX;
    }
} 
