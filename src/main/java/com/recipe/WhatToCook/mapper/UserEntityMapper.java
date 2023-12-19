package com.recipe.WhatToCook.mapper;
import com.recipe.WhatToCook.DTO.UserDTO;
import com.recipe.WhatToCook.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserEntityMapper {
    UserDTO toDto(UserEntity user);
    UserEntity toEntity(UserDTO dto);
}
