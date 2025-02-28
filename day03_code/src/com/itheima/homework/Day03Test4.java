package com.itheima.homework;

import java.util.Scanner;

public class Day03Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于100的三位数：");
        int number = sc.nextInt();
        int count =0,sum =0;
        for (int i =100;i<=number;i++){
            if(i%10!=7&&i/10%10!=5&&i/100!=3){
                System.out.println(i);
                count++;
                sum+=i;
            }
        }
        System.out.println("数字的个数为："+count);
        System.out.println("数字的和为："+sum);
    }
}
