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
public class Sofa {
    @Value("115")
    private int id;
    @Value("Majama")
    private String brandName;
    @Value("6899.00")
    private double price;
}
