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
public class Product {
    @Value("10101")
    private int productId;

    @Value("Laptop")
    private String name;

    @Value("45500.09")
    private double price;

    @Value("Electronics")
    private String category;
}
