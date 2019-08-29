package com.example.zhtSpringCloudConfigClient.controllers;

import com.example.zhtSpringCloudConfigClient.config.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesController {

    @Autowired
    ConfigService configService;

    @RequestMapping(value = "/showProperties")
    public String getProperty() {
        return configService.getTestString();
    }
}
