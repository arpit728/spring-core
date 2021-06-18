package com.acecademy.stereoType;


import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_SINGLETON;

@Component("p")
@Scope(SCOPE_SINGLETON)
@ToString
//@AllArgsConstructor
public class Person {
    @Value("Bob")
    private String name;

    @Autowired
    private Address address;

    /*    public Person(@Value("Bob") String name) {
        this.name = name;
    }*/

    /*    @Autowired
    private Address address;*/
}
