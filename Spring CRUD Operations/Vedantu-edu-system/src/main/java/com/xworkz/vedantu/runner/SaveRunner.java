package com.xworkz.vedantu.runner;

import com.xworkz.vedantu.configuration.SpringConfiguration;
import com.xworkz.vedantu.dto.CourseEnrollmentDto;
import com.xworkz.vedantu.service.CourseEnrollmentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SaveRunner {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        CourseEnrollmentService productService = ac.getBean(CourseEnrollmentService.class);
        CourseEnrollmentDto dto = new CourseEnrollmentDto();
        dto.setStudentName("Arun Kumar");
        dto.setCourseName("Spring core");
        dto.setCourseStatus("no-started");
        dto.setEnrollmentDate("12/02/2025");
        productService.ValidateAndSAve(dto);
    }
}
