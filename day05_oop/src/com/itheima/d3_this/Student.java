package com.itheima.d3_this;

public class Student {
    String name;
    double chinese;
    double math;
    public void showThis(){
        System.out.println(this);
    }
    public void showTotalScore(){
        System.out.println(this.name+"的总成绩是"+(this.chinese+this.math)+"分");
    }
}
