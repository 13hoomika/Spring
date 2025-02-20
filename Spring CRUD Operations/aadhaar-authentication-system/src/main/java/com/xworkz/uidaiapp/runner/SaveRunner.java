package com.xworkz.uidaiapp.runner;

import com.xworkz.uidaiapp.configuration.SpringConfiguration;
import com.xworkz.uidaiapp.dto.AadhaarAuthDto;
import com.xworkz.uidaiapp.service.AadhaarAuthService;
import javafx.util.Builder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SaveRunner {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        AadhaarAuthService productService = ac.getBean(AadhaarAuthService.class);
        AadhaarAuthDto dto = new AadhaarAuthDto();
//        dto.setAadhaarNumber(989756620134L);
//        dto.setName("Tharun");
//        dto.setDob("02/02/2008");
//        dto.setAddress("123 House Veteran, 5th block,Malleswaram");
//        productService.ValidateAndSAve(dto);

        AadhaarAuthDto dtoBuilder = AadhaarAuthDto.builder()
                .name("Deepak")
                .dob("24/04/2001")
                .aadhaarNumber(910945567890L)
                .address("Mandya")
                .build();
        productService.ValidateAndSAve(dtoBuilder);


    }
}
