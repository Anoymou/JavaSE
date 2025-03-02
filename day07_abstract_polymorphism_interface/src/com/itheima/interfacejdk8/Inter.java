package com.itheima.interfacejdk8;

public interface Inter {
    default void show(){
        System.out.println("我是一个接口默认方法");
    }

    static void play(){
        System.out.println("我是一个接口静态方法，我只能通过接口名来调用");
    }
}
