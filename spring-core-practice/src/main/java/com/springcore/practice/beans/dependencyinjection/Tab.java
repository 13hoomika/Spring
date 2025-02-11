package com.springcore.practice.beans.dependencyinjection;


import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@ToString
@Component
public class Tab {
    @Value("118")
    private int id;
    @Value("Samsung")
    private String brandName;
    @Value("32999.79")
    private double price;
    @Value("S9 5G")
    private String model;
}
