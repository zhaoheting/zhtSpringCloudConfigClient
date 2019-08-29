package com.example.zhtSpringCloudConfigClient.config;

import org.springframework.stereotype.Service;

//@RefreshScope
@Service
public class ConfigService {

    private String testString = "wocao";

    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }
}
