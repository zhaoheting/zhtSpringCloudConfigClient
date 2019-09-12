package com.example.zhtSpringCloudConfigClient.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Get properties From spring cloud.
 *
 * @author heting.zhao
 */
@Service
//Refresh the properties automatically.
public class ConfigServiceZht {

    @Value("${validation.properties.test}")
    private String testStr;

    public String getTestStr() {
        return testStr;
    }

    public void setTestStr(String testStr) {
        this.testStr = testStr;
    }
}
