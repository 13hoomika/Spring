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
public class MassageChair {
    private int id;
    private String brandName;
    private String color;
    private String materials;
    private double price;

    @Autowired
    public MassageChair(@Value("107") int id, @Value("RoboTouch") String brandName, @Value("Brown") String color, @Value("Faux Leather") String materials, @Value("118000.00") double price){
        this.id = id;
        this.brandName = brandName;
        this.color = color;
        this.materials = materials;
        this.price = price;
    }

}
