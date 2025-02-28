package com.itheima.d3_override2;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student("张三",23);
//        System.out.println(stu.toString());
        System.out.println(stu);
        Student stu1 = new Student("张三",23);
        System.out.println(stu1);
        Student stu2 = stu;
        System.out.println(stu.equals(stu1));//equals未重写时，比较的是两个对象的地址
    }

}
