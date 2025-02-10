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
public class Toaster {
    @Value("119")
    private int id;
    @Value("Philips")
    private String brandName;
    @Value("2630.00")
    private double price;
}
