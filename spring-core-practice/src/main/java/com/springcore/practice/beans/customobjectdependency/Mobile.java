package com.springcore.practice.beans.customobjectdependency;

import com.springcore.practice.beans.customobjectdependency.has.SimCard;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Setter
@Getter
@NoArgsConstructor
@ToString
@Component
public class Mobile {
    @Value("Samsung Galaxy S21")
    private String brand;

    @Value("8")
    private int ramSize;

    @Value("128")
    private int storageCapacity;

    @Value("4500")
    private int batteryCapacity;

    @Autowired
    private SimCard simCard;
}
