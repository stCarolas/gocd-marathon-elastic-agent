package ru.github.stcarolas.gocd.marathon.handlers;

import com.thoughtworks.go.plugin.api.logging.Logger;
import com.thoughtworks.go.plugin.api.request.GoPluginApiRequest;
import com.thoughtworks.go.plugin.api.response.GoPluginApiResponse;

abstract public class DefaultGoElasticRequestHandler implements GoRequestHandler {
    
    public static final String ELASTIC_AGENT_REQUEST_PREFIX = "cd.go.elastic-agent.";

    private Logger log = Logger.getLoggerFor(DefaultGoElasticRequestHandler.class);
    private String fullCommandString;
    private GoRequestHandler next;

    public DefaultGoElasticRequestHandler(){
        fullCommandString = ELASTIC_AGENT_REQUEST_PREFIX + getCommandName();
    }

    abstract protected GoPluginApiResponse handleCommand(GoPluginApiRequest request);
    abstract protected String getCommandName();
    
    public String getCommandPrefix() {
        return ELASTIC_AGENT_REQUEST_PREFIX;
    }
    
	@Override
	public GoPluginApiResponse handle(GoPluginApiRequest request) {
        if (fullCommandString.equals(request.requestName())) {
            handleCommand(request);
        }
        if (getNext() == null) {
            throw new NoHandlerException();
        }
        return getNext().handle(request);
	}

	@Override
	public GoRequestHandler getNext() {
		return next;
	}

	@Override
	public GoRequestHandler setNext(GoRequestHandler next) {
        this.next = next;
		return next;
	}

} 
