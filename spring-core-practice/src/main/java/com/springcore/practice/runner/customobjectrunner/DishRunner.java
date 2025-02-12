package com.springcore.practice.runner.customobjectrunner;

import com.springcore.practice.beans.customobjectdependency.Dish;
import com.springcore.practice.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DishRunner {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Dish bean = ac.getBean(Dish.class);
        System.out.println(bean);
    }
}
