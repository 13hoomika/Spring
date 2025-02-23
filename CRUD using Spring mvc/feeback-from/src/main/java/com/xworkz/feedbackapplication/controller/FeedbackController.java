package com.xworkz.feedbackapplication.controller;

import com.xworkz.feedbackapplication.dto.FeedbackDto;
import com.xworkz.feedbackapplication.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Component

public class FeedbackController {
    @Autowired
    FeedbackService service;

    public FeedbackController() {
        System.out.println("FeedbackController obj is created");
    }

    //RequestMappingHandlerMapping
    @RequestMapping("feedbackResponse")
    public String addResponse(FeedbackDto dto, Model model){
        service.validateAndSave(dto);
        model.addAttribute("fullName", dto.getName());
        return "response.jsp";
    }
}
