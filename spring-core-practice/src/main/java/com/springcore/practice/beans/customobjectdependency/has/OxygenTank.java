package com.springcore.practice.beans.customobjectdependency.has;

import org.springframework.beans.factory.annotation.Value;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@ToString
@NoArgsConstructor
@Setter
@Getter
public class OxygenTank {
    @Value("Aluminum")
    private String material;

    @Value("A+")
    private String safetyRating;
}
