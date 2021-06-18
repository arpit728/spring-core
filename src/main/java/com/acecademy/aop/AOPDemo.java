package com.acecademy.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOPDemo {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        PaymentService paymentService = context.getBean("paymentService", PaymentService.class);
        paymentService.makePayment();

        paymentService.makePayment(100);
    }
}
