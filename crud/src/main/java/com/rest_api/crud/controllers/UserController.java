package com.rest_api.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest_api.crud.entity.Users;
import com.rest_api.crud.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/users")
public class UserController {
    // @Autowired
    // private UserService userService;

    // @PostMapping("create-user")
    // public String createUser(@RequestBody Users user) {
    //     userService.createUser(user);
        
    //     return "user created successfully!";
    // }
    
}
