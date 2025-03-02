package com.itheima.homework.d1;

public class Test {
    public static void main(String[] args) {
        Employee manager =new Manager("v001","张三",13000);
        Employee cook = new Cook("p001","小李",7000);
        manager.work();
        manager.eat();
        System.out.println("-----------------------");
        cook.work();
        cook.eat();
    }
}
