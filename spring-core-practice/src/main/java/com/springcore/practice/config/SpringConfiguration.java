package com.springcore.practice.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.practice") //std pkg name, we can give specific like beans pkg
// this anno let the spring container know where ever @Component/ look for @Components
// And create objects for all those classes by calling its default cons in order ot create obj
public class SpringConfiguration {

    public SpringConfiguration(){
        System.out.println("SpringConfiguration object is created");
    }

    // 2 ways to create Instance/Object
    // 1. in Class level @Component
    // 2. in config file @Bean
//    @Bean
//    public Stand getStand(){
//        Stand stand = new Stand();
//        return stand;
//    }
}
