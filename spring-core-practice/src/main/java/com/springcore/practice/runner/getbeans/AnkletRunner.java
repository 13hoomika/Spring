package com.springcore.practice.runner.getbeans;

import com.springcore.practice.beans.objectcreation.Anklet;
import com.springcore.practice.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnkletRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Anklet anklet = applicationContext.getBean(Anklet.class);
        anklet.setId(3);
        anklet.setMetalType("silver");
        anklet.setPrice(288.89);
        System.out.println(anklet);
    }
}
