package com.recipe.WhatToCook.controllers;

import com.recipe.WhatToCook.DTO.UserDTO;
import com.recipe.WhatToCook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    public UserService userService;
    @GetMapping("/userDetail/{name}")
    public ResponseEntity<UserDTO> displayUserDetail(@PathVariable String name) {

        return ResponseEntity.ok(userService.getUser(name));
    }
    @GetMapping("/allUser")
    public ResponseEntity<List<UserDTO>> displayAllUser() {
        return ResponseEntity.ok(userService.getAllUser());
    }
}
