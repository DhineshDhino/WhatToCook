package com.recipe.what2cook.model.recipe;

import lombok.*;


@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecipeIngredient{
    private String name;
    private String type;
    private String tamilName;
    private String tanglishName;
}
