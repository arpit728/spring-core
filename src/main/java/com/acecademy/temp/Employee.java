package com.acecademy.temp;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@ToString
//@AllArgsConstructor
public class Employee {

    @Autowired
    @Qualifier("address2")
    private Address address;
}
