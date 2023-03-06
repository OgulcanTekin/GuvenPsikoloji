package com.ogulcan.mapper;

import com.ogulcan.dto.request.PsikologSaveRequestDto;
import com.ogulcan.repository.entity.Psikolog;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IPsikologMapper {

    IPsikologMapper INSTANCE= Mappers.getMapper(IPsikologMapper.class);
    Psikolog psikologOlustur(final PsikologSaveRequestDto dto);

}
