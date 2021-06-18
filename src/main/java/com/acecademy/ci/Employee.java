package com.acecademy.ci;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;

    private Address address;

    private List<String> phones = new ArrayList<>();

    public Employee(String name, Address address, List<String> phones) {
        this.name = name;
        this.address = address;
        this.phones = phones;
    }

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", phones=" + phones +
                '}';
    }
}
