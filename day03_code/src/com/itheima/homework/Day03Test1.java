package com.itheima.homework;

import java.util.Scanner;

public class Day03Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] number = new int[3];
        int maxNumber = 0;
        System.out.println("请依次输入三个整数：");
        for (int i =0;i<3;i++){
            number[i] = sc.nextInt();
            if(number[i]>maxNumber){
                maxNumber = number[i];
            }
        }
        System.out.println(maxNumber);
    }
}
