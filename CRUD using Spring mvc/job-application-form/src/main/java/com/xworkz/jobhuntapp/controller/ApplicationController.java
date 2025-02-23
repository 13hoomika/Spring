package com.xworkz.jobhuntapp.controller;

import com.xworkz.jobhuntapp.dto.ApplicationDto;
import com.xworkz.jobhuntapp.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Component

public class ApplicationController {
    @Autowired
    ApplicationService service;

    public ApplicationController() {
        System.out.println("ApplicationController obj is created");
    }

    //RequestMappingHandlerMapping
    @RequestMapping("allApplication")
    public String addResponse(ApplicationDto dto, Model model){
        service.ValidateAndStore(dto);
        model.addAttribute("pos", dto.getPosition());
        return "response.jsp";
    }
}
