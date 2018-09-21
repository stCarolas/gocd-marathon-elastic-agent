package ru.github.stcarolas.gocd.marathon.handlers;

import com.google.common.io.BaseEncoding;
import com.google.gson.JsonObject;
import com.thoughtworks.go.plugin.api.request.GoPluginApiRequest;
import com.thoughtworks.go.plugin.api.response.DefaultGoPluginApiResponse;
import com.thoughtworks.go.plugin.api.response.GoPluginApiResponse;

import ru.github.stcarolas.gocd.marathon.Util;

public class GetIconHandler extends DefaultGoElasticRequestHandler {

	@Override
	protected GoPluginApiResponse handleCommand(GoPluginApiRequest request) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("content_type", "image/png");
        jsonObject.addProperty("data", BaseEncoding.base64().encode(Util.readResourceBytes("/logo.png")));
        DefaultGoPluginApiResponse defaultGoPluginApiResponse = new DefaultGoPluginApiResponse(200, gson.toJson(jsonObject));
        return defaultGoPluginApiResponse;
	}

	@Override
	protected String getCommandName() {
		return "get-icon";
	}
    
} 
