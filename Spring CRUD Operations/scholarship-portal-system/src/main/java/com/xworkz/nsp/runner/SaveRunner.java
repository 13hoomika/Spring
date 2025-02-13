package com.xworkz.nsp.runner;

import com.xworkz.nsp.configuration.SpringConfiguration;
import com.xworkz.nsp.dto.ScholarshipApplicationDto;
import com.xworkz.nsp.service.ScholarshipApplicationService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SaveRunner {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        ScholarshipApplicationService productService = ac.getBean(ScholarshipApplicationService.class);
        ScholarshipApplicationDto dto = new ScholarshipApplicationDto();
        dto.setStudentName("Yamuna");
        dto.setAmountRequested(5000);
        dto.setStatus("pending");
        productService.ValidateAndSAve(dto);
    }
}
