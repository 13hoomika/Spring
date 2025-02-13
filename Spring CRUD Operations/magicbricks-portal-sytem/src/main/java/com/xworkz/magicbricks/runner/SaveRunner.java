package com.xworkz.magicbricks.runner;

import com.xworkz.magicbricks.configuration.SpringConfiguration;
import com.xworkz.magicbricks.dto.PropertyListDto;
import com.xworkz.magicbricks.service.PropertyListService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SaveRunner {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        PropertyListService productService = ac.getBean(PropertyListService.class);
        PropertyListDto dto = new PropertyListDto();
        dto.setPropertyType("PG");
        dto.setOwnerName("Ramesh");
        dto.setAddress("123 dore, 43rd cross, rajajinagar 5th bloch,");
        dto.setPrice(6000.00);
        productService.ValidateAndSAve(dto);
    }
}
