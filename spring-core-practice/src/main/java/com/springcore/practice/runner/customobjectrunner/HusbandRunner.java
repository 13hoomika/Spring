package com.springcore.practice.runner.customobjectrunner;

import com.springcore.practice.beans.customobjectdependency.House;
import com.springcore.practice.beans.customobjectdependency.Husband;
import com.springcore.practice.config.SpringConfiguration;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HusbandRunner {
    public static void main(String[] args) {
        BeanFactory bf = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Husband bean = bf.getBean(Husband.class);
        System.out.println(bean);
    }
}
