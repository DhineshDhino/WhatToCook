package com.recipe.what2cook.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Time implements Serializable {
    private String cook;
    private String prep;
    private String prepToCook;
}
