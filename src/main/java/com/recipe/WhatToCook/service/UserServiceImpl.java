package com.recipe.WhatToCook.service;

import com.recipe.WhatToCook.DTO.UserDTO;
import com.recipe.WhatToCook.Repository.UserRepository;
import com.recipe.WhatToCook.entity.UserEntity;
import com.recipe.WhatToCook.exception.UserNotFoundException;
import com.recipe.WhatToCook.mapper.UserEntityMapperImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
@Autowired
private UserEntityMapperImpl userEntityMapper;

    public UserDTO getUser(String name) throws UserNotFoundException {
        UserEntity byFirstName = userRepository.findByFirstName(name);
        if (byFirstName==null) {
            log.error("User not found with the given firstName " + name);
            throw new UserNotFoundException("User not found with the given firstName " + name);
        }
        return userEntityMapper.toDto(byFirstName);
    }

    public List<UserDTO> getAllUser() {
        List<UserEntity> all = userRepository.findAll();
        return all.stream().map(user -> userEntityMapper.toDto(user)).toList();
    }

    public UserDTO addUser(UserDTO userDTO) {
        UserEntity userEntity = userEntityMapper.toEntity(userDTO);
        UserEntity userEntity1 = userRepository.save(userEntity);
        return userEntity1 == null ? null : userEntityMapper.toDto(userEntity1);
    }

    public UserDTO updateUser(UserDTO userDTO) throws UserNotFoundException {
        UserEntity userEntityInDB = userRepository.findByFirstName(userDTO.getFirstName());
        if (userEntityInDB == null) {
            throw new UserNotFoundException("User not found with the given firstName " + userDTO.getFirstName());
        }
        UserEntity updatedUserEntity = UserEntity.builder()
                ._id(userEntityInDB.get_id())
                .firstName(userDTO.getFirstName())
                .lastName(userDTO.getLastName())
                .dateOfBirth(userDTO.getDateOfBirth())
                .email(userDTO.getEmail())
                .build();
        UserEntity savedUserEntity = userRepository.save(updatedUserEntity);
        return savedUserEntity == null ? null : userEntityMapper.toDto(savedUserEntity);
    }
}
