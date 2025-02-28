package com.itheima.d1_if;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while (true){
            System.out.println("输入分数：");
            int score = sc.nextInt();
            switch (score/10){
                case 10, 9:
                    System.out.println("等级为A");
                    break;
                case 8, 7:
                    System.out.println("等级为B");
                    break;
                case 6:
                    System.out.println("等级为C");
                    break;
                case 5:
                case 4:
                case 3:
                case 2:
                case 1:
                case 0:
                    System.out.println("等级为D");
                    break;
                default:
                    System.out.println("分数有误");
            }
        }
    }
}
