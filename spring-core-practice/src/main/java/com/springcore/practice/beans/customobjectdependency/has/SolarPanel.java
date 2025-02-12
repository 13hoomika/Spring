package com.springcore.practice.beans.customobjectdependency.has;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@ToString
@NoArgsConstructor
@Setter
@Getter
public class SolarPanel {
    @Value("Silicon")
    private String material;

    @Value("1000")
    private double powerOutput;
}
