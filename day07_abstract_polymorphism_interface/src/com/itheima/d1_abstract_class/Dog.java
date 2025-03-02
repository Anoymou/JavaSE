package com.itheima.d1_abstract_class;

public class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("小狗汪汪叫");
    }

    @Override
    public void eat() {
        System.out.println("小狗吃骨头");
    }
}
