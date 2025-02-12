package com.springcore.practice.beans.dependencyinjection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class CelloBottle {
    private int id;
    private String brandName;
    private String capacity;
    private double price;
}
