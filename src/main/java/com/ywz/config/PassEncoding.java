package com.ywz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class PassEncoding {
    //这个注解
    @Bean
    protected PasswordEncoder passwordEncoder(){
        //这个方法可以对密码进行加密处理
        return new BCryptPasswordEncoder();
    }
}
