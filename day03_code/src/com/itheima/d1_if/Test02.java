package com.itheima.d1_if;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money = 52;
        if(money == 520){
            System.out.println("红包发送成功！");
        }
        else {
            System.out.println("余额不足，请充值！");
        }
        System.out.println("请输入你的成绩：");
        double score = sc.nextDouble();
        if (score >= 60){
            System.out.println("成绩及格！");
        }
        else {
            System.out.println("不及格！");
        }
    }
}
