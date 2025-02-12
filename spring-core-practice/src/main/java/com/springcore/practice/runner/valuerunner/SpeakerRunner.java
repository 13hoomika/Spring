package com.springcore.practice.runner.valuerunner;

import com.springcore.practice.beans.fielddependency.Speaker;
import com.springcore.practice.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpeakerRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Speaker speaker = applicationContext.getBean(Speaker.class);

        System.out.println(speaker);
    }
}
