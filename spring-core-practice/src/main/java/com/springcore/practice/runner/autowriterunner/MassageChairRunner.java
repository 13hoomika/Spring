package com.springcore.practice.runner.autowriterunner;

import com.springcore.practice.beans.constructordependency.MassageChair;
import com.springcore.practice.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MassageChairRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        MassageChair massageChair = applicationContext.getBean(MassageChair.class);
        System.out.println(massageChair);
    }
}
