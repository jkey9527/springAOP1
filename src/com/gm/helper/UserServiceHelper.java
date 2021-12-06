package com.gm.helper;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class UserServiceHelper implements MethodBeforeAdvice, AfterReturningAdvice, MethodInterceptor {

    //mehtod：要增强的方法 args：方法的参数 target：目标对象
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("前置通知。。。");
    }

    //returnValue：目标返回值 mehtod：要增强的方法 args：方法的参数 target：目标对象
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("后置通知。。。");
    }

    //mi：调用方法的对象
    public Object invoke(MethodInvocation mi) throws Throwable {
        System.out.println("方法执行之前。。。");
        Object value = mi.proceed();//执行目标方法
        System.out.println("方法执行之后。。。");
        return null;
    }
}
