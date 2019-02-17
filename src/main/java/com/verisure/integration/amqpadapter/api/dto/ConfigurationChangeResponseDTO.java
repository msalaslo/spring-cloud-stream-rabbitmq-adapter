package com.verisure.integration.amqpadapter.api.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Configuration Change Response DTO object.
 * @since 1.0.0
 * @author FaaS [faas@securitasdirect.es]
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ConfigurationChangeResponseDTO extends BaseDTO {

    @ApiModelProperty(notes = "Application item code ", required = true)
    private String applicationCode;

    @ApiModelProperty(notes = "Application description ", required = true)
    private String applicationDescription;

}
