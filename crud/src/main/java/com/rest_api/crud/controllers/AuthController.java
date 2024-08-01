package com.rest_api.crud.controllers;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.rest_api.crud.model.UserModel;

public class AuthController {
    @GetMapping("/register-user")
    public String createUser(
        @ModelAttribute("user")
        UserModel
    )
}
