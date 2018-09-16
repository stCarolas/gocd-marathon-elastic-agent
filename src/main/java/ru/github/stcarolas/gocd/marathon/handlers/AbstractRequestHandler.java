package ru.github.stcarolas.gocd.marathon.handlers;

import com.thoughtworks.go.plugin.api.request.GoPluginApiRequest;
import com.thoughtworks.go.plugin.api.response.GoPluginApiResponse;

abstract public class AbstractRequestHandler implements GoRequestHandler {

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
		return null;
	}

	@Override
	public GoRequestHandler setNext(GoRequestHandler next) {
		return null;
	}

}
