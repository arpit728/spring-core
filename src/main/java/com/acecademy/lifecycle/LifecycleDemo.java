package com.acecademy.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleDemo {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config-lifecycle.xml");
        context.registerShutdownHook();
        Pizza p1 = context.getBean("p1", Pizza.class);
        System.out.println(p1);
        Burger b1 = context.getBean("b1", Burger.class);
        System.out.println(b1);


        Coke c1 = context.getBean("c1", Coke.class);
        System.out.println(c1);
    }
}
