package com.springcore.practice.beans.dependencyinjection;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@ToString
@Component
public class OfficeChair {
    private int id;
    private String brandName;
    private String material;
    private double price;

    @Autowired
    public OfficeChair(@Value("108") int id, @Value("Green Soul") String brandName, @Value("Mesh") String material, @Value("5699.98") double price){
        this.id = id;
        this.brandName = brandName;
        this.material = material;
        this.price = price;
    }
}
