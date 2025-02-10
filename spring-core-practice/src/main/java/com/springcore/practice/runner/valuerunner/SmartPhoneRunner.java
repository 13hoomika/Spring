package com.springcore.practice.runner.valuerunner;

import com.springcore.practice.beans.fielddependency.SmartPhone;
import com.springcore.practice.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SmartPhoneRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        SmartPhone smartPhone = applicationContext.getBean(SmartPhone.class);

        System.out.println(smartPhone);

    }
}
