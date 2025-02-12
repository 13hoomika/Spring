package com.springcore.practice.beans.customobjectdependency;

import com.springcore.practice.beans.customobjectdependency.has.Controller;
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
public class PlayStation {
    @Value("PS 5")
    private String name;

    @Value("Sony")
    private String brand;

    @Value("5")
    private String generation;

    @Value("1")
    private int storageCapacity;

    @Autowired
    private Controller controller;
}
