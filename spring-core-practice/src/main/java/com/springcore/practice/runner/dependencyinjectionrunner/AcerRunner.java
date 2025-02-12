package com.springcore.practice.runner.dependencyinjectionrunner;

import com.springcore.practice.beans.dependencyinjection.Acer;
import com.springcore.practice.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AcerRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Acer acer = applicationContext.getBean(Acer.class);
        acer.setId(1);
        acer.setModel("Acer");
        acer.setPrice(64000.90);
        System.out.println(acer);

    }
}
