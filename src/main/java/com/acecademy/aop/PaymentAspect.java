package com.acecademy.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PaymentAspect {

    @Before("execution(* com.acecademy.aop.PaymentService.makePayment(..))")
    void beforePayment() {
        System.out.println("Before Payment");
    }

    @After("execution(* com.acecademy.aop.PaymentService.makePayment(..))")
    void afterPayment() {
        System.out.println("Payment has been processed");
    }

    @AfterReturning(value = "execution(* com.acecademy.aop.PaymentService.makePayment(..))", returning = "amt")
    void afterPaymentReturn(int amt) {
        System.out.println("After payment return " + amt);
    }

    @Around("execution(* com.acecademy.aop.PaymentService.makePayment(..))")
    int timer(ProceedingJoinPoint proceedingJoinPoint) {
        long start = System.nanoTime();
        Object res = null;
        try {
            res = proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        long duration = System.nanoTime() - start;

        System.out.printf("It took [%d] nanos to make the payment\n", duration);

        return (Integer) res;
    }

}
