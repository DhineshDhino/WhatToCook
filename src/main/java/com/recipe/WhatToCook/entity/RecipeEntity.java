package com.recipe.WhatToCook.entity;


import com.recipe.WhatToCook.Modal.RecipeIngredient;
import com.recipe.WhatToCook.Modal.Time;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter @Setter @NoArgsConstructor
@Builder @AllArgsConstructor
@Document(collection = "recipe")
public class RecipeEntity {
    @Id
    private String _id;
    private String name;
    private String variant;
    private String owner;
    private List<RecipeIngredient> ingredients;
    private Map<String,Integer> ratios;
    private String preparation;
    private String process;
    private List<String> garnish;
    private List<String>accompany;
    private Time time;
}
