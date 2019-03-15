package com.rick.demointerviews.TestClasses;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor{
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理执行前。。。");
        methodProxy.invokeSuper(o,objects);
        System.out.println("cglib代理执行后。。。");
        return null;
    }

}
