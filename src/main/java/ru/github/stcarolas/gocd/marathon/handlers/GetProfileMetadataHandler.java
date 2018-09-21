package ru.github.stcarolas.gocd.marathon.handlers;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.go.plugin.api.request.GoPluginApiRequest;
import com.thoughtworks.go.plugin.api.response.DefaultGoPluginApiResponse;
import com.thoughtworks.go.plugin.api.response.GoPluginApiResponse;

import ru.github.stcarolas.gocd.marathon.model.Metadata;

public class GetProfileMetadataHandler extends DefaultGoElasticRequestHandler {

    public static final Metadata PATH = new Metadata("Path", true, false);
    public static final List<Metadata> FIELDS = new ArrayList<>();

    static {
        FIELDS.add(PATH);
    }

	@Override
	protected GoPluginApiResponse handleCommand(GoPluginApiRequest request) {
        return new DefaultGoPluginApiResponse(200, gson.toJson(FIELDS));
	}

	@Override
	protected String getCommandName() {
		return "get-profile-metadata";
	}

} 
