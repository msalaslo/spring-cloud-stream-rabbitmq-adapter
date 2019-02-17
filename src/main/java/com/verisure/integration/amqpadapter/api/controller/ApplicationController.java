package com.verisure.integration.amqpadapter.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.verisure.integration.amqpadapter.api.converter.ConfigurationChangeResponseConverter;
import com.verisure.integration.amqpadapter.api.dto.ConfigurationChangeResponseDTO;
import com.verisure.integration.amqpadapter.service.OSBIntegrationService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

/**
 * Sample controller used as template. <b>Please remove for actual project implementation.</b>
 *
 * @since 1.0.0
 * @author FaaS [faas@securitasdirect.es]
 */
@Slf4j
@RestController
@RequestMapping("/application")
@Api(value = "AMQP and OSB Integration")
public class ApplicationController {

    @Autowired
    private ConfigurationChangeResponseConverter configurationChangeResponseConverter;

    @Autowired
    private OSBIntegrationService osbIntegrationService;
       
    @PostMapping(consumes = "application/json", produces = "application/json")
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Create an application item")
    public void sendConfigurationChangeResponse(@Valid @RequestBody ConfigurationChangeResponseDTO request) {
        LOGGER.debug("Received a device configuration change by REST: {}", request.toString());
        osbIntegrationService.sendConfigurationChangeResponse(configurationChangeResponseConverter.toEntity(request));
    }
   
}
