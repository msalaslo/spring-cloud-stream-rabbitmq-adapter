package com.verisure.integration.amqpadapter.api.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.verisure.integration.amqpadapter.api.dto.ConfigurationChangeResponseDTO;
import com.verisure.integration.amqpadapter.integration.domain.ConfigurationChangeResponse;

/**
 * Sample converter used as template. <b>Please remove for actual project implementation.</b>
 *
 * @since 1.0.0
 * @author FaaS [faas@securitasdirect.es]
 */
@Mapper(componentModel = "spring")
public interface ConfigurationChangeResponseConverter {
	
    @Mappings({
        @Mapping(source = "itemCode", target = "applicationCode"),
        @Mapping(source = "itemDescription", target = "applicationDescription")
    })
	ConfigurationChangeResponseDTO toDto(ConfigurationChangeResponse entity);

    @Mappings({
        @Mapping(source = "applicationCode", target = "itemCode"),
        @Mapping(source = "applicationDescription", target = "itemDescription")
    })
	ConfigurationChangeResponse toEntity(ConfigurationChangeResponseDTO dto);

}