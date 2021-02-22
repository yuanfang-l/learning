package com.liu.config;

import com.liu.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.liu.pojo")
public class LiuConfig {
    @Bean
   public User getUser(){
       return new User();
   }
}
