package com.springcore.practice.beans.fielddependency;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@ToString
@Component
public class WheyProtein {
    @Value("120")
    private int id;
    @Value("The Whole Truth")
    private String brandName;
    @Value("28.0")
    private double ServingsPerContainer;
    @Value("22990.00")
    private double price;
}
