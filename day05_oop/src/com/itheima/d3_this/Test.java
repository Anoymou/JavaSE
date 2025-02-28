package com.itheima.d3_this;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name="玛卡巴卡";
        stu.chinese=100;
        stu.math=90;
        stu.showThis();
        stu.showTotalScore();
        Student stu1 = new Student();
        stu1.name="小点点";
        stu1.chinese=100;
        stu1.math=100;
        stu1.showThis();
        stu1.showTotalScore();
    }
}
