package ru.github.stcarolas.gocd.marathon.handlers;

import com.thoughtworks.go.plugin.api.request.GoPluginApiRequest;
import com.thoughtworks.go.plugin.api.response.DefaultGoPluginApiResponse;
import com.thoughtworks.go.plugin.api.response.GoPluginApiResponse;

import ru.github.stcarolas.gocd.marathon.agents.AgentPool;
import ru.github.stcarolas.gocd.marathon.model.CreateAgentRequest;

public class CreateAgentHandler extends DefaultGoElasticRequestHandler {

	@Override
	protected GoPluginApiResponse handleCommand(GoPluginApiRequest requestJson) {
        LOG.info("Handling create request:" + requestJson.requestBody());
        CreateAgentRequest request = gson.fromJson(requestJson.requestBody(), CreateAgentRequest.class);
        AgentPool.getInstance().getAgent(
                request.getEnviroment(), 
                request.getProperties().get("path")
        );
        return new DefaultGoPluginApiResponse(200);
	}

	@Override
	protected String getCommandName() {
		return "create-agent";
	}

} 
