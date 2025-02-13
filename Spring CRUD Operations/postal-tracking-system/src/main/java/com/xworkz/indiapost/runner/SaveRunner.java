package com.xworkz.indiapost.runner;

import com.xworkz.indiapost.configuration.SpringConfiguration;
import com.xworkz.indiapost.constants.DeliveryStatusEnum;
import com.xworkz.indiapost.dto.ParcelTrackingDto;
import com.xworkz.indiapost.service.ParcelTrackingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SaveRunner {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        ParcelTrackingService productService = ac.getBean(ParcelTrackingService.class);
        ParcelTrackingDto dto = new ParcelTrackingDto();
        dto.setSenderName("Bhoomika");
        dto.setReceiverName("Apoorva");
        dto.setCurrentLocation("near book store");
        dto.setDeliveryStatusEnum(DeliveryStatusEnum.OUT_FOR_DELIVERY);
        productService.ValidateAndSAve(dto);
    }
}
