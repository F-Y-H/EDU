package com.CJDX.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("employee")
public class EmployeeController {


    @RequestMapping("manage")
    public String EmployeeManager(){
        return "employee/manage";
    }

    @RequestMapping("info")
    public String EmployeeInfo(){
        return "employee/info";
    }

    @RequestMapping("edit")
    public String EmployeeEdit(){
        return "employee/edit";
    }

    @RequestMapping("update")
    public String EmployeeUpdate(){
        return "employee/update";
    }

}
