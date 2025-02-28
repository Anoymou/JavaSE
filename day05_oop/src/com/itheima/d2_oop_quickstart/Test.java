package com.itheima.d2_oop_quickstart;

public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student("播妞",90,80);
        Student stu2 = new Student("播仔",80,97);
        stu1.printTotalScore();
        stu1.printAvgScore();
        stu2.printTotalScore();
        stu2.printAvgScore();
    }
}
