package com.example.zhtSpringCloudConfigClient;

import com.hello.HelloService;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloServiceTest {

    HelloService helloService = new HelloService();
}
