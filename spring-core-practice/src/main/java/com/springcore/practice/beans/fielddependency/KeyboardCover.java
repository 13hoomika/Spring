package com.springcore.practice.beans.fielddependency;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
@ToString
public class KeyboardCover {
    @Value("111")
    private int id;
    @Value("Tukzer")
    private String brandName;
    @Value("282.89")
    private double price;
}
