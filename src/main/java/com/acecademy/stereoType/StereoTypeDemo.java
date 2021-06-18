package com.acecademy.stereoType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereoTypeDemo {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("stereotype.xml");
        Person person1 = context.getBean("p", Person.class);
        Person person2 = context.getBean("p", Person.class);
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

    }
}
