package com.acecademy.ci;

public class Address {
    private String city;
    private int postalCode;

    public Address(String city, int postalCode) {
        System.out.println("Calling string, int constructor");
        this.city = city;
        this.postalCode = postalCode;
    }

    public Address(String city, String postalCode) {
        System.out.println("Calling string, string constructor");
        this.city = city;
        this.postalCode = Integer.parseInt(postalCode);
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }
}
