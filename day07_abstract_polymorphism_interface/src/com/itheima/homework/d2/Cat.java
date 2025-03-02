package com.itheima.homework.d2;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("Cat吃鱼");
    }

    public void catchMouse(){
        System.out.println("努力捉老鼠");
    }
}
