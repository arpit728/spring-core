package com.acecademy.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandaloneDemo {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("standalone-config.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }
}
