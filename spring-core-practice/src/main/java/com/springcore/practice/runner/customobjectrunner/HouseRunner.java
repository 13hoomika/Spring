package com.springcore.practice.runner.customobjectrunner;

import com.springcore.practice.beans.customobjectdependency.House;
import com.springcore.practice.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HouseRunner {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        House bean = ac.getBean(House.class);
        System.out.println(bean);
    }
}
