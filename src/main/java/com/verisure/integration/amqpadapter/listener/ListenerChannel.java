package com.verisure.integration.amqpadapter.listener;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * <p>Listener information sink.</p>
 * 
 * @author FaaS [faas@securitasdirect.es]
 *
 */
public interface ListenerChannel {
    
    /**
     * <p>Channel for received messages from Reception Controller</p>
     */
    public static final String MESSAGE_FROM_DEVICE_CONFIGURATION = "verisure.ima";
   
    
    /**
     *  Method to process received message from Device Configuration.
     * 
     * @return {@link SubscribableChannel}
     */
    @Input(MESSAGE_FROM_DEVICE_CONFIGURATION)
    public SubscribableChannel messageFromDeviceConfiguration();
    
    
}
