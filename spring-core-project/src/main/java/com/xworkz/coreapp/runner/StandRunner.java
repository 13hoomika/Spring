package com.xworkz.coreapp.runner;

import com.xworkz.coreapp.beans.Stand;
import com.xworkz.coreapp.config.SpringConfiguration;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StandRunner {
    public static void main(String[] args)  {
        // Creating an application context using the Spring configuration class
//        ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        BeanFactory annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        // Retrieving a Stand bean from the Spring container
        // One of the main functionalities of ApplicationContext is to get a reference to a bean using getBean() method.
        Stand stand = annotationConfigApplicationContext.getBean(Stand.class);
        stand.toHold();

        // Setting values manually (commented out since values are already injected via @Value)
//        stand.setId(1);
//        stand.setBrandName("Usha");
//        stand.setPrice(359.89);
        System.out.println(stand);



    }
}
