package com.acecademy.temp;


import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class UserService {

    private String serviceHost;

    void initUserService() {
        System.out.println("Initializing user service");
    }

    void destroyUserService() {
        System.out.println("Destroying user service");
    }
}
