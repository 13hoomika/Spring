package com.xworkz.collegeapp.controller;

import com.xworkz.collegeapp.dto.RegisterDto;
import com.xworkz.collegeapp.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/")
@Component

public class RegisterController {
    @Autowired
    RegisterService regService;

    public RegisterController() {
        System.out.println("RegisterController obj is created");
    }

    //RequestMappingHandlerMapping
    @RequestMapping("CollegeRegistration")
    public String addUser(RegisterDto dto, Model model){
        regService.validateAndSave(dto);
        model.addAttribute("fName", dto.getFullName());
        return "response.jsp";
    }

    @RequestMapping("getAllData")
    public String getAllUsers(Model model){
        List<RegisterDto> dtoList = regService.getAllData();
            model.addAttribute("ListOfRegistrations", dtoList);
            return "getAllData.jsp";
    }
//
//    @RequestMapping("getRegister")
//    public String getById(RegisterDto dto, Model model){
//        Object registerId = model.getAttribute("id");
//        regService.getById((Integer) registerId);
//        System.out.println(dto);
//        model.addAttribute("registrations",dto);
//        return "updateForm.jsp";
//    }
//
//    @RequestMapping("update")
//    public String updatesUsers(RegisterDto dto, Model model){
//        boolean isUpdated = regService.update(dto);
//        if (isUpdated){
//            model.addAttribute("updateMsg","Register details updated");
//
//        }else model.addAttribute("updateMsg","Register details could not be Updated.. try again later");
//            return "updateForm.jsp";
//    }
//
//    @RequestMapping("/delete")
//    public String deleteRegistration(Model model){
//        Object id = model.getAttribute("id");
//        regService.deleteById((Integer) id);
//        return "getAllData";
//    }


}
