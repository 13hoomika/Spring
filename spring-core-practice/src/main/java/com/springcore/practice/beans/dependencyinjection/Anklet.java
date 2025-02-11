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
public class Anklet {
    private int id;
    private String metalType;
    private double price;
}
