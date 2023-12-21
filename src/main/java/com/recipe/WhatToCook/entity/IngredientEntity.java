package com.recipe.WhatToCook.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Document(collection = "ingredient")
public class IngredientEntity {
    @Id
    private String _id;
    private String name;
    private String alias;
}
