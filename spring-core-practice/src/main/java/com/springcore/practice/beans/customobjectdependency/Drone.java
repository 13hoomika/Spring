package com.springcore.practice.beans.customobjectdependency;

import com.springcore.practice.beans.customobjectdependency.has.Camera;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Setter
@Getter
@NoArgsConstructor
@ToString
@Component
public class Drone {
    @Value("DJI")
    private String brand;

    @Value("100")
    private double range;

    @Value("30")
    private double batteryLife;

    @Value("50")
    private double maxSpeed;

    @Autowired
    private Camera camera;
}
