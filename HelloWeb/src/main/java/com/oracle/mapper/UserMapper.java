package com.oracle.mapper;

import com.oracle.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    public User login(@Param("uname") String uname, @Param("pwd") String password);


}
