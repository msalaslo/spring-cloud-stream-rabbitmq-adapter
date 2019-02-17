package com.verisure.integration.amqpadapter.service;


import com.verisure.integration.amqpadapter.integration.domain.ConfigurationChangeResponse;

/**
 * Interface to define the integration with OSB
 *
 * @since 1.0.0
 * @author FaaS [faas@securitasdirect.es]
 */
public interface OSBIntegrationService {

	/**
	 * Sends to OSB a configuration change response.
	 * 
	 * @param configurationChangeResponse The configuration change response  to send.
	 */
    public void sendConfigurationChangeResponse(ConfigurationChangeResponse configurationChangeResponse);


}
