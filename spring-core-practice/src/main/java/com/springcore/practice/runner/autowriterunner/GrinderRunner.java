package com.springcore.practice.runner.autowriterunner;

import com.springcore.practice.beans.constructordependency.Grinder;
import com.springcore.practice.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GrinderRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Grinder grinder = applicationContext.getBean(Grinder.class);
        System.out.println(grinder);
    }
}
