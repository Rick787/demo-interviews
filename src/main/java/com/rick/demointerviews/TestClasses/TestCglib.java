package com.rick.demointerviews.TestClasses;

import com.rick.demointerviews.TestInterfaces.Car;
import com.rick.demointerviews.TestInterfaces.TestImpl.CarImpl;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.NoOp;

public class TestCglib {

    public static void main(String[] args) {

        CglibProxy cglibProxy = new CglibProxy();
        AnotherCglibProxy anotherCglibProxy = new AnotherCglibProxy();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(CarImpl.class);
        enhancer.setCallbacks(new Callback[]{cglibProxy,anotherCglibProxy, NoOp.INSTANCE});
        enhancer.setCallbackFilter(new CglibFilter());

        //构造函数不设置拦截
        enhancer.setInterceptDuringConstruction(false);

        Car car = (Car) enhancer.create();
        car.run("bmw");
        car.stop();
    }
}
