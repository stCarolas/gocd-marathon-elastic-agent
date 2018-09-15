package ru.github.stcarolas.gocd.marathon.handlers;

import com.thoughtworks.go.plugin.api.logging.Logger;
import com.thoughtworks.go.plugin.api.request.GoPluginApiRequest;
import com.thoughtworks.go.plugin.api.response.GoPluginApiResponse;

abstract public class DefaultGoRequestHandler implements GoRequestHandler {

    private Logger log = Logger.getLoggerFor(DefaultGoRequestHandler.class);
    private String fullCommandString;
    private GoRequestHandler next;

    public DefaultGoRequestHandler(){
        fullCommandString = ELASTIC_AGENT_REQUEST_PREFIX + getCommandName();
    }

    abstract protected GoPluginApiResponse handleCommand(GoPluginApiRequest request);
    abstract protected String getCommandName();

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
