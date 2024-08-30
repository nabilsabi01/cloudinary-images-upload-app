package com.devart.cloudimages.mapper;

import com.devart.cloudimages.dto.ImageDTO;
import com.devart.cloudimages.model.Image;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ImageMapper {

    ImageDTO toDTO(Image image);

    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    Image toEntity(ImageDTO imageDTO);
}