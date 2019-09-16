package com.example.zhtSpringCloudConfigClient.services;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

//@RefreshScope

/**
 * Get properties from local properties.
 *
 * @author heting.zhao
 */
@Service
@ConfigurationProperties(prefix = "author")
@PropertySource("classpath:config/author.properties")
public class ConfigService {

    //The property from designated file will be covered by the property
    // from application.properties with the same name as it.
    private String name;

    private Long age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
