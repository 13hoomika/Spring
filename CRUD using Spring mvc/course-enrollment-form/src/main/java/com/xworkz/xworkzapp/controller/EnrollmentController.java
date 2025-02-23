package com.xworkz.xworkzapp.controller;

import com.xworkz.xworkzapp.dto.EnrollmentDto;
import com.xworkz.xworkzapp.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/")
@Component
public class EnrollmentController {
    @Autowired
    EnrollmentService service;

    public EnrollmentController() {
        System.out.println("EnrollmentController object is created");
    }

    @RequestMapping("enrollments")
    public String addTrainee(EnrollmentDto dto, Model model){
        service.validateAndPersist(dto);
        model.addAttribute("name", dto.getName());
        return "response.jsp";
    }

    @RequestMapping("getEnrollments")
    public String getTrainee(EnrollmentDto dto, Model model){
        List<EnrollmentDto> allEnrollments = service.getAllEnrollments();
        model.addAttribute("enrollmentList", allEnrollments);
        return "getEnrollments.jsp";
    }

}
