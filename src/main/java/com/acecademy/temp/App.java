package com.acecademy.temp;

import com.acecademy.xmlfree.Fruit;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("resource-abc.xml");
        context.registerShutdownHook();

        Student student = context.getBean("student", Student.class);
        Fruit f1 = context.getBean("fruit", Fruit.class);
        Fruit f2 = context.getBean("fruit", Fruit.class);
        System.out.println(f1.hashCode());
        System.out.println(f2.hashCode());
        System.out.println(student);
    }
}
