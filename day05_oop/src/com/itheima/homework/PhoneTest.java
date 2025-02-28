package com.itheima.homework;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        Phone p2 = new Phone("华为手机",6999,"黑色");
        p1.setBrand("小米手机");
        p1.setColor("白色");
        p1.setPrice(2999);
        p1.call();
        p2.sendMessage();
    }
}
