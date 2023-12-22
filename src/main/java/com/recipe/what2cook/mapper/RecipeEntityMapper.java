package com.recipe.what2cook.mapper;

import com.recipe.what2cook.dto.RecipeDTO;
import com.recipe.what2cook.entity.RecipeEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RecipeEntityMapper {

    RecipeDTO toDto(RecipeEntity recipe);
    RecipeEntity toEntity(RecipeDTO dto);
}
