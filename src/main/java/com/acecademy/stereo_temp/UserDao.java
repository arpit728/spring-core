package com.acecademy.stereo_temp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@ToString
@Getter
@AllArgsConstructor
public class UserDao {

    private String dbUrl;
}
