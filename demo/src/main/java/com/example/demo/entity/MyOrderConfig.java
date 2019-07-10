package com.example.demo.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyOrderConfig
 * @Description
 * @Author gehui
 * @Date 2019/7/11 7:00
 * @Version
 **/
@Component
@ConfigurationProperties(prefix = "test")
@PropertySource("classpath:test.properties")
public class MyOrderConfig {
    private String name;
    private int num;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
