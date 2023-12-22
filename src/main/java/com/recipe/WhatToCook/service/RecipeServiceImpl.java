package com.recipe.WhatToCook.service;

import com.recipe.WhatToCook.DTO.RecipeDTO;
import com.recipe.WhatToCook.Modal.Time;
import com.recipe.WhatToCook.Repository.RecipeRepository;
import com.recipe.WhatToCook.entity.RecipeEntity;
import com.recipe.WhatToCook.exception.RecipeNotFoundException;
import com.recipe.WhatToCook.mapper.RecipeEntityMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
@Slf4j
public class RecipeServiceImpl implements RecipeService {
@Autowired
public RecipeRepository recipeRepository;
@Autowired
RecipeEntityMapper mapper;
    public RecipeDTO getRecipe(String name) throws RecipeNotFoundException {
        RecipeEntity recipe=recipeRepository.findByName(name);
        if(recipe==null){
            throw new RecipeNotFoundException(name);
        }
        return mapper.toDto(recipe);
    }
    public RecipeDTO saveRecipe(RecipeDTO recipeDTO){
        RecipeEntity recipeEntity=mapper.toEntity(recipeDTO);
        RecipeEntity savedRecipe=recipeRepository.save(recipeEntity);
        return mapper.toDto(savedRecipe);
    }
    public RecipeDTO updateRecipe(RecipeDTO recipeDTO){
        RecipeEntity recipeEntity= recipeRepository.findByName(recipeDTO.getName());
        RecipeEntity ToBeUpdatedEntity=RecipeEntity.builder()._id(recipeEntity.get_id()).name(recipeDTO.getName()).variant(recipeDTO.getVariant()).owner(recipeDTO.getOwner()).ingredients(recipeDTO.getIngredients()).ratios((HashMap<String, Integer>) recipeDTO.getRatios()).preparation(recipeDTO.getPreparation()).process(recipeDTO.getProcess()).garnish(recipeDTO.getGarnish()).accompany(recipeDTO.getAccompany()).time((Time) recipeDTO.getTime()).build();
        RecipeEntity updatedRecipe =recipeRepository.save(ToBeUpdatedEntity);
        return mapper.toDto(updatedRecipe);
    }

    public List<RecipeDTO> getAllRecipes(){
        List<RecipeEntity> all=recipeRepository.findAll();
        return all.stream().map(recipe -> mapper.toDto(recipe)).toList();
    }
}
