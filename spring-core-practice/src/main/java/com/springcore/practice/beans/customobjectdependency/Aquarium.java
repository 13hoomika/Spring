package com.springcore.practice.beans.customobjectdependency;

import com.springcore.practice.beans.customobjectdependency.has.Fish;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@ToString
@NoArgsConstructor
@Setter
@Getter
public class Aquarium {
    @Value("200")
    private double size;

    @Value("Glass")
    private String material;

    @Value("Freshwater")
    private String waterType;

    @Value("25")
    private double temperature;

    @Autowired
    private Fish fish;
}
