package com.ch.webservicetest.config;

import com.ch.webservicetest.service.TestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ch
 * @data 2019/3/27 - 10:19
 */

@Configuration
public class MyAppConfig {

    //将方法的返回值添加到容器中
    @Bean
    public TestService testCofigService(){

        System.out.println("配置文件添加");
        return new TestService();
    }
}
