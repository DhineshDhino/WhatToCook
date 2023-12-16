package com.recipe.WhatToCook.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter @Setter @NoArgsConstructor @Builder @AllArgsConstructor
@Document(collection = "user")
public class UserEntity {
    @Id
    private String _id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String email;

}
