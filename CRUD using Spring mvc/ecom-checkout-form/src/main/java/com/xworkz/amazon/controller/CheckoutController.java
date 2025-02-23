package com.xworkz.amazon.controller;

import com.xworkz.amazon.dto.CheckoutDto;
import com.xworkz.amazon.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/")
@Component

public class CheckoutController {
    @Autowired
    CheckoutService service;

    public CheckoutController() {
        System.out.println("CheckoutController obj is created");
    }

    //RequestMappingHandlerMapping
    @RequestMapping("checkout")
    public String addCustomer(CheckoutDto dto, Model model){
        service.validateAndStore(dto);
        model.addAttribute("fName", dto.getFullName());
        return "response.jsp";
    }

}
