package ru.github.stcarolas.gocd.marathon.agents;

import com.thoughtworks.go.plugin.api.logging.Logger;

public class AgentPool {
    public static final Logger LOG = Logger.getLoggerFor(AgentPool.class);
    private static final AgentPool pool = new AgentPool();

    private AgentPool(){}

    public static AgentPool getInstance() {
        return pool;
    }

    public Agent getAgent(String enviroment, String configPath){
        LOG.info("load from file " + configPath);
        return null;
    }
} 
