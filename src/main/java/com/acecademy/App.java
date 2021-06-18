package com.acecademy;

import com.acecademy.si.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

/*        ApplicationContext context = new ClassPathXmlApplicationContext("config-temp.xml");
        Student student = (Student) context.getBean("student");
        Student student1 = (Student) context.getBean("student1");
        Student student2 = (Student) context.getBean("student2");
        System.out.println(student);
        System.out.println(student1);
        System.out.println(student2);

        Employee employee = (Employee) context.getBean("e1");
        Employee e1 = context.getBean("e1", Employee.class);
        System.out.println(e1);*/

        ApplicationContext context = new ClassPathXmlApplicationContext("config-reference-injection.xml");

        Employee e1 = context.getBean("e1", Employee.class);
        System.out.println(e1);

    }
}
