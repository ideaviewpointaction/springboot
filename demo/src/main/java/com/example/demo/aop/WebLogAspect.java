package com.example.demo.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WebLogAspect {

    @Pointcut("execution(public * com.example.demo..*.*(..))")
    public void pointcut(){}

    @Before("pointcut()")
    public void beginTransaction(){
        System.out.println("begin transaction");
    }

    @After("pointcut()")
    public void commit(){
        System.out.println("after commit");
    }

    public void afterReturn(){

    }
}
