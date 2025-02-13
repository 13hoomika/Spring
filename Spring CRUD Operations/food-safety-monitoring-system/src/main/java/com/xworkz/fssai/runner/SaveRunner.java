package com.xworkz.fssai.runner;

import com.xworkz.fssai.configuration.SpringConfiguration;
import com.xworkz.fssai.dto.FoodCertificationDto;
import com.xworkz.fssai.service.FoodCertificationService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SaveRunner {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        FoodCertificationService productService = ac.getBean(FoodCertificationService.class);
        FoodCertificationDto dto = new FoodCertificationDto();
        dto.setFoodBusinessId(1001);
        dto.setFoodBusinessName("Gurudath Foods");
        dto.setIssueDate("13th Feb 2025");
        productService.ValidateAndSAve(dto);
    }
}
