package com.recipe.WhatToCook.Modal;

import lombok.*;
import org.springframework.boot.env.SpringApplicationJsonEnvironmentPostProcessor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Time {
    private String cook;
    private String prep;
    private String prepToCook;
}
