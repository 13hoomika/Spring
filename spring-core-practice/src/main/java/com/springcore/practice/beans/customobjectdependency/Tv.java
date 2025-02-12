package com.springcore.practice.beans.customobjectdependency;

import com.springcore.practice.beans.customobjectdependency.has.Stand;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Component
public class Tv {
    @Value("Samsung")
    private String brand;

    @Value("55")
    private int screenSize;

    @Value("4K")
    private String resolution;

    @Value("Smart TV")
    private String type;

    @Autowired
    private Stand stand;
}
