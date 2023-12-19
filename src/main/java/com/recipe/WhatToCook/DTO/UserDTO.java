package com.recipe.WhatToCook.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.mapstruct.Mapper;



@AllArgsConstructor
@Builder
@Setter
@Getter
public class UserDTO {
        @JsonProperty(value = "firstName")
        private String firstName;
        @JsonProperty(value = "lastName")
        private String lastName;
        @JsonProperty(value = "dateOfBirth")
        private String dateOfBirth;
        @JsonProperty(value = "email")
        private String email;
}
