package com.xworkz.flipkart.controller;

import com.xworkz.flipkart.dto.SupportDto;
import com.xworkz.flipkart.service.SupportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/")
@Component

public class SupportController {
    @Autowired
    SupportService service;

    public SupportController() {
        System.out.println("SupportController obj is created");
    }

    //RequestMappingHandlerMapping
    @RequestMapping("support")
    public String addRequest(SupportDto dto, Model model){
        service.validateAndSave(dto);
        model.addAttribute("order", dto.getOrderId());
        return "response.jsp";
    }

    @RequestMapping("/getDetails")
    public String getRequests(Model model){
        List<SupportDto> dtoList = service.getAllRequests();
            model.addAttribute("requestsList", dtoList);
            return "getDetails.jsp";
    }



}
