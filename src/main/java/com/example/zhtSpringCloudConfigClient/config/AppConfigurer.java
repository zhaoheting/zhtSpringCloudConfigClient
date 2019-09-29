package com.example.zhtSpringCloudConfigClient.config;

import com.example.zhtSpringCloudConfigClient.interceptors.AuthenticationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class AppConfigurer extends WebMvcConfigurerAdapter {

    @Bean
    public HandlerInterceptor getMyInterceptor(){
        return new AuthenticationInterceptor();
    }

    //This method aims to set the path below which the method will be intercepted when it is run.
    //Here, all the method will be intercepted.
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getMyInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
