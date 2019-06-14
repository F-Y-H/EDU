package com.CJDX.edu.controller;

import com.CJDX.edu.controller.base.BaseController;
import com.CJDX.edu.model.User;
import com.CJDX.edu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController extends BaseController<User> {

    @Autowired
    private IUserService userService;

    @RequestMapping("login")
    public String Userlogin(){
        System.out.println("Login...");
        return "Default";
    }

    @RequestMapping(MANAGE)
    public String UserManager(){
        return MANAGE_PAGE;
    }

    @RequestMapping(INFO)
    public String UserInfo(){
        return INFO_PAGE;
    }

    @RequestMapping(EDIT)
    public String UserEdit(){
        return EDIT_PAGE;
    }

    @RequestMapping("findUserByID")
    public String find(Integer id){
        System.out.println("findUserByID...");
        User user = userService.findUserByID(id);
        System.out.println(user);
        return "success";
    }

}
