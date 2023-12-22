package com.recipe.what2cook.repository;

import com.recipe.what2cook.entity.UserEntity;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<UserEntity,String> {
    UserEntity findByFirstName(String name);
    List<UserEntity> findAll();

}