package com.example.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Before 等注解上的都是约束  如：execution表达式
 * AfterReturn 中的returnning 海牙exception等  都是对表达式做的限制
 *
 *
 */
@Aspect
@Component
public class WebLogAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Pointcut("execution(public * com.example.demo..*.getUserById2(..))")
    public void pointcut(){}

    @Before("pointcut()")
    public void beginTransaction(JoinPoint joinPoint){
        Object[] objs=joinPoint.getArgs();
        for (int j=0;j<objs.length;j++){
            logger.info("before.."+objs[j]);
        }
        logger.info("begin transaction");
        logger.info("bbb");

    }

    @After("pointcut()")
    public void commit(JoinPoint joinPoint){
        joinPoint.getSignature();
        logger.info("after commit");
    }

    @AfterReturning(pointcut = "pointcut()",returning = "result")
    public void afterReturn(Object result){
        logger.info("return都执行完了  这下我可以执行了");
    }

    @Around("pointcut()")
    public  Object doAround(ProceedingJoinPoint joinPoint){
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
