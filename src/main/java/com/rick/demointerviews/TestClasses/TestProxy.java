package com.rick.demointerviews.TestClasses;

import org.omg.CORBA.portable.InvokeHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestProxy implements InvocationHandler {

    private Object car;

    public TestProxy(Object car) {
        this.car = car;
    }

    public Object bind(){
        Object o = Proxy.newProxyInstance(car.getClass().getClassLoader(), car.getClass().getInterfaces(), this);
        return o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


        if ("run".equals(method.getName())){
            System.out.println("方法执行前打印。。。");

            System.out.println("Method: " + method);

            method.invoke(car, args);

            System.out.println("方法执行后打印。。。");
        }

        return null;
    }
}
