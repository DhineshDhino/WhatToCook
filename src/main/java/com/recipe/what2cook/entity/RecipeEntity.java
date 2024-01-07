package com.recipe.what2cook.entity;


import com.recipe.what2cook.model.recipe.RecipeIngredient;
import com.recipe.what2cook.model.recipe.Time;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Getter @Setter @NoArgsConstructor
@Builder @AllArgsConstructor
@Document(collection = "recipe")
public class RecipeEntity {
    @Id
    @Field("_id")
    private String id;
    private String name;//name of the recipe
    private String variant;//like dry or gravy or steamed or fried
    private String owner;//who's recipe
    private List<RecipeIngredient> ingredients;
    private List<RecipeIngredient> secretIngredients;
    private List<RecipeIngredient> optionalIngredients;
    private String preparation;//if any prep is required before actual steps
    private String cookingSteps;
    private String importantCookingSteps;
    private List<RecipeIngredient> garnish;
    private List<String> accompany;//like chutney
    private Time time;
    private Integer servings;
    private String cuisine;
    private String suitsFor;
}
