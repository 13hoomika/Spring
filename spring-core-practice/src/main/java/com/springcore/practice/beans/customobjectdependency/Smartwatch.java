package com.springcore.practice.beans.customobjectdependency;

import com.springcore.practice.beans.customobjectdependency.has.Sensor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@ToString
@NoArgsConstructor
@Component
public class Smartwatch {
    @Value("Apple")
    private String brand;

    @Value("Series 7")
    private String model;

    @Value("18")
    private double batteryLife;

    @Value("Bluetooth")
    private String connectivity;

    @Autowired
    private Sensor sensor;
}
