package com.itheima.d2_polymorphism;

public class Test {
    public static void main(String[] args) {
        Animal dog = new Dog();
        /*
        *
        * */
        //编译看左边，运行看右边（就近原则）
        dog.run();

        Animal cat = new Cat();
        cat.run();
    }
}
