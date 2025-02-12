package com.springcore.practice.beans.customobjectdependency;

import com.springcore.practice.beans.customobjectdependency.has.Ingredients;
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
public class Dish {
    @Value("2")
    private int dishId;

    @Value("Pasta")
    private String dishName;

    @Value("220.99")
    private double price;

    @Value("true")
    private boolean isVegetarian;

    @Autowired
    private Ingredients ingredients;

}
