package com.springcore.practice.beans.constructordependency;

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
public class Earpods {
    private int id;
    private String brandName;
    private String type;
    private double price;

    @Autowired
    public Earpods(@Value("101") int id,@Value("boat") String brandName,@Value("in-ear") String type,@Value("999.00") double price){
        this.id = id;
        this.brandName = brandName;
        this.type = type;
        this.price = price;
    }
}
