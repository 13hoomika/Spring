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
public class Address {
    @Value("Rajajinagar 1st block")
    private String street;

    @Value("Bangalore")
    private String city;

    @Value("Karnataka")
    private String state;

    @Value("560010")
    private String zipCode;
}
