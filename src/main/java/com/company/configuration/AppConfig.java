package com.company.configuration;

import com.company.model.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MyBean bean(){
        return new MyBean("Hello");
    }

}
