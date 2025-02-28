package com.itheimal.homework;

public class Day02Test8 {
    public static void main(String[] args) {
        int year = 2050;
        boolean flag = false;
        if(year % 4 == 0 && year % 100 != 0){
            flag = true;
        }
        else if (year % 400 == 0){
            flag = true;
        }
        System.out.println("2050年是否为闰年:"+flag);
    }
}
