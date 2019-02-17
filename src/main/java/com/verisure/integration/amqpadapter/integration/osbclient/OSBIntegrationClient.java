package com.verisure.integration.amqpadapter.integration.osbclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.verisure.integration.amqpadapter.integration.model.ConfigurationChangeResponse;

/**
 * OSB Integration Spring Feign client used as template. 
 *
 * @since 3.0.0
 * @author FaaS [faas@securitasdirect.es]
 */
@FeignClient(name="osbFeignClient", url = "${feign.url}")
public interface OSBIntegrationClient {

	   @RequestMapping(method = RequestMethod.POST, value = "/mock/osb/device/configuration/change")
	   public void sendConfigurationChangeResponse(ConfigurationChangeResponse configurationChangeResponse);
	   
	   @RequestMapping(method = RequestMethod.POST, value = "/mock/osb/device/configuration/change")
	   public void sendGenericMessage(String message);
	   
}
