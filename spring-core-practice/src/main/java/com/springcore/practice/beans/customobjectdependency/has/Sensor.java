package com.springcore.practice.beans.customobjectdependency.has;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Component
public class Sensor {
    @Value("Temperature")
    private String type;

    @Value("0.5")
    private double powerConsumption;

    @Value("100")
    private double range;
}
