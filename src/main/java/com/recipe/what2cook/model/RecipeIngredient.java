package com.recipe.what2cook.model;

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
