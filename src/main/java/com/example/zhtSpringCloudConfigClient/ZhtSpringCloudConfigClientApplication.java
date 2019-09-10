package com.example.zhtSpringCloudConfigClient;

import com.example.zhtSpringCloudConfigClient.config.ConfigServiceZht;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class ZhtSpringCloudConfigClientApplication {


	public static void main(String[] args) {
		SpringApplication.run(ZhtSpringCloudConfigClientApplication.class, args);
	}

}
