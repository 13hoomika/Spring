package com.springcore.practice.beans.customobjectdependency;

import com.springcore.practice.beans.customobjectdependency.has.HardDisk;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Component
public class Laptop {
    @Value("Dell Inspiron")
    private String brand;

    @Value("16")
    private int ramSize;

    @Value("Intel Core i7")
    private String processor;

    @Value("15.6")
    private double screenSize;

    @Autowired
    private HardDisk hardDisk;
}
