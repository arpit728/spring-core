package com.acecademy.temp;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Map;
import java.util.Properties;


@ToString
@AllArgsConstructor
public class Student {
    private List<String> colors;
    private Map<String, Integer> courses;
    private Properties properties;
}
