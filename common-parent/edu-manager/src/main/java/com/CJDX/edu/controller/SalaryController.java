package com.CJDX.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("salary")
public class SalaryController {


    @RequestMapping("manage")
    public String SalaryManager(){
        return "salary/manage";
    }

    @RequestMapping("info")
    public String SalaryInfo(){
        return "salary/info";
    }

    @RequestMapping("edit")
    public String SalaryEdit(){
        return "salary/edit";
    }

    @RequestMapping("update")
    public String SalaryUpdate(){
        return "salary/update";
    }

}
