package com.verisure.integration.amqpadapter.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verisure.integration.amqpadapter.integration.client.OSBIntegrationClient;
import com.verisure.integration.amqpadapter.integration.domain.ConfigurationChangeResponse;
import com.verisure.integration.amqpadapter.service.OSBIntegrationService;

import lombok.extern.slf4j.Slf4j;

/**
 * OSB service implementation.
 *
 * @since 1.0.0
 * @author FaaS [faas@securitasdirect.es]
 */
@Service
@Slf4j
public class OSBIntegrationServiceImpl implements OSBIntegrationService {

	@Autowired
	private OSBIntegrationClient osbIntegrationClient;

    
	/**
	 * Sends to OSB a configuration change response.
	 * 
	 * @param configurationChangeResponse The configuration change response  to send.
	 */
    @Override
    public void sendConfigurationChangeResponse(ConfigurationChangeResponse configurationChangeResponse) {
    	osbIntegrationClient.sendConfigurationChangeResponse(configurationChangeResponse);
    }

}
