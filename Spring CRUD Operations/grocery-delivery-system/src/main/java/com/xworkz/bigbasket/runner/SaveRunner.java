package com.xworkz.bigbasket.runner;

import com.xworkz.bigbasket.configuration.SpringConfiguration;
import com.xworkz.bigbasket.dto.GroceryOrderDto;
import com.xworkz.bigbasket.service.GroceryOrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SaveRunner {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        GroceryOrderService productService = ac.getBean(GroceryOrderService.class);
        GroceryOrderDto dto = new GroceryOrderDto();
        dto.setCustomerId(111);
        dto.setTotalAmount(567.89);
        dto.setStatus("packed");
        productService.ValidateAndSAve(dto);
    }
}
