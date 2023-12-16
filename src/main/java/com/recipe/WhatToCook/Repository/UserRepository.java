package com.recipe.WhatToCook.Repository;

import com.recipe.WhatToCook.entity.UserEntity;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<UserEntity, String> {
    UserEntity findByFirstName(String name);
    List<UserEntity> findAll();
}