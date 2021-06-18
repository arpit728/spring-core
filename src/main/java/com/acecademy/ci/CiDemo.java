package com.acecademy.ci;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CiDemo {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config-ci.xml");

        Address address = context.getBean("address", Address.class);
        Employee employee = context.getBean("e1", Employee.class);
        System.out.println(address);
        System.out.println(employee);
        context.registerShutdownHook();
    }
}
