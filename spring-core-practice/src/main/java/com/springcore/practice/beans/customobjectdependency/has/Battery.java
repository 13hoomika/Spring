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
public class Battery {
    @Value("5000mAh")
    private String capacity;

    @Value("36V")
    private String voltage;

    @Value("4.30")
    private double chargeTimeInHr;

    @Value("3")
    private int lifespan;
}
