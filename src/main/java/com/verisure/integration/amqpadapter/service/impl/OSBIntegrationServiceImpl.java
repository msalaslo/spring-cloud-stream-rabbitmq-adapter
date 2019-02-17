package com.verisure.integration.amqpadapter.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verisure.integration.amqpadapter.integration.model.ConfigurationChangeResponse;
import com.verisure.integration.amqpadapter.integration.osbclient.OSBIntegrationClient;
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

    
    @Override
    public void sendConfigurationChangeResponse(ConfigurationChangeResponse configurationChangeResponse) {
    	LOGGER.info("OSB Service sending information.");
    	osbIntegrationClient.sendConfigurationChangeResponse(configurationChangeResponse);
    }
    
    @Override
    public void sendGenericMessage(String message){
    	LOGGER.info("OSB Service generic sending information.");
    	osbIntegrationClient.sendGenericMessage(message);
    }

}
