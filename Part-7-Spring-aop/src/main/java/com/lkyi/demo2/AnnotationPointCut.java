package com.lkyi.demo2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 注解实现aop
 */
@Aspect
public class AnnotationPointCut {

    @Before("execution(* com.lkyi.demo1.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("==========方法执行前==========");
    }

    @After("execution(* com.lkyi.demo1.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("==========方法执行后==========");
    }

    @Around("execution(* com.lkyi.demo1.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");
        joinPoint.proceed();
        System.out.println("环绕后");
    }
}
