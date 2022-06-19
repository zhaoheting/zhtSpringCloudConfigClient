package com.example.zhtSpringCloudConfigClient.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

/**
 * Get properties From spring cloud.
 *
 * @author heting.zhao
 */
@Service
//Refresh the properties automatically.
@RefreshScope
public class ConfigServiceZht {

    @Value("${test}")
    private String testStr;

    public String getTestStr() {
        return testStr;
    }

    public void setTestStr(String testStr) {
        this.testStr = testStr;
    }
}
