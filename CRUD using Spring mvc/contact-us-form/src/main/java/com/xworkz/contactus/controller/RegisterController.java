package com.xworkz.contactus.controller;

import com.xworkz.contactus.dto.ContactDto;
import com.xworkz.contactus.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/")
@Component

public class RegisterController {
    @Autowired
    ContactService service;

    public RegisterController() {
        System.out.println("RegisterController obj is created");
    }

    //RequestMappingHandlerMapping
    @RequestMapping("contact")
    public String addRequest(ContactDto dto, Model model){
        service.processAndSave(dto);
        model.addAttribute("contactEmail", dto.getEmail());
        return "response.jsp";
    }

    @RequestMapping("/getContact-requests")
    public String getRequests(Model model){
        List<ContactDto> dtoList = service.getAllRequests();
            model.addAttribute("requestsList", dtoList);
            return "getContact-requests.jsp";
    }



}
