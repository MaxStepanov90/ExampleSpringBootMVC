package com.stepanov.controllers;

import com.stepanov.models.User;
import com.stepanov.security.details.UserDetailsImpl;
import com.stepanov.transfer.UserDto;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {

    @GetMapping("/")
    public String getProfilePage(ModelMap modelMap, Authentication authentication){
        if (authentication == null){
            return "redirect:/login";
        }
//        Получаем данные пользователя из сессии
        UserDetailsImpl details = (UserDetailsImpl)authentication.getPrincipal();
        UserDto user = UserDto.from(details.getUser());
        modelMap.addAttribute("user",user);
        return "profile";
    }
}
