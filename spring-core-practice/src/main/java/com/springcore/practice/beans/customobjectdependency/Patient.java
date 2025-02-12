package com.springcore.practice.beans.customobjectdependency;

import com.springcore.practice.beans.customobjectdependency.has.Address;
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
public class Patient {
    @Value("Anuj")
    private String name;

    @Value("35")
    private int age;

    @Value("Male")
    private String gender;

    @Value("Flu")
    private String diagnosis;

    @Autowired
    private Address address;
}
