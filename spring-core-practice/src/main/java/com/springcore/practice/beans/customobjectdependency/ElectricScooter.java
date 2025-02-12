package com.springcore.practice.beans.customobjectdependency;
import com.springcore.practice.beans.customobjectdependency.has.Battery;
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
public class ElectricScooter {
    @Value("Xiaomi")
    private String brand;

    @Value("25")
    private double speedKmPerHr;

    @Value("40")
    private double rangeInKm;

    @Value("15")
    private double weightInKg;

    @Autowired
    private Battery battery;
}
