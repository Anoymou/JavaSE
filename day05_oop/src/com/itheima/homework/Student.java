package com.itheima.homework;

public class Student {
    private String name;
    private int age;

    public Student(){
    }

    public Student(String name,int age){
        this.name= name;
        this.age =age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show(){
        System.out.println("姓名："+name+"，年龄："+age);
    }
}
