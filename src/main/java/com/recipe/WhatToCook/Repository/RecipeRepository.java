package com.recipe.WhatToCook.Repository;

import com.recipe.WhatToCook.entity.RecipeEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepository extends MongoRepository<RecipeEntity, String> {

    RecipeEntity findByName(String name);
    List<RecipeEntity> findAll();
}
