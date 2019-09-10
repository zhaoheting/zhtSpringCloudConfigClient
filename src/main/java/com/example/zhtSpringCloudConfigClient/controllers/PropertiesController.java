package com.example.zhtSpringCloudConfigClient.controllers;

import com.example.zhtSpringCloudConfigClient.config.ConfigServiceZht;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesController {

    @Autowired
    ConfigServiceZht configServiceZht;

    @RequestMapping("/test")
    public String test(){
        return configServiceZht.getTestStr();
    }
//    @Autowired
//    ConfigService configService;
//
//    @RequestMapping(value = "/name")
//    public String getName() {
//        return configService.getName();
//    }
//
//    @RequestMapping(value="/age")
//    public Long getAge(){
//        return configService.getAge();
//    }
}
