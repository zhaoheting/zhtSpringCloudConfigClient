package com.example.zhtSpringCloudConfigClient.config;

import com.example.zhtSpringCloudConfigClient.interceptors.AuthenticationInterceptor;
import com.example.zhtSpringCloudConfigClient.interceptors.TestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class AppConfigurer extends WebMvcConfigurerAdapter {

    @Bean
    public HandlerInterceptor getAuthenticationInterceptor() {
        return new AuthenticationInterceptor();
    }

    @Bean
    public HandlerInterceptor getMyTestInterceptor() {
        return new TestInterceptor();
    }

    //This method aims to set the path below which the method will be intercepted when it is run.
    //Here, all the method will be intercepted.
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        // excludePathPatterns is used to show the excluded situation.
        registry.addInterceptor(getAuthenticationInterceptor()).addPathPatterns("/**");
        registry.addInterceptor(getMyTestInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
