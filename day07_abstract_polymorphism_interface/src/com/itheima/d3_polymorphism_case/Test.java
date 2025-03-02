package com.itheima.d3_polymorphism_case;

public class Test {
    public static void main(String[] args) {
        Animal a= new Dog();
//        a.run();
        compete(a);
    }
    public static void compete(Animal a){
        System.out.println("比赛开始");
        a.run();
        System.out.println("比赛结束");
        //不能调用子类的独有功能
        //左边编译 右边运行
//        a.dogShow();
    }
}
