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
public class Locker {
    @Value("112")
    private int id;
    @Value("Godrej Security Solutions")
    private String brandName;
    @Value("20399.69")
    private double price;
}
