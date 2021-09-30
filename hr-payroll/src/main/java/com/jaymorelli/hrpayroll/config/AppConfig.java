package com.jaymorelli.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
    

    //Create a singleton of RestTemplate for the application.
    @Bean
    public RestTemplate getRestTemplate() { 
        return new RestTemplate();
    }
}
