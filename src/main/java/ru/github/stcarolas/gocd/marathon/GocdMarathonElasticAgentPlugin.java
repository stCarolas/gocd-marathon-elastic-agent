/*
 * GocdMarathonElasticAgentPlugin.java
 * Copyright (C) 2018 stcarolas <stcarolas@homeGround>
 *
 * Distributed under terms of the MIT license.
 */
package ru.github.stcarolas.gocd.marathon;

import java.util.Collections;

import com.thoughtworks.go.plugin.api.GoApplicationAccessor;
import com.thoughtworks.go.plugin.api.GoPlugin;
import com.thoughtworks.go.plugin.api.GoPluginIdentifier;
import com.thoughtworks.go.plugin.api.annotation.Extension;
import com.thoughtworks.go.plugin.api.exceptions.UnhandledRequestTypeException;
import com.thoughtworks.go.plugin.api.request.GoPluginApiRequest;
import com.thoughtworks.go.plugin.api.response.GoPluginApiResponse;

@Extension
public class GocdMarathonElasticAgentPlugin implements GoPlugin {
    public static final String EXTENSION_API_VERSION = "3.0";
    public static final String EXTENSION_TYPE = "elastic-agent";
    public static final GoPluginIdentifier PLUGIN_ID = new GoPluginIdentifier(
                                                            EXTENSION_TYPE, 
                                                            Collections.singletonList(EXTENSION_API_VERSION)
                                                       );

    private GoApplicationAccessor accessor;

    @Override
    public void initializeGoApplicationAccessor(GoApplicationAccessor accessor) {
        accessor = accessor;
    }

    @Override
    public GoPluginApiResponse handle(GoPluginApiRequest request) throws UnhandledRequestTypeException {
        return null;
    }

    @Override
    public GoPluginIdentifier pluginIdentifier() {
        return PLUGIN_ID;
    }

}
