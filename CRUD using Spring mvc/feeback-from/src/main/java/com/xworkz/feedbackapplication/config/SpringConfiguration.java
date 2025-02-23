package com.xworkz.feedbackapplication.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.feedbackapplication")
public class SpringConfiguration {
    public SpringConfiguration() {
        System.out.println("SpringConfiguration obj created");
    }
}
