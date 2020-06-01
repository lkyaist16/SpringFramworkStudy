package com.lkyi.config;

import com.lkyi.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.lkyi")
public class AppConfig {
    @Bean(initMethod = "init", destroyMethod = "destroy")
//    @Scope("prototype")
    public User user() {
        return new User();
    }

    @Bean
    public MyBeanPostProcessor myBeanPostProcessor() {
        return new MyBeanPostProcessor();
    }

}
