package com.xworkz.upstox.runner;

import com.xworkz.upstox.configuration.SpringConfiguration;
import com.xworkz.upstox.dto.StockTradeDto;
import com.xworkz.upstox.service.StockTradeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SaveRunner {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        StockTradeService productService = ac.getBean(StockTradeService.class);
        StockTradeDto dto = new StockTradeDto();
        dto.setPrice(2.9);
        dto.setQuantity(200);
        dto.setStockSymbol("dollar");
        productService.ValidateAndSAve(dto);
    }
}
