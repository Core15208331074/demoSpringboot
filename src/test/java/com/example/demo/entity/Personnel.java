package com.example.demo.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@ConfigurationProperties(prefix = "personnel")
@PropertySource(value = {"classpath:personnel.properties"})
public class Personnel {
//    @Value("${personnel.name}")
    private String name;
//    @Value("${personnel.gender}")
    private String gender;
//    @Value("${personnel.list}")
    private List list;
//    @Value("#{2}")
    private Integer age;
//    @Value("${personnel.pet}")
    private Pet dog;
}
