package com.itheima.d4;

import java.util.Scanner;

public class Test {
    /*
    *使用程序在控制台输出n行n列的星型直角三角型，其中n由用户在控制台录入， 形状参考如下：

     *
     **

     ***

     ****

     *****

     ******
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数n：");
        int n = scanner.nextInt();

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
