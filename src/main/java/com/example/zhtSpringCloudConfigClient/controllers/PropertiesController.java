package com.example.zhtSpringCloudConfigClient.controllers;

import com.example.zhtSpringCloudConfigClient.services.ConfigService;
import com.example.zhtSpringCloudConfigClient.services.ConfigServiceZht;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesController {

    @Autowired
    ConfigServiceZht configServiceZht;

    @RequestMapping("/getFromGit")
    public String test(){
        return configServiceZht.getTestStr();
    }
    @Autowired
    ConfigService configService;

    @RequestMapping(value = "/nameFromLocal")
    public String getName() {
        return configService.getName();
    }

    @RequestMapping(value="/ageFromLocal")
    public Long getAge(){
        return configService.getAge();
    }
}
