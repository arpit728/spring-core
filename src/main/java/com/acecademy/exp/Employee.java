package com.acecademy.exp;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Map;


@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private List<String> phones;

    private Map<String, String> courses;

    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Employee(List<String> phones, Map<String, String> courses) {
        this.phones = phones;
        this.courses = courses;
    }
}
