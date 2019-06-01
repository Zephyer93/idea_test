package com.ai.web.controller;

import com.ai.pojo.Users;
import com.ai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

    /**
     * doGet
     * @param username
     * @param userage
     * @return
     */
    @RequestMapping(value = "/doGet/{username}/{userage}",method = RequestMethod.GET)
    public String doGet(@PathVariable String username,@PathVariable String userage){
        System.out.println("==============doGet===============");
        System.out.println("username:"+username+"||userage:"+userage);
        return "ok";
    }

    /**
     * doPost
     * @param user
     * @return
     */
    @RequestMapping(value = "/doPost",method = RequestMethod.POST)
    public String doPost(Users user){
        System.out.println("==============doPost==============");
        System.out.println(user);
        return "ok";
    }

    /**
     * doDelete
     * @param userid
     * @return
     */
    @RequestMapping(value = "/doDelete",method= RequestMethod.DELETE)
    public String doDelete(Integer userid){
        System.out.println("==============doDelete============");
        System.out.println(userid);
        return "ok";
    }

    /**
     * doPut
     * @param username
     * @return
     */
    @RequestMapping(value = "/doPut",method = RequestMethod.PUT)
    @ResponseBody
    public String doPut(String username){
        System.out.println("===============doPut===============");
        System.out.println(username);
        return "ok";
    }
}
