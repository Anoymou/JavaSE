package com.itheimal.homework;

import java.util.Scanner;

public class Day02Test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个分数:");
        int score = sc.nextInt();
        System.out.println(score>=60?"及格":"不及格");
    }
}
