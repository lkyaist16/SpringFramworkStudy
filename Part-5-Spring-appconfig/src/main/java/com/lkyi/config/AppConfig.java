package com.lkyi.config;

import com.lkyi.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.lkyi")
public class AppConfig {
    @Bean
    public User getUser() {
        return new User();
    }

}
