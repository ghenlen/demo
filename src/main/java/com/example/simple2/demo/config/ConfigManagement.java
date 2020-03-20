package com.example.simple2.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class ConfigManagement {
    Logger log = LoggerFactory.getLogger(ConfigManagement.class);
    @Value("${spring.mongodb.url}")
    private String url;
    @Value("${spring.mongodb.name}")
    private String name;
    @Value("${spring.mongodb.password}")
    private String password;

    @PostConstruct
    public void getConfig() {
        log.info("dburl:{},dbname:{},dbpassword:{}",url, name, password);
    }
}
