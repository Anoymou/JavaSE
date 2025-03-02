package com.itheima.d3_polymorphism_case;

public class Tortoise extends Animal{
    @Override
    public void run() {
        System.out.println("乌龟跑的慢");
    }
    public void tortoiseShow(){
        System.out.println("乌龟在表演才艺");
    }
}
