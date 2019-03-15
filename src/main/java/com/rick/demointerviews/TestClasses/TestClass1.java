package com.rick.demointerviews.TestClasses;

import com.rick.demointerviews.TestInterfaces.Car;
import com.rick.demointerviews.TestInterfaces.TestImpl.CarImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class TestClass1 {

    public static void main(String[] args) {

        Car car = new CarImpl();

        InvocationHandler handler = new TestProxy(car);

        Car carProxy = (Car) Proxy.newProxyInstance(handler.getClass().getClassLoader(), car.getClass().getInterfaces(), handler);

        car.stop();
        car.run("benz");

        System.out.println(car.getClass().getName());
        System.out.println("=====================================");


        carProxy.run("benz");
        System.out.println("======================================");
        System.out.println(carProxy.getClass().getName());
        carProxy.stop();
    }
}
