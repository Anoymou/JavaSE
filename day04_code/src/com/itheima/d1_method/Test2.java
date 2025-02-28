package com.itheima.d1_method;

public class Test2 {
    public static void main(String[] args) {
        eat();
    }
    public static void  eat (){
        study();
        System.out.println("吃饭！");
        sleep();
    }
    public static void study(){
        System.out.println("学习！");
    }
    public static void sleep(){
        System.out.println("睡觉！");
    }
}
