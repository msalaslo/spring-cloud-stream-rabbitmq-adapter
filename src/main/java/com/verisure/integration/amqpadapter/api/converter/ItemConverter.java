package com.verisure.integration.amqpadapter.api.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.verisure.integration.amqpadapter.api.dto.ItemDTO;
import com.verisure.integration.amqpadapter.domain.entity.ApplicationItem;

/**
 * Sample converter used as template. <b>Please remove for actual project implementation.</b>
 *
 * @since 1.0.0
 * @author FaaS [faas@securitasdirect.es]
 */
@Mapper(componentModel = "spring")
public interface ItemConverter {

    @Mappings({
            @Mapping(source = "itemCode", target = "applicationCode"),
            @Mapping(source = "itemDescription", target = "applicationDescription")
    })
    ItemDTO toItemDto(ApplicationItem item);

    @Mappings({
            @Mapping(source = "applicationCode", target = "itemCode"),
            @Mapping(source = "applicationDescription", target = "itemDescription")
    })
    ApplicationItem toApplicationItem(ItemDTO entry);

}