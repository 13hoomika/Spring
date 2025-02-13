package com.xworkz.ecomapp.runner;

import com.xworkz.ecomapp.configuration.SpringConfiguration;
import com.xworkz.ecomapp.dto.ProductDto;
import com.xworkz.ecomapp.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SaveRunner {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        ProductService productService = ac.getBean(ProductService.class);
        ProductDto dto = new ProductDto();
        dto.setProductName("Tv");
        dto.setCategory("Electronics");
        dto.setStock(44);
        dto.setPrice(12000.99);
        productService.ValidateAndSAve(dto);
    }
}
