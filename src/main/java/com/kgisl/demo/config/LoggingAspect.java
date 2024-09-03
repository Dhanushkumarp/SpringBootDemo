package com.kgisl.demo.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    Logger la = LoggerFactory.getLogger(this.getClass());

    @Before(value = "execution(* com.kgisl.demo.service.PersonService.*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("Before method:" + joinPoint.getSignature());
        la.info("Before method:" + joinPoint.getSignature());
    }

    @After(value = "execution(* com.kgisl.demo.service.PersonService.*(..))")
    public void afterAdvice(JoinPoint joinPoint) {
        System.out.println("After method:" + joinPoint.getSignature());
        la.info("After method:" + joinPoint.getSignature());
    }
}
