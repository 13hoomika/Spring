package com.springcore.practice.beans.customobjectdependency;
import com.springcore.practice.beans.customobjectdependency.has.OxygenTank;
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
public class Spacesuit {
    @Value("Model-X")
    private String model;

    @Value("10")
    private double weight;

    @Value("Kevlar")
    private String material;

    @Value("-50 to 60")
    private String temperatureRange;

    @Autowired
    private OxygenTank oxygenTank;
}
