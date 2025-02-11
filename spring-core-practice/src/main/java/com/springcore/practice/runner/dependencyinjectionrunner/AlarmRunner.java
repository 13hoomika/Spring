package com.springcore.practice.runner.dependencyinjectionrunner;

import com.springcore.practice.beans.dependencyinjection.Alarm;
import com.springcore.practice.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AlarmRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Alarm alarm = applicationContext.getBean(Alarm.class);
        alarm.setId(2);
        alarm.setBrandName("WallClock");
        alarm.setPrice(2800.90);
        System.out.println(alarm);

    }
}
