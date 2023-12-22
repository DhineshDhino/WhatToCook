package com.recipe.WhatToCook.controllers;
import com.recipe.WhatToCook.DTO.RecipeDTO;
import com.recipe.WhatToCook.exception.RecipeNotFoundException;
import com.recipe.WhatToCook.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecipeController {
    @Autowired
    RecipeService service;

    @GetMapping(path = "/recipe/{name}" , consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getRecipe(@PathVariable String name) {
        RecipeDTO recipeDTO = null;
        try {
            recipeDTO = service.getRecipe(name);
        } catch (RecipeNotFoundException e) {
            return ResponseEntity.status(404).body("Recipe not found");
        }
        return ResponseEntity.ok(recipeDTO);
    }
    @PostMapping(path = "/recipe", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RecipeDTO> saveRecipe(RecipeDTO recipeDTO) {
        RecipeDTO recipe = service.saveRecipe(recipeDTO);
        return ResponseEntity.ok(recipe);
    }


    @GetMapping(path = "/Allrecipe",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<RecipeDTO>> getAllRecipes() {
        List<RecipeDTO> recipes = service.getAllRecipes();
        return ResponseEntity.ok(recipes);
    }

}

