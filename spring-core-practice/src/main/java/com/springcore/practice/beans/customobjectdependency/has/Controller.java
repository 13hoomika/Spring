package com.springcore.practice.beans.customobjectdependency.has;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Component
public class Controller {
    @Value("Wireless")
    private String type;

    @Value("true")
    private boolean wireless;

    @Value("12")
    private double batteryLife;
}
