package ru.github.stcarolas.gocd.marathon.handlers;

import com.google.gson.JsonObject;
import com.thoughtworks.go.plugin.api.request.GoPluginApiRequest;
import com.thoughtworks.go.plugin.api.response.DefaultGoPluginApiResponse;
import com.thoughtworks.go.plugin.api.response.GoPluginApiResponse;

import ru.github.stcarolas.gocd.marathon.Util;

public class GetProfileViewHandler extends DefaultGoElasticRequestHandler {

    private JsonObject template;

	public GetProfileViewHandler() {
        template = new JsonObject();
        template.addProperty("template", Util.readResource("/profile.template.html"));
    }

	@Override
	protected GoPluginApiResponse handleCommand(GoPluginApiRequest request) {
        return new DefaultGoPluginApiResponse(200, gson.toJson(template));
	}

	@Override
	protected String getCommandName() {
		return "get-profile-view";
	}

} 
