package com.springcore.practice.runner.dependencyinjectionrunner;

import com.springcore.practice.beans.dependencyinjection.Purifier;
import com.springcore.practice.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PurifierRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Purifier purifier = applicationContext.getBean(Purifier.class);
        System.out.println(purifier);
    }


}
