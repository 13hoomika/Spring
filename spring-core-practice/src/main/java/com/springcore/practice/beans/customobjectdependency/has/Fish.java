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
public class Fish {
    @Value("Goldfish")
    private String species;

    @Value("Gold")
    private String color;

    @Value("10")
    private double size;

    @Value("5")
    private int lifespan;
}
