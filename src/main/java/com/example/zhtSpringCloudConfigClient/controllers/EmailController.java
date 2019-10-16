package com.example.zhtSpringCloudConfigClient.controllers;

import com.example.zhtSpringCloudConfigClient.model.MailDto;
import com.example.zhtSpringCloudConfigClient.services.interfaces.IMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EmailController {

    @Autowired
    IMailService iMailService;

    @GetMapping("/send")
    public void mail() {
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("testString", "捏你的咪咪");
            MailDto mailDto = new MailDto();
            mailDto.setAttachment(map);
            mailDto.setEmail("Heting.Zhao@openjawtech.com");
            mailDto.setTitle("悄悄话");
            iMailService.sendTemplateMail(mailDto);
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
