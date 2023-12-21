package com.recipe.WhatToCook.DTO;

import com.recipe.WhatToCook.Modal.RecipeIngredient;
import com.recipe.WhatToCook.Modal.Time;
import com.recipe.WhatToCook.entity.RecipeEntity;
import lombok.*;

import java.util.ArrayList;
import java.util.HashMap;
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
    private ArrayList<RecipeIngredient> ingredients;
    private Map<String, Integer> ratios;
    private String preparation;
    private String process;
    private List<String> garnish;
    private List<String>accompany;
    private Time time;
}
