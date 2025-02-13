package com.xworkz.swiggy.runner;

import com.xworkz.swiggy.configuration.SpringConfiguration;
import com.xworkz.swiggy.dto.FoodOrderDto;
import com.xworkz.swiggy.service.FoodOrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SaveRunner {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        FoodOrderService productService = ac.getBean(FoodOrderService.class);
        FoodOrderDto dto = new FoodOrderDto();
        dto.setCustomerName("Bhoomika");
        dto.setRestaurantName("Khanavali");
        dto.setOrderStatus("delivered");
        productService.ValidateAndSAve(dto);
    }
}
