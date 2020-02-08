package com.example.demo.configuration;

import com.example.demo.service.IJustPlayService;
import com.example.demo.service.impl.JustPlayServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    @ConditionalOnMissingClass("JustPlayServiceImpl02.class")
    public IJustPlayService getIJustPlayService() {
        return new JustPlayServiceImpl();
    }
}
