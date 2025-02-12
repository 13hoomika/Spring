package com.springcore.practice.runner.dependencyinjectionrunner;

import com.springcore.practice.beans.dependencyinjection.FujifilmCamera;
import com.springcore.practice.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FujifilmCameraRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        FujifilmCamera fujifilmCamera = applicationContext.getBean(FujifilmCamera.class);
        System.out.println(fujifilmCamera);

    }
}
