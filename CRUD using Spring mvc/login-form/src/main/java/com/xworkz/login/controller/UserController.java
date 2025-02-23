package com.xworkz.login.controller;

import com.xworkz.login.dto.UserDto;
import com.xworkz.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Component

public class UserController {
    @Autowired
    UserService service;

    public UserController() {
        System.out.println("UserController obj is created");
    }

    //RequestMappingHandlerMapping
    @RequestMapping("login")
    public String addResponse(UserDto dto, Model model){
        service.validateAndSave(dto);
        model.addAttribute("uName", dto.getUserName());
        return "response.jsp";
    }
}
