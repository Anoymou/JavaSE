package com.itheima.d2_oop_quickstart;

public class Student {
    private String name;
    private double chinese;
    private double math;

    public Student(String name, double chinese, double math) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
    }

    public void printTotalScore(){
        System.out.println(name +"的总成绩是"+(chinese+math)+"分");
    }

    public void printAvgScore(){
        System.out.println(name +"的平均成绩是"+((chinese+math)/2)+"分");
    }
}
