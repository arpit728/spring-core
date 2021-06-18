package com.acecademy.stereo_temp;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserService {

    private UserDao userDao;

    void getUser() {
        System.out.println("Connecting to " + userDao.getDbUrl());
        System.out.println("Getting User");
    }

}
