package com.oracle.test;

import com.oracle.pojo.User;
import com.oracle.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:config/bean.xml")
public class TestUser {

    @Autowired
    private UserService userService;

    @Test
    public void login()throws  Exception{

        User user = userService.login("王五", "123");
        System.out.println(user);
    }



}
