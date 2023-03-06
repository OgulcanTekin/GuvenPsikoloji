package com.ogulcan.mapper;

import com.ogulcan.dto.request.PsikologSaveRequestDto;
import com.ogulcan.dto.request.RandevuSaveRequestDto;
import com.ogulcan.repository.entity.Danisan;
import com.ogulcan.repository.entity.Randevu;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IRandevuMapper {

    IRandevuMapper INSTANCE= Mappers.getMapper(IRandevuMapper.class);
    Randevu randevuOlustur(final RandevuSaveRequestDto dto);
}
