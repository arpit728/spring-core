package com.acecademy.exp;

import lombok.ToString;

@ToString
public class Address {

    private String city;
    private int postalCode;

    public Address() {
        System.out.println("Address: No Arg Constructor");
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public Address(String city, String postalCode) {
        System.out.println("Constructor : String, String");
        this.city = city;
//        this.postalCode = Integer.parseInt(postalCode);
    }

    public Address(String city, int postalCode) {
        System.out.println("Constructor : String, int");
        this.city = city;
        this.postalCode = postalCode;
    }

}
