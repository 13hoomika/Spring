package com.springcore.practice.runner.autowriterunner;

import com.springcore.practice.beans.constructordependency.InstantFilms;
import com.springcore.practice.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InstantFilmsRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        InstantFilms instantFilms = applicationContext.getBean(InstantFilms.class);
        System.out.println(instantFilms);

    }
}
