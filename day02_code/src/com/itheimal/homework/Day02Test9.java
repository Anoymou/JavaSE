package com.itheimal.homework;

import java.util.Scanner;

public class Day02Test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int number = sc.nextInt();
        System.out.print(
                "您输入的数是："+number+"\n"
                +"这个数是：" +(number % 2 == 0 ? "偶数":"奇数"));
    }
}
