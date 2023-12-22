package com.recipe.what2cook.entity;


import com.recipe.what2cook.model.RecipeIngredient;
import com.recipe.what2cook.model.Time;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;
import java.util.Map;

@Getter @Setter @NoArgsConstructor
@Builder @AllArgsConstructor
@Document(collection = "recipe")
public class RecipeEntity {
    @Id
    @Field("_id")
    private String id;
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
