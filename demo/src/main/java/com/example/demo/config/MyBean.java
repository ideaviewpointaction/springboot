package com.example.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyBean implements ApplicationRunner {

    Logger logger=LoggerFactory.getLogger(this.getClass());

    /**
     *  该方法在SpringApplication.run()运行成成之前调用
     * @param args
     * @throws Exception
     */
    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("我已经调用了");
    }

    @Autowired
    public MyBean(ApplicationArguments args) {
        boolean debug = args.containsOption("debug");

        List<String> nonOptionArgs = args.getNonOptionArgs();
        logger.info(nonOptionArgs.toString());
    }


}
