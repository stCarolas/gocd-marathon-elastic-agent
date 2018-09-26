package ru.github.stcarolas.gocd.marathon.model;

import java.util.Map;

public class CreateAgentRequest {
    private String auto_register_key;
    private String enviroment;
    private Map<String, String> properties;
    private JobIdentifier job_identifier;
	/**
	 * @return the auto_register_key
	 */
	public String getAuto_register_key() {
		return auto_register_key;
	}
	/**
	 * @return the job_identifier
	 */
	public JobIdentifier getJob_identifier() {
		return job_identifier;
	}
	/**
	 * @param job_identifier the job_identifier to set
	 */
	public void setJob_identifier(JobIdentifier job_identifier) {
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

    public static class JobIdentifier {
        private String pipeline_name;
        private String pipeline_label;
        private int pipeline_counter;
        private String stage_name;
        private int stage_counter;
        private String job_name;
        private int job_id;
		/**
		 * @return the pipeline_name
		 */
		public String getPipeline_name() {
			return pipeline_name;
		}
		/**
		 * @return the job_id
		 */
		public int getJob_id() {
			return job_id;
		}
		/**
		 * @param job_id the job_id to set
		 */
		public void setJob_id(int job_id) {
			this.job_id = job_id;
		}
		/**
		 * @return the job_name
		 */
		public String getJob_name() {
			return job_name;
		}
		/**
		 * @param job_name the job_name to set
		 */
		public void setJob_name(String job_name) {
			this.job_name = job_name;
		}
		/**
		 * @return the stage_counter
		 */
		public int getStage_counter() {
			return stage_counter;
		}
		/**
		 * @param stage_counter the stage_counter to set
		 */
		public void setStage_counter(int stage_counter) {
			this.stage_counter = stage_counter;
		}
		/**
		 * @return the stage_name
		 */
		public String getStage_name() {
			return stage_name;
		}
		/**
		 * @param stage_name the stage_name to set
		 */
		public void setStage_name(String stage_name) {
			this.stage_name = stage_name;
		}
		/**
		 * @return the pipeline_counter
		 */
		public int getPipeline_counter() {
			return pipeline_counter;
		}
		/**
		 * @param pipeline_counter the pipeline_counter to set
		 */
		public void setPipeline_counter(int pipeline_counter) {
			this.pipeline_counter = pipeline_counter;
		}
		/**
		 * @return the pipeline_label
		 */
		public String getPipeline_label() {
			return pipeline_label;
		}
		/**
		 * @param pipeline_label the pipeline_label to set
		 */
		public void setPipeline_label(String pipeline_label) {
			this.pipeline_label = pipeline_label;
		}
		/**
		 * @param pipeline_name the pipeline_name to set
		 */
		public void setPipeline_name(String pipeline_name) {
			this.pipeline_name = pipeline_name;
		}

    }

}
