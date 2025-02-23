package com.xworkz.passportseva.controller;


import com.xworkz.passportseva.dto.PassportRegDto;
import com.xworkz.passportseva.service.PassportRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Component

public class PassportController {
    @Autowired
    PassportRegService service;

    public PassportController() {
        System.out.println("PassportController obj is created");
    }

    //RequestMappingHandlerMapping
    @RequestMapping("applyPassport")
    public String addPassports(PassportRegDto dto, Model model){
        service.validateAndSave(dto);
        model.addAttribute("name", dto.getApplicantName());
        return "response.jsp";
    }
}
