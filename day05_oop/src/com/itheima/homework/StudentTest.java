package com.itheima.homework;

public class StudentTest {
    public static void main(String[] args) {
        Student stu = new Student();
        Student stu1 = new Student("李四",24);
        stu.setName("张三");
        stu.setAge(23);
        stu.show();
        stu1.show();
    }
}
