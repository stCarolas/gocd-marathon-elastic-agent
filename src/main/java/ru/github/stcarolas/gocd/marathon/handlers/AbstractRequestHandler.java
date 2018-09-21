package ru.github.stcarolas.gocd.marathon.handlers;

import com.thoughtworks.go.plugin.api.logging.Logger;
import com.thoughtworks.go.plugin.api.request.GoPluginApiRequest;
import com.thoughtworks.go.plugin.api.response.DefaultGoPluginApiResponse;
import com.thoughtworks.go.plugin.api.response.GoPluginApiResponse;

abstract public class AbstractRequestHandler implements GoRequestHandler {

    public static final Logger LOG = Logger.getLoggerFor(AbstractRequestHandler.class);

    abstract protected GoPluginApiResponse handleCommand(GoPluginApiRequest request);
    abstract protected String getCommandName();
    abstract protected String getCommandPrefix();

    private String fullCommandString;
    private GoRequestHandler next;

    public AbstractRequestHandler(){
        fullCommandString = getCommandPrefix() + getCommandName();
    }
    
	@Override
	public GoPluginApiResponse handle(GoPluginApiRequest request) {
        LOG.info("Handler " + fullCommandString + " cheking " + request.requestName());
        if (fullCommandString.equals(request.requestName())) {
            LOG.info("Handler " + fullCommandString + " handle " + request.requestName());
            return handleCommand(request);
        }
        if (getNext() == null) {
            LOG.info("No handlers left, " + fullCommandString +  " was last");
            return DefaultGoPluginApiResponse.error("Dont understand");
        }
        LOG.info("Handler " + fullCommandString + " delegates " + request.requestName());
        return getNext().handle(request);
	}


	@Override
	public GoRequestHandler getNext() {
		return next;
	}

	@Override
	public GoRequestHandler setNext(GoRequestHandler next) {
        this.next = next;
		return getNext();
	}

}
