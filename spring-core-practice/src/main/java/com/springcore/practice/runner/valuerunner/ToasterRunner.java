package com.springcore.practice.runner.valuerunner;

import com.springcore.practice.beans.fielddependency.Toaster;
import com.springcore.practice.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ToasterRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Toaster toaster = applicationContext.getBean(Toaster.class);

        System.out.println(toaster);
    }
}
