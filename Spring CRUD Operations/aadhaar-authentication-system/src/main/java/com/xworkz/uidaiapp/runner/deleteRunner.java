package com.xworkz.uidaiapp.runner;

import com.xworkz.uidaiapp.configuration.SpringConfiguration;
import com.xworkz.uidaiapp.service.AadhaarAuthService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class deleteRunner {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        AadhaarAuthService service = ac.getBean(AadhaarAuthService.class);
        service.deleteAadhaarById(1);
    }
}
