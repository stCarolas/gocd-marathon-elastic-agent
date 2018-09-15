package ru.github.stcarolas.gocd.marathon.handlers;

import com.thoughtworks.go.plugin.api.request.GoPluginApiRequest;
import com.thoughtworks.go.plugin.api.response.GoPluginApiResponse;

abstract public class AbstractRequestHandler implements GoRequestHandler {

    private String fullCommandString;
    private GoRequestHandler next;

    abstract protected GoPluginApiResponse handleCommand(GoPluginApiRequest request);
    abstract protected String getCommandName();

    public AbstractRequestHandler(){
        fullCommandString = getCommandPrefix() + getCommandName();
    }

	@Override
	public GoPluginApiResponse handle(GoPluginApiRequest request) {
        if (fullCommandString.equals(request.requestName())) {
            handleCommand(request);
        }
        return null;
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
