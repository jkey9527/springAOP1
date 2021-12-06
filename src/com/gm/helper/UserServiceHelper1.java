package com.gm.helper;

import org.aspectj.lang.ProceedingJoinPoint;

public class UserServiceHelper1 {

    public void before(){
        System.out.println("前置通知。。。");
    }

    public void afterReturning(){
        System.out.println("后置通知。。。");
    }

    public Object aroud(ProceedingJoinPoint pp) throws Throwable {
        System.out.println("方法执行前。。。");
        Object value = pp.proceed();
        System.out.println("方法执行后。。。");
        return value;
    }

    public void after(){
        System.out.println("最终通知。。。");
    }
}
