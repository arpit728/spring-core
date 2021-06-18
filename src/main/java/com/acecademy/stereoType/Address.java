package com.acecademy.stereoType;


import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@ToString
public class Address {

    @Value("Delhi")
    private String city;

    @Value("400064")
    private int postalCode;
}
