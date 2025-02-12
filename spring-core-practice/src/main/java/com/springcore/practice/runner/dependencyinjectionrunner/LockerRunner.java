package com.springcore.practice.runner.dependencyinjectionrunner;

import com.springcore.practice.beans.dependencyinjection.Locker;
import com.springcore.practice.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LockerRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Locker locker = applicationContext.getBean(Locker.class);

        System.out.println(locker);
    }
}
