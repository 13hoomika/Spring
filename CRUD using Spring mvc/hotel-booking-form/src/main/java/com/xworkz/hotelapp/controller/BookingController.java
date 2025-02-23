package com.xworkz.hotelapp.controller;

import com.xworkz.hotelapp.dto.BookingDto;
import com.xworkz.hotelapp.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Component

public class BookingController {
    @Autowired
    BookingService service;

    public BookingController() {
        System.out.println("BookingController obj is created");
    }

    //RequestMappingHandlerMapping
    @RequestMapping("allBookings")
    public String addBooking(BookingDto dto, Model model){
        service.ValidateAndSave(dto);
        model.addAttribute("emailId", dto.getEmail());
        return "response.jsp";
    }
}
