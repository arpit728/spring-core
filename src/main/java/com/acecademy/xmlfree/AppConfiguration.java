package com.acecademy.xmlfree;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfiguration {


    @Bean("fruit")
    @Scope("prototype")
    Fruit getFruit() {
        System.out.println("Get fruit invoked");
        return new Fruit("Orange");
    }
}
