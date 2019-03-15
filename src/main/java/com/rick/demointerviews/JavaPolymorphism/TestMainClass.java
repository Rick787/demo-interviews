package com.rick.demointerviews.JavaPolymorphism;

public class TestMainClass {

    public static void main(String[] args) {

         Reader reader = new MickRead();
         reader.read();
         reader.write();
         reader.sleep();

         MickRead mickRead = new MickRead();
         mickRead.say();
         mickRead.sleep();
    }
}
