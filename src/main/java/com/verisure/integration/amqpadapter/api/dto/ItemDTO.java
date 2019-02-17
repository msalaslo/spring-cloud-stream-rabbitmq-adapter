package com.verisure.integration.amqpadapter.api.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Sample DTO object. <b>Please remove for actual project implementation.</b>
 *
 * @since 1.0.0
 * @author FaaS [faas@securitasdirect.es]
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemDTO extends BaseDTO {

    @ApiModelProperty(notes = "Application item code ", required = true)
    private String applicationCode;

    @ApiModelProperty(notes = "Application description ", required = true)
    private String applicationDescription;

}
