package com.recipe.what2cook.dto;

import com.recipe.what2cook.model.RecipeIngredient;
import com.recipe.what2cook.model.Time;
import lombok.*;

import java.util.List;
import java.util.Map;

@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
public class RecipeDTO {
    private String name;
    private String variant;
    private String owner;
    private List<RecipeIngredient> ingredients;
    private Map<String, Integer> ratios;
    private String preparation;
    private String process;
    private List<String> garnish;
    private List<String>accompany;
    private Time time;
}
