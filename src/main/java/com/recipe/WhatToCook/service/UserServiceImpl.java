package com.recipe.WhatToCook.service;

import com.recipe.WhatToCook.DTO.UserDTO;
import com.recipe.WhatToCook.Repository.UserRepository;
import com.recipe.WhatToCook.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
/*@Autowired
private UserEntityMapperImpl userEntityMapper;*/

    public UserDTO getUser(String name) {
        UserEntity byFirstName = userRepository.findByFirstName(name);
        return UserDTO.builder().firstName(byFirstName.getFirstName()).lastName(byFirstName.getLastName()).dateOfBirth(byFirstName.getDateOfBirth()).email(byFirstName.getEmail()).build();
    }
    public List<UserDTO> getAllUser () {
        List<UserEntity> all = userRepository.findAll();
        //return all.stream().map(user -> userEntityMapper.toDto(user)).toList();
        return all.stream().map(user -> UserDTO.builder().firstName(user.getFirstName()).lastName(user.getLastName()).dateOfBirth(user.getDateOfBirth()).email(user.getEmail()).build()).toList();
    }
}
