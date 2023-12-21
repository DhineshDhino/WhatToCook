package com.recipe.WhatToCook.service;

import com.recipe.WhatToCook.DTO.RecipeDTO;
import com.recipe.WhatToCook.exception.RecipeNotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface RecipeService {

    RecipeDTO saveRecipe(RecipeDTO recipeDTO);
    RecipeDTO getRecipe(String name) throws RecipeNotFoundException;
    RecipeDTO updateRecipe(RecipeDTO recipeDTO);
}
