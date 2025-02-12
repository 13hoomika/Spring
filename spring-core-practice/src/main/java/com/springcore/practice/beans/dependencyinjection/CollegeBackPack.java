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
public class CollegeBackPack {
    private int id;
    private int noOfZip;
    private String brandName;
    private double price;
}
