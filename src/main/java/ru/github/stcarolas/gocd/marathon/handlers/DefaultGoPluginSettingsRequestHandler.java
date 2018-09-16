package ru.github.stcarolas.gocd.marathon.handlers;

abstract public class DefaultGoPluginSettingsRequestHandler extends AbstractRequestHandler  {
    
    public static final String PLUGIN_SETTINGS_REQUEST_PREFIX = "go.plugin-settings";

    @Override
    public String getCommandPrefix() {
        return PLUGIN_SETTINGS_REQUEST_PREFIX;
    }
} 
