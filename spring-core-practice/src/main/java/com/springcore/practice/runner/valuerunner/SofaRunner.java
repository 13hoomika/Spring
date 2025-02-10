package com.springcore.practice.runner.valuerunner;

import com.springcore.practice.beans.fielddependency.Sofa;
import com.springcore.practice.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SofaRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Sofa sofa = applicationContext.getBean(Sofa.class);

        System.out.println(sofa);
    }
}
