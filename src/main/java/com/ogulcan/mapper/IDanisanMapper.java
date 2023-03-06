package com.ogulcan.mapper;

import com.ogulcan.dto.request.DanisanSaveRequestDto;
import com.ogulcan.dto.request.PsikologSaveRequestDto;
import com.ogulcan.repository.entity.Danisan;
import com.ogulcan.repository.entity.Psikolog;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IDanisanMapper {

    IDanisanMapper INSTANCE= Mappers.getMapper(IDanisanMapper.class);
    Danisan danisanOlustur(final DanisanSaveRequestDto dto);
}
