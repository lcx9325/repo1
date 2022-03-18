package com.oracle.controller;

import com.oracle.pojo.User;
import com.oracle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    //连接业务层
    @Autowired
    private UserService userService;

    @RequestMapping("/login/{uname}/{pwd}")
    public String login(@PathVariable("uname") String uname,
                        @PathVariable("pwd") String password,Model model) throws Exception {

        User user = userService.login(uname, password);
        model.addAttribute("user",user);
        if(null != user){
            return "main";
        }else{
            return "forward:/index.jsp";
        }
    }

}
