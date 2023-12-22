package com.recipe.what2cook.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Document(collection = "user")
public class UserEntity {
    @Id
    @Field("_id")
    private String id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String email;

}
