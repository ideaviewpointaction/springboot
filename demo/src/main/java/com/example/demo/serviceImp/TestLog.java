package com.example.demo.serviceImp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TestLog {
    Logger logger=LoggerFactory.getLogger(this.getClass());

    public void hellow(){
        logger.error("我答应了么");
        logger.info("我是INFO 我答应了么");
    }
}
