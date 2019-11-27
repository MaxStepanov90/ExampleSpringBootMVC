package com.stepanov.controllers;

import com.stepanov.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class UserController {

        @Autowired
        private UsersRepository usersRepository;

        @GetMapping("/users")
        public String getUsersPage(Model model) {
            model.addAttribute("usersFromServer", usersRepository.findAll());
            return "users";
        }
    }

