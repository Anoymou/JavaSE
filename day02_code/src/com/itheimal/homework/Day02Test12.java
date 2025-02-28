package com.itheimal.homework;

import java.util.Scanner;

public class Day02Test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明左手中的纸牌：");
        int left = sc.nextInt();
        System.out.println("请输入小明右手中的纸牌：");
        int right = sc.nextInt();
        System.out.print(
                "互换前小明手中的纸牌："+"\n"
                +"左手中的纸牌："+left+"\n"
                +"右手中的纸牌："+right+"\n");
        int temp =left;
        left = right;
        right =temp;
        System.out.print(
                "互换后小明手中的纸牌："+"\n"
                +"左手中的纸牌："+left+"\n"
                +"右手中的纸牌："+right+"\n");
    }
}
