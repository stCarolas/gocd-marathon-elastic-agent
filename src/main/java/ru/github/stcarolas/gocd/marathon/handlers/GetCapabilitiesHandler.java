package ru.github.stcarolas.gocd.marathon.handlers;

import java.util.LinkedHashMap;
import java.util.Map;

import com.thoughtworks.go.plugin.api.request.GoPluginApiRequest;
import com.thoughtworks.go.plugin.api.response.DefaultGoPluginApiResponse;
import com.thoughtworks.go.plugin.api.response.GoPluginApiResponse;

public class GetCapabilitiesHandler extends DefaultGoElasticRequestHandler {

	private DefaultGoPluginApiResponse response;

    public GetCapabilitiesHandler() {
        Map<String, Boolean> capabilities = new LinkedHashMap<>();
        capabilities.put("supports_status_report", false);
        capabilities.put("supports_agent_status_report", false);
        response = DefaultGoPluginApiResponse.success(gson.toJson(capabilities));
    }

	@Override
	protected GoPluginApiResponse handleCommand(GoPluginApiRequest request) {
        return response;
	}

	@Override
	protected String getCommandName() {
		return "get-capabilities";
	}

}
