package com.springcore.practice.beans.customobjectdependency;

import com.springcore.practice.beans.customobjectdependency.has.Wife;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@NoArgsConstructor
@ToString
public class Husband {
    @Value("Dhananjaya")
    private String name;

    @Value("38")
    private int age;

    @Value("Actor")
    private String occupation;

    @Value("false")
    private boolean isMarried;

    @Autowired
    private Wife wife;
}
