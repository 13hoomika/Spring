package com.springcore.practice.runner.valuerunner;

import com.springcore.practice.beans.fielddependency.Tab;
import com.springcore.practice.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TabRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Tab tap = applicationContext.getBean(Tab.class);

        System.out.println(tap);
    }
}
