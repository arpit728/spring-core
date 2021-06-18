package com.acecademy.lifecycle;

import lombok.AllArgsConstructor;
import lombok.ToString;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@AllArgsConstructor
@ToString
public class Coke {

    private String name;

    @PostConstruct
    void init() {
        System.out.println("Init Coke");
    }

    @PreDestroy
    void destroy() {
        System.out.println("Destroy Coke");
    }

}
