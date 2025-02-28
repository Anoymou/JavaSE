package com.itheimal.d2_data_convert;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int a = sc.nextInt();
      /*  String str = sc.next();*/
       /* System.out.println(a%10);
        System.out.println(a/10);
        System.out.println(a/100);*/
        int b = a%10;
        int c = a/10%10;
        int d = a/100%10;
        System.out.println("个位数为："+b);
        System.out.println("十位数为："+c);
        System.out.println("百位数为："+d);
        /*System.out.println(str);*/
    }
}
