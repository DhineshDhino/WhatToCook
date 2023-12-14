package com.recipe.WhatToCook.DTO;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
        private String firstName;
        private String lastName;
        private String dateOfBirth;
        private String email;
}
