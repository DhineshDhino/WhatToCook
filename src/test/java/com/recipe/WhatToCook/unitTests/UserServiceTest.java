package com.recipe.WhatToCook.unitTests;

import com.recipe.WhatToCook.DTO.UserDTO;
import com.recipe.WhatToCook.Repository.UserRepository;
import com.recipe.WhatToCook.entity.UserEntity;
import com.recipe.WhatToCook.exception.UserNotFoundException;
import com.recipe.WhatToCook.mapper.UserEntityMapper;
import com.recipe.WhatToCook.mapper.UserEntityMapperImpl;
import com.recipe.WhatToCook.service.UserService;
import com.recipe.WhatToCook.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class UserServiceTest {
    @Mock
    private UserRepository userRepository;
    @Mock
    private UserEntityMapperImpl userEntityMapper;
    @InjectMocks
    private UserServiceImpl userService;

    @Test
    public void testGetUser() throws UserNotFoundException {
        when(userRepository.findByFirstName("test")).thenReturn(UserEntity.builder().firstName("test").lastName("test").dateOfBirth("test").email("test").build());
        when(userEntityMapper.toDto(any())).thenReturn(UserDTO.builder().firstName("test").lastName("test").dateOfBirth("test").email("test").build());
assertEquals(UserDTO.builder().firstName("test").lastName("test").dateOfBirth("test").email("test").build(),userService.getUser("test"));
    }

    @Test
    public void testGetUserException() throws UserNotFoundException {
        when(userRepository.findByFirstName("test")).thenReturn(null);
        assertThrows(UserNotFoundException.class, () -> userService.getUser("test"));
    }
}
