package com.webApp.eStore.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogginAspect {

    private static final Logger logger = LoggerFactory.getLogger(LogginAspect.class);

    @Before("execution(* com.webApp.eStore.service.ProductService.*(..))")
    public void logMethodCall(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        logger.info("Executing ProductService method: {}", methodName);
    }
}
