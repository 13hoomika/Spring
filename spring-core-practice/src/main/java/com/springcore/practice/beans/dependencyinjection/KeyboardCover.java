package com.springcore.practice.beans.dependencyinjection;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
@ToString
public class KeyboardCover {
    @Value("111")
    private int id;
    @Value("Tukzer")
    private String brandName;
    @Value("282.89")
    private double price;
}
