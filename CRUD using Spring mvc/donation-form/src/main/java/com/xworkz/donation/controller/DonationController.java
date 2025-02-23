package com.xworkz.donation.controller;

import com.xworkz.donation.dto.DonationDto;
import com.xworkz.donation.service.DonationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/")
@Component

public class DonationController {
    @Autowired
    DonationService service;

    public DonationController() {
        System.out.println("DonationController obj is created");
    }

    //RequestMappingHandlerMapping
    @RequestMapping("donate")
    public String addDonation(DonationDto dto, Model model){
        service.validateAndSave(dto);
        model.addAttribute("donnerName", dto.getName());
        return "response.jsp";
    }

    @RequestMapping("allDonations")
    public String getDonations(Model model){
        List<DonationDto> dtoList = service.getAllDonations();
            model.addAttribute("listOfDonations", dtoList);
            return "allDonationsPage.jsp";
    }



}
