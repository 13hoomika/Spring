package com.springcore.practice.runner.getbeans;

import com.springcore.practice.beans.objectcreation.CollegeBackPack;
import com.springcore.practice.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CollegeBackPackRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        CollegeBackPack collegeBackPack = applicationContext.getBean(CollegeBackPack.class);
        collegeBackPack.setId(5);
        collegeBackPack.setBrandName("Gear");
        collegeBackPack.setNoOfZip(5);
        collegeBackPack.setPrice(999.90);
        System.out.println(collegeBackPack);
    }
}
