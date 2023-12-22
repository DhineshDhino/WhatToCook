package com.recipe.WhatToCook.Modal;

import lombok.*;


@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecipeIngredient{
    private String name;
    private String quantity;
    private String unit;
}
