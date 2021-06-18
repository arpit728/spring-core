package com.acecademy.si;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Employee {

    private String name;
    private List<String> phones;
    private Map<String, Integer> courses;

    private Properties properties;
    private Address address;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Map<String, Integer> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, Integer> courses) {
        this.courses = courses;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phones=" + phones +
                ", courses=" + courses +
                ", properties=" + properties +
                ", address=" + address +
                '}';
    }
}
