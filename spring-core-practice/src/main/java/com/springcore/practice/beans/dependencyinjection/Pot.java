package com.springcore.practice.beans.dependencyinjection;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@ToString
@Component
public class Pot {
    @Value("113")
    private int id;
    @Value("Stainless steel")
    private String materialType;
    @Value("Green")
    private String color;
    @Value("1.2  liters")
    private String capacity;
    @Value("9876.99")
    private double price;
}
