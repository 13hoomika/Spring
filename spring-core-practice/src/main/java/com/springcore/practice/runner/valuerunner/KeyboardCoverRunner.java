package com.springcore.practice.runner.valuerunner;

import com.springcore.practice.beans.constructordependency.Fan;
import com.springcore.practice.beans.fielddependency.KeyboardCover;
import com.springcore.practice.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class KeyboardCoverRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        KeyboardCover keyboardCover = applicationContext.getBean(KeyboardCover.class);
        System.out.println(keyboardCover);

    }
}
