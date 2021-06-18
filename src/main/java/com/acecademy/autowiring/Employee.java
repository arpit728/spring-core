package com.acecademy.autowiring;


import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//@NoArgsConstructor
@ToString
//@AllArgsConstructor
public class Employee {

    @Autowired
    @Qualifier("address1")
    private Address address;

    //    public Employee(Address address) {
//        System.out.println("Calling constructor");
//        this.address = address;
//    }

//    @Autowired

    /*    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }*/
}
