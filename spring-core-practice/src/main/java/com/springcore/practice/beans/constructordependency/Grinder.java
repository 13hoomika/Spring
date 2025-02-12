package com.springcore.practice.beans.constructordependency;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class Grinder {
    private int id;
    private String brandName;
    private double price;
    private String capacity;

    @Autowired
    public Grinder(@Value("105") int id, @Value("Compact") String brandName, @Value("0.3 liters") String capacity, @Value("1799.00") double price){
        this.id = id;
        this.brandName = brandName;
        this.capacity = capacity;
        this.price = price;
    }
}
