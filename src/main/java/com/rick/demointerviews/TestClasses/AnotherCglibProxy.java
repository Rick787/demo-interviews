package com.rick.demointerviews.TestClasses;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class AnotherCglibProxy implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("另一个cglib执行前。。。");
        methodProxy.invokeSuper(o,objects);
        System.out.println("另一个cglib执行后。。。");

        return null;
    }
}
