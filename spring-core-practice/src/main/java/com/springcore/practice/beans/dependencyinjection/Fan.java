package com.springcore.practice.beans.dependencyinjection;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
//@AllArgsConstructor
@NoArgsConstructor
@Component
@ToString
public class Fan {
    private int id;
    private String fanType;
    private String brandName;
    private String color;

    @Autowired
    public Fan(@Value("102") int id, @Value("Havells") String brandName, @Value("Table Stand") String fanType, @Value("White") String color){
        this.id = id;
        this.brandName = brandName;
        this.fanType = fanType;
        this.color = color;
    }
}
