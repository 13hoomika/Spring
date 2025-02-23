package com.xworkz.newsapp.controller;

import com.xworkz.newsapp.dto.SubscriberDto;
import com.xworkz.newsapp.service.SubscribersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Component
public class SubscribersController {
    @Autowired
    SubscribersService service;

    public SubscribersController() {
        System.out.println("SubscribersController obj is created");
    }

    //RequestMappingHandlerMapping
    @RequestMapping("subscribe")
    public String addSubscribe(SubscriberDto dto, Model model){
        service.ValidateAndSave(dto);
        model.addAttribute("name", dto.getFullName());
        return "response.jsp";
    }
}
