package com.springcore.practice.runner.valuerunner;

import com.springcore.practice.beans.fielddependency.Sunscreen;
import com.springcore.practice.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SunscreenRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Sunscreen sunscreen = applicationContext.getBean(Sunscreen.class);

        System.out.println(sunscreen);
    }
}
