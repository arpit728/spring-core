package com.acecademy.lifecycle;

import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@AllArgsConstructor
@ToString
public class Burger implements DisposableBean, InitializingBean {

    private String name;

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying Burger");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Init Burger");
    }
}
