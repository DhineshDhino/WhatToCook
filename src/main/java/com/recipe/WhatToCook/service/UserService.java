package com.recipe.WhatToCook.service;

import com.recipe.WhatToCook.DTO.UserDTO;
import com.recipe.WhatToCook.entity.UserEntity;
import com.recipe.WhatToCook.exception.UserNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    UserDTO getUser(String name) throws UserNotFoundException;
    List<UserDTO> getAllUser();
    UserDTO addUser(UserDTO userDTO);

    UserDTO updateUser(UserDTO userDTO) throws UserNotFoundException;

}
