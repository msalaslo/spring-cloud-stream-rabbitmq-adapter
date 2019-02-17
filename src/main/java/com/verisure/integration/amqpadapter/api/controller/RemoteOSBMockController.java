package com.verisure.integration.amqpadapter.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.verisure.integration.amqpadapter.api.dto.ConfigurationChangeResponseDTO;
import com.verisure.integration.amqpadapter.api.dto.ItemDTO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

/**
 * Sample controller used as OSB mock to test the remote invocation.
 * Used to invoke from the Spring Feign. 
 * <b>Please remove for actual project implementation.</b>
 *
 * @since 3.0.0
 * @author FaaS [faas@securitasdirect.es]
 */
@Slf4j
@RestController
@RequestMapping("/mock/osb/device/configuration/change")
@Api(value = "Remote application demo")
public class RemoteOSBMockController {

    
    @PostMapping(produces = "application/json")
    @ResponseBody
    @ApiOperation(value = "view the list of ALL application items", response = ConfigurationChangeResponseDTO.class)
    public void postConfigurationChangeResponse(ConfigurationChangeResponseDTO configurationChange) {
        LOGGER.debug("OSB Mock configuration change response received:" + configurationChange);
    }
}
