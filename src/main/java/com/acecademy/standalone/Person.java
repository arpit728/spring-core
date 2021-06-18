package com.acecademy.standalone;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@ToString
public class Person {
    private List<String> friends;
}
