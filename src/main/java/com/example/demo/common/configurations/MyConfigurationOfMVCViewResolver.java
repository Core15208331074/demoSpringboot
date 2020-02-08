package com.example.demo.common.configurations;

import com.example.demo.common.clientBean.MyViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;

@Configuration
public class MyConfigurationOfMVCViewResolver  {

    @Bean
    public ViewResolver myViewResolver(){
        return new MyViewResolver();
    }
}
