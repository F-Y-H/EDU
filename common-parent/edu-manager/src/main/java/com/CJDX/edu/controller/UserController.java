package com.CJDX.edu.controller;

import com.CJDX.edu.model.User;
import com.CJDX.edu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("login")
    public String Userlogin(){
        System.out.println("Login...");
        return "Default";
    }

    @RequestMapping("manage")
    public String UserManager(){
        return "user/manage";
    }

    @RequestMapping("info")
    public String UserInfo(){
        return "user/info";
    }

    @RequestMapping("edit")
    public String UserEdit(){
        return "user/edit";
    }

    @RequestMapping("findUserByID")
    public String find(Integer id){
        System.out.println("findUserByID...");
        User user = userService.findUserByID(id);
        System.out.println(user);
        return "success";
    }

}
