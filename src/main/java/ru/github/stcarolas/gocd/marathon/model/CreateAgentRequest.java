package ru.github.stcarolas.gocd.marathon.model;

import java.util.Map;

public class CreateAgentRequest {
    private String auto_register_key;
    private String enviroment;
    private Map<String, String> properties;
    private String job_identifier;
	/**
	 * @return the auto_register_key
	 */
	public String getAuto_register_key() {
		return auto_register_key;
	}
	/**
	 * @return the job_identifier
	 */
	public String getJob_identifier() {
		return job_identifier;
	}
	/**
	 * @param job_identifier the job_identifier to set
	 */
	public void setJob_identifier(String job_identifier) {
		this.job_identifier = job_identifier;
	}
	/**
	 * @return the properties
	 */
	public Map<String, String> getProperties() {
		return properties;
	}
	/**
	 * @param properties the properties to set
	 */
	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}
	/**
	 * @return the enviroment
	 */
	public String getEnviroment() {
		return enviroment;
	}
	/**
	 * @param enviroment the enviroment to set
	 */
	public void setEnviroment(String enviroment) {
		this.enviroment = enviroment;
	}
	/**
	 * @param auto_register_key the auto_register_key to set
	 */
	public void setAuto_register_key(String auto_register_key) {
		this.auto_register_key = auto_register_key;
	}

}
