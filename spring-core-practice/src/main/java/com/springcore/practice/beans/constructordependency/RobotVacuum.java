package com.springcore.practice.beans.constructordependency;

import lombok.AllArgsConstructor;
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
public class RobotVacuum {
    private int id;
    private String brandName;
    private String modelName;
    private double price;

    @Autowired
    public RobotVacuum(@Value("110") int id, @Value("ECOVACS") String brandName, @Value("DEEBOT Y1 PRO") String modelName, @Value("22990.50") double price){
        this.id = id;
        this.brandName = brandName;
        this.modelName = modelName;
        this.price = price;
    }
}
