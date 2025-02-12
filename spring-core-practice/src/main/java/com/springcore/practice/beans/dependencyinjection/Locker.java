package com.springcore.practice.beans.dependencyinjection;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@ToString
@Component
public class Locker {
    @Value("112")
    private int id;
    @Value("Godrej Security Solutions")
    private String brandName;
    @Value("20399.69")
    private double price;
}
