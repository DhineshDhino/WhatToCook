package com.recipe.WhatToCook.Modal;

import lombok.*;
import org.springframework.boot.env.SpringApplicationJsonEnvironmentPostProcessor;

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
