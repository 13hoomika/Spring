package com.springcore.practice.runner.dependencyinjectionrunner;

import com.springcore.practice.beans.dependencyinjection.RobotVacuum;
import com.springcore.practice.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RobotVacuumRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        RobotVacuum robotVacuum = applicationContext.getBean(RobotVacuum.class);
        System.out.println(robotVacuum);
    }
}
