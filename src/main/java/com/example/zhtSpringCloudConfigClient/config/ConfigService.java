package com.example.zhtSpringCloudConfigClient.config;

import lombok.Getter;
import lombok.Setter;
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
    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private Long age;
}
