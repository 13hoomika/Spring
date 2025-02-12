package com.springcore.practice.beans.customobjectdependency.has;

import org.springframework.beans.factory.annotation.Value;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Component
public class FuelTank {
    @Value("390")
    private double capacity;

    @Value("Liquid")
    private String type;

    @Value("50")
    private double weight;

}
