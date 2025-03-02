package com.itheima.d3_polymorphism_case;

public class Dog extends Animal{
    @Override
    public void run() {
        System.out.println("狗跑的快");
    }

    public void dogShow(){
        System.out.println("狗在表演才艺");
    }
}
