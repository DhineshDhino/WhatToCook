package com.recipe.WhatToCook.controllers;
import com.recipe.WhatToCook.DTO.RecipeDTO;
import com.recipe.WhatToCook.exception.RecipeNotFoundException;
import com.recipe.WhatToCook.service.RecipeService;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;

@AllArgsConstructor
@Builder
@Setter
@Getter
@EqualsAndHashCode
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
}

