package com.springcore.practice.beans.customobjectdependency;
import com.springcore.practice.beans.customobjectdependency.has.CoolingSystem;
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
public class SmartFridge {
    @Value("Samsung")
    private String brand;

    @Value("350")
    private double capacityInLtr;

    @Value("A+")
    private String energyRating;

    @Value("Wi-Fi")
    private String connectivity;

    @Autowired
    private CoolingSystem coolingSystem;
}
