package com.verisure.integration.amqpadapter.listener;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

import com.verisure.integration.amqpadapter.conversion.ConfigurationChangeResponseConverter;
import com.verisure.integration.amqpadapter.listener.dto.ConfigurationChangeResponseDTO;
import com.verisure.integration.amqpadapter.service.OSBIntegrationService;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * Broker to process received messages from Reception Controller Microservice.
 * </p>
 * 
 * @author FaaS [faas@securitasdirect.es]
 *
 */
@Slf4j
@Service
@EnableBinding(value = ListenerChannel.class)
public class OSBAdapterBroker {
	
    @Autowired
    private ConfigurationChangeResponseConverter configurationChangeResponseConverter;

    @Autowired
    private OSBIntegrationService osbIntegrationService;

    /**
     * <p>
     * Method to process received message from Device Configuration.
     * </p>
     * 
     * @param message {@link ConfigurationChangeResponseDTO} message
     */
    @StreamListener(value = ListenerChannel.MESSAGE_FROM_DEVICE_CONFIGURATION)
    public void receivedMessageFromDeviceConfiguration(ConfigurationChangeResponseDTO message) {
        LOGGER.info("Received a device configuration change by AMQP: {}", message.toString());
        osbIntegrationService.sendConfigurationChangeResponse(configurationChangeResponseConverter.toEntity(message));
    }
    
    /**
     * <p>
     * Method to process received message from Device Configuration.
     * </p>
     * 
     * @param message {@link ConfigurationChangeResponseDTO} message
     * @throws IOException 
     */
    @StreamListener(value = ListenerChannel.GENERIC_MESSAGE_FROM_DEVICE_CONFIGURATION)
    public void genericMessageFromDeviceConfiguration(String message) throws IOException {    	
        LOGGER.info("Received a device configuration change by AMQP, generic message: {}", message.toString());
        String msg = message.trim().replace(System.getProperty("line.separator"), "");;
        osbIntegrationService.sendGenericMessage(msg);
        LOGGER.info("Sent a device configuration change to OSB, generic message: {}", msg);
    }
    
}
