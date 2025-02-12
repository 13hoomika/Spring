package com.springcore.practice.runner.customobjectrunner;

import com.springcore.practice.beans.customobjectdependency.Tv;
import com.springcore.practice.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TvRunner {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Tv tv = ac.getBean(Tv.class);
        System.out.println(tv);
    }
}
