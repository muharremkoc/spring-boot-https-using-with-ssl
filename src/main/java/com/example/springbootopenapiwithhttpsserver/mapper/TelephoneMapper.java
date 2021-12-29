package com.example.springbootopenapiwithhttpsserver.mapper;


import com.example.springbootopenapiwithhttpsserver.dto.TelephoneDTO;
import com.example.springbootopenapiwithhttpsserver.model.Telephone;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface TelephoneMapper {

    @Mappings({
            @Mapping(target = "modelName",source = "modelName"),
            @Mapping(target = "OS",source = "OS")
    })
    Telephone telephoneDTOtoTelephone(TelephoneDTO telephoneDTO);
}
