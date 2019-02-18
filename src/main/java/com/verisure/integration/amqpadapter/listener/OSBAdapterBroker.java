package com.verisure.integration.amqpadapter.listener;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

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
    private OSBIntegrationService osbIntegrationService;
    
    /**
     * <p>
     * Method to process received message from Device Configuration.
     * </p>
     * 
     * @param message {@link ConfigurationChangeResponseDTO} message
     * @throws IOException 
     */
    @StreamListener(value = ListenerChannel.GENERIC_MESSAGE_FROM_DEVICE_CONFIGURATION)
    public void genericMessageFromDeviceConfiguration(@Payload String message, @Headers MessageHeaders headers) throws IOException {    	
        LOGGER.info("Received a device configuration change by AMQP, generic message: {}", message.toString());
        LOGGER.info("Received a device configuration change by AMQP, headers: {}", headers.toString());
        osbIntegrationService.sendGenericMessage(message);
    }
    
}
