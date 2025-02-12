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
public class Purifier {
    private int id;
    private String brandName;
    private boolean isInstalationIncluded;
    private double price;

    @Autowired
    public Purifier(@Value("109") int id, @Value("KENT") String brandName, @Value("true") boolean isInstalationIncluded, @Value("14999.50") double price){
        this.id = id;
        this.brandName = brandName;
        this.isInstalationIncluded = isInstalationIncluded;
        this.price = price;
    }
}
