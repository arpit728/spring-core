package com.acecademy.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringDemo {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autoConfig.xml");
        Employee e = context.getBean("e", Employee.class);
        System.out.println(e);
    }
}
