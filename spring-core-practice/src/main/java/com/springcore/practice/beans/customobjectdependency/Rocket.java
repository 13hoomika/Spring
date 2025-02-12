package com.springcore.practice.beans.customobjectdependency;

import com.springcore.practice.beans.customobjectdependency.has.FuelTank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Component
public class Rocket {
    @Value("Mangalyaan")
    private String name;

    @Value("1340")
    private double weight;

    @Value("31.3")
    private double speed;

    @Value("Mars")
    private String destination;

    @Autowired
    private FuelTank fuelTank;

}
