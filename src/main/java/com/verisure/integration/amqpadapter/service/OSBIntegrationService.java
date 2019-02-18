package com.verisure.integration.amqpadapter.service;


import java.io.IOException;

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
	 * @param string The message to send.
	 */
    public void sendGenericMessage(String message) throws IOException;


}
