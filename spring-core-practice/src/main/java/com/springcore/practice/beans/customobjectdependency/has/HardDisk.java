package com.springcore.practice.beans.customobjectdependency.has;

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
public class HardDisk {
    @Value("512")
    private int capacity;

    @Value("SSD")
    private String type;

    @Value("Samsung")
    private String brand;
}
