package com.springcore.practice.runner.customobjectrunner;

import com.springcore.practice.beans.customobjectdependency.Aquarium;
import com.springcore.practice.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AquariumRunner {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Aquarium aquarium = ac.getBean(Aquarium.class);
        System.out.println(aquarium);

    }
}
