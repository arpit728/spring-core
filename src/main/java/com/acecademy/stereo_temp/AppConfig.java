package com.acecademy.stereo_temp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan("com.acecademy.stereo_temp,com.acecademy.dummy")
public class AppConfig {

    @Bean("userDao")
    UserDao getUserDao() {
        return new UserDao("localhost:3306");
    }

    @Bean("us")
    @Scope("prototype")
    UserService getUserService(UserDao userDao) {
        return new UserService(userDao);
    }
}
