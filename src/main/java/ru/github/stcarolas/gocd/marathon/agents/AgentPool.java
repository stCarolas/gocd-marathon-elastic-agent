package ru.github.stcarolas.gocd.marathon.agents;

import com.thoughtworks.go.plugin.api.logging.Logger;

import ru.github.stcarolas.gocd.marathon.handlers.AbstractRequestHandler;

public class AgentPool {
    private static final AgentPool pool = new AgentPool();
    public static final Logger LOG = Logger.getLoggerFor(AbstractRequestHandler.class);

    private AgentPool(){}

    public static AgentPool getInstance() {
        return pool;
    }

    public Agent getAgent(String enviroment, String configPath){
        LOG.info("load from file " + configPath);
        return null;
    }
} 
