package com.hybridnetwork.mappers;

import com.hybridnetwork.dto.ContaDTO;
import com.hybridnetwork.model.Conta;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ContaMapper {
    
    ContaMapper INSTANCE = Mappers.getMapper(ContaMapper.class);
    
    Conta toEntity(ContaDTO dto);
    ContaDTO toDto(Conta entity);
    
}
