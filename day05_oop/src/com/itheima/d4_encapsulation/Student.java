package com.itheima.d4_encapsulation;

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(){
//        System.out.println("我是无参构造方法！");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
//        System.out.println("我是有参构造方法！");
    }
}
