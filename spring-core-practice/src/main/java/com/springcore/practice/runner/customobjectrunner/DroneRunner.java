package com.springcore.practice.runner.customobjectrunner;

import com.springcore.practice.beans.customobjectdependency.Drone;
import com.springcore.practice.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DroneRunner {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Drone drone = ac.getBean(Drone.class);
        System.out.println(drone);
    }
}
