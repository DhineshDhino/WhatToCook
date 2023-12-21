package com.recipe.WhatToCook.mapper;

import com.recipe.WhatToCook.DTO.RecipeDTO;
import com.recipe.WhatToCook.entity.RecipeEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RecipeEntityMapper {

    RecipeDTO toDto(RecipeEntity recipe);
    RecipeEntity toEntity(RecipeDTO dto);
}
