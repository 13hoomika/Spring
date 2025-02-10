package com.springcore.practice.runner.autowriterunner;

import com.springcore.practice.beans.constructordependency.OfficeChair;
import com.springcore.practice.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OfficeChairRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        OfficeChair officeChair = applicationContext.getBean(OfficeChair.class);
        System.out.println(officeChair);
    }
}
