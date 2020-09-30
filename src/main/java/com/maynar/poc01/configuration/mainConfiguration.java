package com.maynar.poc01.configuration;

import com.maynar.poc01.service.IUserService;
import com.maynar.poc01.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class mainConfiguration {

    @Bean
    public IUserService getUserService(){
        return new UserServiceImpl();
    }

}
