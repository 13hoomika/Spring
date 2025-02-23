package com.xworkz.thonosevents.controller;


import com.xworkz.thonosevents.dto.EventDto;
import com.xworkz.thonosevents.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Component

public class EventsController {
    @Autowired
    EventService service;

    public EventsController() {
        System.out.println("EventsController obj is created");
    }

    //RequestMappingHandlerMapping
    @RequestMapping("addEvents")
    public String addDonation(EventDto dto, Model model){
        service.validateAndSave(dto);
        model.addAttribute("emailId", dto.getEmail());
        return "response.jsp";
    }
}
