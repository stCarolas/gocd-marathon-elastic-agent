package ru.github.stcarolas.gocd.marathon.model;

public class Metadata {
    private String key;
    private boolean required;
    private boolean secure;

    public Metadata(String key, boolean required, boolean secure) {
        this.key = key;
        this.required = required;
        this.secure = secure;
    }
	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}
	/**
	 * @return the secure
	 */
	public boolean isSecure() {
		return secure;
	}
	/**
	 * @param secure the secure to set
	 */
	public void setSecure(boolean secure) {
		this.secure = secure;
	}
	/**
	 * @return the required
	 */
	public boolean isRequired() {
		return required;
	}
	/**
	 * @param required the required to set
	 */
	public void setRequired(boolean required) {
		this.required = required;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}
} 
