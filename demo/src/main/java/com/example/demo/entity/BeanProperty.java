package com.example.demo.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("test")
public class BeanProperty {
    private int randomInt;
    @Value("${liumao.age}")
    private int age;

}
