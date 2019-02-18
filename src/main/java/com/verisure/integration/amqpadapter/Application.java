package com.verisure.integration.amqpadapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import lombok.extern.slf4j.Slf4j;

/**
 * Application bootstrap class.
 *
 * @since 1.0.0
 * @author FaaS [faas@securitasdirect.es]
 */
@Slf4j
@SpringBootApplication
@EnableFeignClients
public class Application {
	
    protected Application() {
        LOGGER.info("Starting AMQP OSB Adapter microservice");
    }

    public static void main(String[] args) {
    	SpringApplication.run(Application.class, args);
    }
}
