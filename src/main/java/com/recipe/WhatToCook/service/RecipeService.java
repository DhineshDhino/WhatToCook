package com.recipe.WhatToCook.service;

import com.recipe.WhatToCook.DTO.RecipeDTO;
import com.recipe.WhatToCook.entity.RecipeEntity;
import com.recipe.WhatToCook.exception.RecipeNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RecipeService {

    RecipeDTO saveRecipe(RecipeDTO recipeDTO);
    RecipeDTO getRecipe(String name) throws RecipeNotFoundException;
    RecipeDTO updateRecipe(RecipeDTO recipeDTO);

    List<RecipeDTO> getAllRecipes();
}
