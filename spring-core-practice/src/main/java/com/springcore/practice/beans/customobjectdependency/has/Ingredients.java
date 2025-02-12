package com.springcore.practice.beans.customobjectdependency.has;

import org.springframework.beans.factory.annotation.Value;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Component
public class Ingredients {
    @Value("Tomato")
    private String ingredientName;

    @Value("2")
    private double quantity;

    @Value("grams")
    private String unit;

    @Value("true")
    private boolean isOrganic;
}
