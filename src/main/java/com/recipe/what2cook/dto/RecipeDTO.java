package com.recipe.what2cook.dto;

import com.recipe.what2cook.model.recipe.RecipeIngredient;
import com.recipe.what2cook.model.recipe.Time;
import lombok.*;

import java.util.List;
import java.util.Map;

@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
public class RecipeDTO {
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
