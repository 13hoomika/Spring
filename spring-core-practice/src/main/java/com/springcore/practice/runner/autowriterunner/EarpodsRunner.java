package com.springcore.practice.runner.autowriterunner;

import com.springcore.practice.beans.constructordependency.Earpods;
import com.springcore.practice.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EarpodsRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Earpods earpods = applicationContext.getBean(Earpods.class);
        System.out.println(earpods);
    }
}
