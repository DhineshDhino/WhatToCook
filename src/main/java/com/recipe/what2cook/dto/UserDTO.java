package com.recipe.what2cook.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


@AllArgsConstructor
@Builder
@Setter
@Getter
@EqualsAndHashCode
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
