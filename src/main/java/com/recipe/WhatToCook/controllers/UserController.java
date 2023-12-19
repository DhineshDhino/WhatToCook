package com.recipe.WhatToCook.controllers;
import com.recipe.WhatToCook.DTO.UserDTO;
import com.recipe.WhatToCook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    public UserService userService;

    @GetMapping(path = "/userDetail/{name}", consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity displayUserDetail(@PathVariable String name) {
        UserDTO returnVal = userService.getUser(name);
        return ResponseEntity.ok(returnVal);
    }

    @GetMapping(path = "/allUser", produces = "application/json")
    public ResponseEntity<List<UserDTO>> displayAllUser() {
        return ResponseEntity.ok(userService.getAllUser());
    }

    @PostMapping("/users")
    public ResponseEntity<UserDTO> saveUser(@RequestBody UserDTO userDTO) {
        // Logic to save the user
        UserDTO savedUser = userService.addUser(userDTO);
        return ResponseEntity.ok(savedUser);
    }

}
