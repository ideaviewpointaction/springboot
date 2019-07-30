package com.example.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExitCodeBean {
    private Logger logger= LoggerFactory.getLogger(this.getClass());
    @Bean
    public ExitCodeGenerator codeGenerator(){
        logger.info("spring 要关闭了");
        return ()->42;
    }
}
