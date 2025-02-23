package com.xworkz.helthcareapp.controller;

import com.xworkz.helthcareapp.dto.PatientDto;
import com.xworkz.helthcareapp.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Component

public class PatientController {
    @Autowired
    PatientService service;

    public PatientController() {
        System.out.println("feedbackController obj is created");
    }

    //RequestMappingHandlerMapping
    @RequestMapping("healthCheck")
    public String addResponse(PatientDto dto, Model model){
        service.validateAndSave(dto);
        model.addAttribute("name", dto.getFullName());
        return "response.jsp";
    }
}
