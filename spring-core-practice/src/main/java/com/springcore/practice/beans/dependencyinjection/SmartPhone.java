package com.springcore.practice.beans.dependencyinjection;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@ToString
@Component
public class SmartPhone {
    @Value("114")
    private int id;
    @Value("Samsung")
    private String brand;
    @Value("5678.99")
    private double price;
}
