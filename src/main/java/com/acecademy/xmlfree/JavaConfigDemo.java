package com.acecademy.xmlfree;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemo {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        Fruit fruit = context.getBean("fruit", Fruit.class);
        Fruit fruit2 = context.getBean("fruit", Fruit.class);
        System.out.println(fruit);
    }
}
