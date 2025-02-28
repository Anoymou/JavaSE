package com.itheimal.homework;

import java.util.Scanner;

public class Day02Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的姓名:");
        String name = sc.next();
        System.out.println("请输入你的年龄:");
        int age = sc.nextInt();
        System.out.println("请输入你的身高:");
        double height = sc.nextDouble();
        System.out.print(
                "我的姓名是"+name+"，"
                +"年龄"+age+"岁"+"，"
                +"身高"+height+"cm");
    }
}
