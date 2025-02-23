package com.xworkz.app.controller;

import com.xworkz.app.dto.MembersDto;
import com.xworkz.app.service.MembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Component

public class MemberController {
    @Autowired
    MembersService service;

    public MemberController() {
        System.out.println("MemberController obj is created");
    }

    //RequestMappingHandlerMapping
    @RequestMapping("applyMembership")
    public String addMembers(MembersDto dto, Model model){
        service.ValidateAndSave(dto);
        model.addAttribute("memberName", dto.getName());
        return "response.jsp";
    }
}
