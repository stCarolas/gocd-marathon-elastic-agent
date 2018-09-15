package ru.github.stcarolas.gocd.marathon.handlers;

import com.thoughtworks.go.plugin.api.request.GoPluginApiRequest;
import com.thoughtworks.go.plugin.api.response.GoPluginApiResponse;

public interface GoRequestHandler {
    public static final String REQUEST_SERVER_PREFIX = "go.processor";
    public static final String ELASTIC_AGENT_REQUEST_PREFIX = "cd.go.elastic-agent.";
    public static final String GO_PLUGIN_SETTINGS_PREFIX = "go.plugin-settings";

    public GoPluginApiResponse handle(GoPluginApiRequest request);
	public GoRequestHandler getNext();
	public GoRequestHandler setNext(GoRequestHandler next);

} 
