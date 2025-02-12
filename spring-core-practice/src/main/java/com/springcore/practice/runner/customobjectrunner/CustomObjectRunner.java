package com.springcore.practice.runner.customobjectrunner;

import com.springcore.practice.beans.customobjectdependency.*;
import com.springcore.practice.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomObjectRunner {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        System.out.println("-------------------------------------------------------------------");
        PlayStation playStation = ac.getBean(PlayStation.class);
        System.out.println(playStation);

        System.out.println("-------------------------------------------------------------------");
        Spacesuit spacesuit = ac.getBean(Spacesuit.class);
        System.out.println(spacesuit);

        System.out.println("-------------------------------------------------------------------");
        Satellite satellite = ac.getBean(Satellite.class);
        System.out.println(satellite);

        System.out.println("-------------------------------------------------------------------");
        ElectricScooter electricScooter = ac.getBean(ElectricScooter.class);
        System.out.println(electricScooter);

        System.out.println("-------------------------------------------------------------------");
        SmartFridge smartFridge = ac.getBean(SmartFridge.class);
        System.out.println(smartFridge);

        System.out.println("-------------------------------------------------------------------");
        Order order = ac.getBean(Order.class);
        System.out.println(order);

        System.out.println("-------------------------------------------------------------------");
        Ride ride = ac.getBean(Ride.class);
        System.out.println(ride);

    }
}
