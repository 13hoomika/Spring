package com.springcore.practice.runner.valuerunner;

import com.springcore.practice.beans.fielddependency.WheyProtein;
import com.springcore.practice.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WheyProteinRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        WheyProtein wheyProtein = applicationContext.getBean(WheyProtein.class);
        System.out.println(wheyProtein);

    }
}
