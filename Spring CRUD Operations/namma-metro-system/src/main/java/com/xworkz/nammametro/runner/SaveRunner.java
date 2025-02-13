package com.xworkz.nammametro.runner;

import com.xworkz.nammametro.configuration.SpringConfiguration;
import com.xworkz.nammametro.dto.MetroTicketDto;
import com.xworkz.nammametro.service.MetroTicketService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SaveRunner {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        MetroTicketService productService = ac.getBean(MetroTicketService.class);
        MetroTicketDto dto = new MetroTicketDto();
        dto.setPassengerName("Nikhil");
        dto.setFromStation("Mejastic");
        dto.setToStation("Deepanjali");
        dto.setFare(30);
        productService.ValidateAndSAve(dto);
    }

}
