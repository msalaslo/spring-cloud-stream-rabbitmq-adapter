package com.verisure.integration.amqpadapter.integration.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.verisure.integration.amqpadapter.integration.domain.ConfigurationChangeResponse;

/**
 * OSB Integration Spring Feign client used as template. 
 *
 * @since 3.0.0
 * @author FaaS [faas@securitasdirect.es]
 */
@FeignClient(url="http://localhost:8080", name="feignExample")
public interface OSBIntegrationClient {

	   @RequestMapping("/mock/osb/device/configuration/change")
	   public void sendConfigurationChangeResponse(ConfigurationChangeResponse configurationChangeResponse);   

}
