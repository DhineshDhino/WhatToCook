package com.recipe.what2cook.mapper;

import com.recipe.what2cook.dto.IngredientDTO;
import com.recipe.what2cook.entity.IngredientEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IngredientMapper {

    IngredientEntity toEntity(IngredientDTO dto);
    IngredientDTO toDto(IngredientEntity ingredient);
}
