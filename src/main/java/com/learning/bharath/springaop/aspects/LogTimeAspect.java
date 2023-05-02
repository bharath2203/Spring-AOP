package com.learning.bharath.springaop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogTimeAspect {

    @Around("@annotation(com.learning.bharath.springaop.annotations.LogTime)")
    public Object logMethodExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Long start = System.currentTimeMillis();
        Object proceed = proceedingJoinPoint.proceed();
        Long end = System.currentTimeMillis();
        System.out.println("Method: " + proceedingJoinPoint.getSignature() + " took " + (end - start) + " ms");
        return proceed;
    }

}
