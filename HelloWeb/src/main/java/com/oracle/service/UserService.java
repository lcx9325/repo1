package com.oracle.service;

import com.oracle.pojo.User;

public interface UserService {

    public User login(String uname, String password)throws Exception;


}
