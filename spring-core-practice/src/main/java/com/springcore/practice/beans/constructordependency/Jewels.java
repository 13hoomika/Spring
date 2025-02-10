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
public class Jewels {
    private int id;
    private String metalName;
    private double price;

    @Autowired
    public Jewels(@Value("106") int id, @Value("Silver") String metalName, @Value("4567.90") double price){
        this.id = id;
        this.metalName = metalName;
        this.price = price;
    }
}
