package com.example.zhtSpringCloudConfigClient.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Get properties From spring cloud.
 *
 * @author heting.zhao
 */
@Service
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
