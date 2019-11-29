package com.stepanov.controllers;

import com.stepanov.forms.UserForm;
import com.stepanov.services.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {

    @Autowired
    SignUpService service;

    @GetMapping("/signUp")
    public String getSignUpPage() {
        return "signUp";

    }

    @PostMapping("/signUp")
    public String signUp(UserForm userForm) {
        service.signUp(userForm);
        return "redirect:/login";
    }
}
