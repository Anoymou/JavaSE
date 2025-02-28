package com.itheima.d1_oop_quickstart;

public class Test {
    public static void main(String[] args) {
        Start s1 = new Start();
        Start s2 = new Start();
        s1.setName("赵丽颖");
        s1.setAge(36);
        s1.setHeight(167);
        s1.setWeight(56);
        s2.setName("杨幂");
        s2.setAge(38);
        s2.setHeight(170);
        s2.setWeight(55);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
