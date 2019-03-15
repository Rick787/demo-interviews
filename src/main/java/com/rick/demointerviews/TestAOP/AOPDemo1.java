package com.rick.demointerviews.TestAOP;


import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Aspect
@Component
public class AOPDemo1 {

    @Pointcut("execution(* com.rick.demointerviews.TestAOP.TestAOPMainClass.*(..))")
    public void point(){
    }

    @Pointcut("@annotation(com.rick.demointerviews.TestAOP.AOPAnno)")
    public void pointAnother(){

    }

    @Before("point()")
    public void before(){
        System.out.println("before...");
    }

    @After("point()")
    public void after(){
        System.out.println("after...");
    }

    @AfterReturning("point()")
    public void round(){
        System.out.println("round...");
    }

    @AfterThrowing("point()")
    public void afterThrowing(){
        System.out.println("throwingException...");
    }

    @Before("pointAnother()")
    public void beforeAnother(){
        System.out.println("before...Another...");
    }

}
