package com.springcore.practice.beans.constructordependency;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
//@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class FujifilmCamera {
    private int id;
    private String specialFeature;
    private String weight;
    private double price;

    @Autowired
    public FujifilmCamera(@Value("103") int id, @Value("Compact") String specialFeature, @Value("308 Grams") String weight, @Value("6999.69") double price){
        this.id = id;
        this.specialFeature = specialFeature;
        this.weight = weight;
        this.price = price;
    }
}
