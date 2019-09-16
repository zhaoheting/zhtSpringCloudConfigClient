package com.example.zhtSpringCloudConfigClient.services.interfaces;

import com.example.zhtSpringCloudConfigClient.model.MailDto;

public interface IMailService {

    public void sendTemplateMail(MailDto mailDto);
}
