package com.springcore.practice.beans.dependencyinjection;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@ToString
@Component
public class Toaster {
    @Value("119")
    private int id;
    @Value("Philips")
    private String brandName;
    @Value("2630.00")
    private double price;
}
