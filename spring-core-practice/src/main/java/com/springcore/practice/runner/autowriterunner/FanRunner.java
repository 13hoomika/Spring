package com.springcore.practice.runner.autowriterunner;

import com.springcore.practice.beans.constructordependency.Fan;
import com.springcore.practice.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FanRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Fan fan = applicationContext.getBean(Fan.class);
        System.out.println(fan);
    }
}
