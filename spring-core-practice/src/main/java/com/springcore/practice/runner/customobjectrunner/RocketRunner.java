package com.springcore.practice.runner.customobjectrunner;

import com.springcore.practice.beans.customobjectdependency.Rocket;
import com.springcore.practice.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RocketRunner {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Rocket rocket = ac.getBean(Rocket.class);
        System.out.println(rocket);
    }
}
