package com.example.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WebLogAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Pointcut("execution(public * com.example.demo..*.getUserById(..))")
    public void pointcut(){}

    @Before("pointcut()")
    public void beginTransaction(){
        logger.info("begin transaction");
    }

    @After("pointcut()")
    public void commit(){
        logger.info("after commit");
    }

    @AfterReturning(pointcut = "pointcut()",returning = "result")
    public void afterReturn(Object result){
        logger.info("return都执行完了  这下我可以执行了");
    }

    @Around("pointcut()")
    public  Object doAround(ProceedingJoinPoint joinPoint){
        logger.info("around advance 开始执行");

            Object obj;
        try {
            obj=joinPoint.proceed();
            logger.info("方法执行完了");
        } catch (Throwable throwable) {
            logger.error("around执行有问题了");
            return null;
        }

        return obj;
    }

    @AfterThrowing(throwing = "e",pointcut = "pointcut()")
    public void afterThrow(Throwable e){
        logger.error("只有报错才调用我");
        logger.error(e.getMessage());
    }
}
