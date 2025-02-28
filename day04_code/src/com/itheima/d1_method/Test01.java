package com.itheima.d1_method;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个小数：");
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();
        System.out.println(getMinDouble(number1,number2));
    }
    public static double getMinDouble(double a, double b){
        return a<b? a:b;
    }
}
