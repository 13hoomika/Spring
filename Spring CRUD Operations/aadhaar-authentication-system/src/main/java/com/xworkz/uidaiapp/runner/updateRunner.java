package com.xworkz.uidaiapp.runner;

import com.xworkz.uidaiapp.configuration.SpringConfiguration;
import com.xworkz.uidaiapp.service.AadhaarAuthService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class updateRunner {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        AadhaarAuthService service = ac.getBean(AadhaarAuthService.class);
        System.out.println("----------------- Update Date of Birth By Id -----------------");
        service.updateDobById(2,"12/12/2003");

        System.out.println("----------------- Update Address By Id -----------------");
        service.updateAddressByName("Deepak","Bangalore");
    }
}
