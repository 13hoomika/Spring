package com.xworkz.agrostar.runner;

import com.xworkz.agrostar.configuration.SpringConfiguration;
import com.xworkz.agrostar.dto.CropOrderDto;
import com.xworkz.agrostar.service.CropOrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SaveRunner {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        CropOrderService productService = ac.getBean(CropOrderService.class);
        CropOrderDto dto = new CropOrderDto();
        dto.setFarmerId(9887);
        dto.setCropType("Wheat");
        dto.setQuantity(500.75);
        dto.setTotalAmount(25000.50);
        productService.ValidateAndSAve(dto);
    }
}
