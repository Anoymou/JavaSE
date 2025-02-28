package com.itheima.homework;

import java.util.Scanner;

public class Day03Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入作为程序员的你的工作的工龄:");
        int workYears = sc.nextInt();
        System.out.println("请输入作为程序员的你的基本工资为:");
        int salary = sc.nextInt();
        int upSalary = 0, nowSalary =0;
        if (workYears>=10 && workYears <15){
            upSalary = 20000;
            nowSalary = salary+upSalary;
        }
        else if (workYears >=5 && workYears <10){
            upSalary = 10000;
            nowSalary = salary+upSalary;
        }
        else if (workYears >=3 && workYears <5) {
            upSalary = 5000;
            nowSalary = salary+upSalary;
        }
        else if (workYears>=1 && workYears <3){
            upSalary = 3000;
            nowSalary = salary+upSalary;
        }
        System.out.println(
                "您目前工作了"+workYears+"年，"
                +"基本工资为"+salary+"元，"
                +"应涨工资"+upSalary+"元，"
                +"涨后工资"+nowSalary+"元");
    }
}
