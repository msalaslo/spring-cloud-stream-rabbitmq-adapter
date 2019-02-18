package com.verisure.integration.amqpadapter.integration.osbclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.fasterxml.jackson.databind.JsonNode;
import com.verisure.integration.amqpadapter.integration.model.ConfigurationChangeResponse;

import feign.Headers;

/**
 * OSB Integration Spring Feign client used as template.
 *
 * @since 3.0.0
 * @author FaaS [faas@securitasdirect.es]
 */
@FeignClient(name = "osbFeignClient", url = "${feign.url}")
public interface OSBIntegrationClient {

	@Headers("Content-Type: application/json")
	@PostMapping(value = "/mock/osb/device/configuration/change")
	public void sendConfigurationChangeResponse(ConfigurationChangeResponse configurationChangeResponse);

	@Headers("Content-Type: application/json")
	@PostMapping(value = "/mock/osb/device/configuration/change")
	public void sendGenericMessage(JsonNode rootNode);

}
