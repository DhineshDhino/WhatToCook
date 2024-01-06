package com.recipe.what2cook.mapper;
import com.recipe.what2cook.dto.UserDTO;
import com.recipe.what2cook.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserEntityMapper {
    UserDTO toDto(UserEntity user);
    UserEntity toEntity(UserDTO dto);
}
