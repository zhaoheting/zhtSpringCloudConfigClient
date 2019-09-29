package com.example.zhtSpringCloudConfigClient.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping("/login")
    public String login(){
        return "login success";
    }

    @RequestMapping("/loginOut")
    public String loginOut(){
        return "login out";
    }
}