package com.springcore.practice.runner.autowriterunner;

import com.springcore.practice.beans.constructordependency.Jewels;
import com.springcore.practice.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JewelsRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Jewels jewels = applicationContext.getBean(Jewels.class);
        System.out.println(jewels);

    }
}
