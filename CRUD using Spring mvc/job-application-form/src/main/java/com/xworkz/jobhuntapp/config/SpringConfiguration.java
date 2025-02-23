package com.xworkz.jobhuntapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.jobhuntapp")
public class SpringConfiguration {
    public SpringConfiguration() {
        System.out.println("SpringConfiguration obj created");
    }
}
