package com.acecademy.lifecycle;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Pizza {

    private String name;

    void init() {
        System.out.println("Init Pizza");
    }
    void destroy(){
        System.out.println("Bye Bye!!");
    }
}
