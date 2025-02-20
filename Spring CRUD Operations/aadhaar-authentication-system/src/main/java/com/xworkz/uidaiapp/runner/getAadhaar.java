package com.xworkz.uidaiapp.runner;

import com.xworkz.uidaiapp.configuration.SpringConfiguration;
import com.xworkz.uidaiapp.service.AadhaarAuthService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class
getAadhaar {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        AadhaarAuthService acBean = ac.getBean(AadhaarAuthService.class);
        System.out.println("------------ Get All Aadhaar ------------");
        acBean.getAllAadhaar();

        System.out.println("------------ Get Aadhaar By id ------------");
        acBean.getAadhaarById(1);

        System.out.println("------------ Get Aadhaar By Name ------------");
        acBean.getAadhaarByName("Sanjay");

        System.out.println("------------ Get Aadhaar By Aadhaar Number ------------");
        acBean.getAadhaarByNumber(856956681425L);

    }
}
