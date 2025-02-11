package com.springcore.practice.beans.dependencyinjection;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@ToString
@Component
public class Sunscreen{
    @Value("117")
    private int id;
    @Value("Deconstruct")
    private String brandName;
    @Value("50 Grams")
    private String netQuantity;
    @Value("314.99")
    private double price;
}
