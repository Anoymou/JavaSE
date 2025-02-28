package com.itheima.d4_encapsulation;

public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student();
    /*    stu1.setName("小点点");
        stu1.setAge(18);
        System.out.println("学生姓名为："+stu1.getName()+"，年龄为："+stu1.getAge());*/
        Student stu2 = new Student("玛卡巴卡",18);
        System.out.println("学生姓名为："+stu2.getName()+"，年龄为："+stu2.getAge());
        System.out.println("学生姓名为："+stu1.getName()+"，年龄为："+stu1.getAge());
    }
}