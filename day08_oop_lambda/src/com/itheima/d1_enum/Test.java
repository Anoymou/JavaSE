package com.itheima.d1_enum;

public class Test {
    public static void main(String[] args) {
        /*
        枚举中每一个值都是一个常量
        枚举都是最终类，不能被继承
        枚举中的每一个值也是一个对象，对象的类型就是枚举名
        枚举中的构造方法都说私有的，所以不不能创建枚举类的对象
         */
        Season spring = Season.SPRING;
        System.out.println(spring);

        System.out.println(spring.getDesc());
        System.out.println(spring.ordinal());
    }
}
