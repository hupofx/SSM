package com.hupofx.spring.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author zdz
 * @version V1.0
 * @Package com.hupofx.spring.aop.annotation
 * @date 2022/9/27 1:06
 */
@Component
@Aspect
@Order(1)
public class ValidateAspect {

    //@Before("execution(* com.hupofx.spring.aop.annotation.CalculatorImpl.*(..))")
    @Before("com.hupofx.spring.aop.annotation.LoggerAspect.pointCut()")
    public void beforeMethod(){
        System.out.println("ValidateAspect-->前置通知");
    }
}
