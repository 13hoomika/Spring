package com.springcore.practice.runner.valuerunner;

import com.springcore.practice.beans.fielddependency.Pot;
import com.springcore.practice.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PotRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Pot pot = applicationContext.getBean(Pot.class);
        System.out.println(pot);
    }
}
