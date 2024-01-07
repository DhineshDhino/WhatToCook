package com.recipe.what2cook.service.recipe;

import com.recipe.what2cook.dto.RecipeDTO;
import com.recipe.what2cook.repository.RecipeRepository;
import com.recipe.what2cook.entity.RecipeEntity;
import com.recipe.what2cook.exception.RecipeNotFoundException;
import com.recipe.what2cook.mapper.RecipeEntityMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
@Slf4j
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;
    private final RecipeEntityMapper mapper;
@Autowired
public RecipeServiceImpl(RecipeRepository recipeRepository,RecipeEntityMapper recipeEntityMapper){
    this.recipeRepository=recipeRepository;
    this.mapper=recipeEntityMapper;
}

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
        RecipeEntity recipeEntity = recipeRepository.findByName(recipeDTO.getName());
        RecipeEntity toBeUpdatedEntity = mapper.toEntity(recipeDTO);
        toBeUpdatedEntity.setId(recipeEntity.getId());
        RecipeEntity updatedRecipe = recipeRepository.save(toBeUpdatedEntity);
        return mapper.toDto(updatedRecipe);
    }

    public List<RecipeDTO> getAllRecipes(){
        List<RecipeEntity> all=recipeRepository.findAll();
        return all.stream().map(recipe -> mapper.toDto(recipe)).toList();
    }
}
