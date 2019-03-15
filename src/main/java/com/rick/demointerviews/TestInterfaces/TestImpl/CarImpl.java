package com.rick.demointerviews.TestInterfaces.TestImpl;

import com.rick.demointerviews.TestAOP.AOPAnno;
import com.rick.demointerviews.TestInterfaces.Car;
import org.springframework.stereotype.Service;

@Service
public class CarImpl implements Car {

    public CarImpl(){
        stop();
    }

    @Override
    public void run(String brand) {
        System.out.println(brand+"车 | "+"在跑");
    }

    @Override
    public void stop() {
        System.out.println("车停了");
    }

}
