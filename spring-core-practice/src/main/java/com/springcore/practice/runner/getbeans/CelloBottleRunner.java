package com.springcore.practice.runner.getbeans;

import com.springcore.practice.beans.objectcreation.CelloBottle;
import com.springcore.practice.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CelloBottleRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        CelloBottle celloBottle = applicationContext.getBean(CelloBottle.class);
        celloBottle.setId(4);
        celloBottle.setBrandName("Cello");
        celloBottle.setCapacity("710ml");
        celloBottle.setPrice(199.00);
        System.out.println(celloBottle);
    }
}
