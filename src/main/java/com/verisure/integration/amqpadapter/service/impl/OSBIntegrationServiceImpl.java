package com.verisure.integration.amqpadapter.service.impl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
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
	
	private static ObjectMapper mapper = new ObjectMapper();

    
    @Override
    public void sendConfigurationChangeResponse(ConfigurationChangeResponse configurationChangeResponse) {
    	LOGGER.info("OSB Service sending information.");
    	osbIntegrationClient.sendConfigurationChangeResponse(configurationChangeResponse);
    }
    
    @Override
    public void sendGenericMessage(String message) throws IOException{
    	LOGGER.info("OSB Service generic transforming to JSON.");
    	JsonNode rootNode = mapper.readTree(message);
    	LOGGER.info("OSB Service generic sending information. jsonNode: {}", rootNode);
    	osbIntegrationClient.sendGenericMessage(rootNode);
    }

}
