package com.itheima.d8_lambda;

public class Test {
    public static void main(String[] args) {
        Animal dog =new Animal() {
            @Override
            public void run() {
                System.out.println("狗跑");
            }
        };
        dog.run();


        Animal cat = ()->{
            System.out.println("猫跑");
        };
        cat.run();
    }
}
