package com.ai.web.controller;

import com.ai.pojo.Users;
import com.ai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/addUser")
    public String addUser(Users user){
        this.userService.addUser(user);
        System.out.println("------------------");
        return "ok";
    }
}
