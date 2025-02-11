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
public class InstantFilms {
    private int id;
    private String brand;
    private String filmColor;
    private String formatType;
    private double price;

    @Autowired
    public InstantFilms(@Value("106") int id, @Value("instax") String brand, @Value("color") String filmColor, @Value("Instax Mini") String formatType, @Value("1299.70") double price){
        this.id = id;
        this.brand = brand;
        this.filmColor = filmColor;
        this.formatType = formatType;
        this.price = price;
    }
}
