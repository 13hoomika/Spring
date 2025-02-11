package com.springcore.practice.beans.customobjectdependency.has;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Setter
@Getter
@NoArgsConstructor
@ToString
@Component
public class Camera {
    @Value("4K")
    private String resolution;

    @Value("Wide Angle")
    private String lensType;

    @Value("10")
    private double zoomLevel;

    @Value("Sony")
    private String brand;

    @Value("60")
    private double frameRate;
}
