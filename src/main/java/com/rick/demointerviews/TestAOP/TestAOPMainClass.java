package com.rick.demointerviews.TestAOP;

import com.rick.demointerviews.TestInterfaces.TestImpl.CarImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAOPMainClass {

    @RequestMapping("/haha")
    public String test1() {

        CarImpl car = new CarImpl();
        car.stop();
        return "aaa";
    }

    @RequestMapping("/hehe")
    public void test2(){
        throw new NullPointerException();
    }

}
