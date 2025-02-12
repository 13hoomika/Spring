package com.springcore.practice.beans.fielddependency;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@ToString
@Component
public class Speaker {
    @Value("116")
    private int id;
    @Value("Marshall")
    private String brandName;
    @Value("Bluetooth")
    private String frequencyResponse;
    @Value("60 Hz")
    private String connectivity ;
    @Value("13998.89")
    private double price;
}
