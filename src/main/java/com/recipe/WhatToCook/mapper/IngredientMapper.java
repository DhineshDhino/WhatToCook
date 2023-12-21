package com.recipe.WhatToCook.mapper;

import com.recipe.WhatToCook.DTO.IngredientDTO;
import com.recipe.WhatToCook.entity.IngredientEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IngredientMapper {

    IngredientEntity toEntity(IngredientDTO dto);
    IngredientDTO toDto(IngredientEntity ingredient);
}
