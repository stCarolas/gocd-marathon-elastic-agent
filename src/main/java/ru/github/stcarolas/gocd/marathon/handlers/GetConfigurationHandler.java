package ru.github.stcarolas.gocd.marathon.handlers;

import com.thoughtworks.go.plugin.api.request.GoPluginApiRequest;
import com.thoughtworks.go.plugin.api.response.DefaultGoPluginApiResponse;
import com.thoughtworks.go.plugin.api.response.GoPluginApiResponse;

public class GetConfigurationHandler extends DefaultGoPluginSettingsRequestHandler {

	@Override
	protected GoPluginApiResponse handleCommand(GoPluginApiRequest request) {
        return new DefaultGoPluginApiResponse(200);
	}

	@Override
	protected String getCommandName() {
		return "get-configuration";
	}
    

} 
