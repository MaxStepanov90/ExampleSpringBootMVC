package com.stepanov.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
// Используем HttpServletRequest вместо @RequestParam(только со значениями)  потому что у параметра нет значения
    @GetMapping("/login")
    public String getLoginPage(Authentication authentication, ModelMap model, HttpServletRequest request){
        if (authentication!=null){
            return "redirect:/";
        }
        if (request.getParameterMap().containsKey("error")){
            model.addAttribute("error", true);
        }
        return "login";
    }
}
