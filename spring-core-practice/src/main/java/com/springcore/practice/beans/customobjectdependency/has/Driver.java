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
public class Driver {
    @Value("D200")
    private String driverId;

    @Value("Kishan")
    private String name;

    @Value("Ola EV")
    private String car;

    @Value("4.8")
    private double rating;
}
