package com.rick.demointerviews.JavaPolymorphism;

public class MickRead extends Reader {

    @Override
    public void read() {
        System.out.println("MickRead...");
    }

    @Override
    public void write() {
        System.out.println("MickWrite...");
    }

    public void say(){
        System.out.println("MikeSay...");
    }


}
