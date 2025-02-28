package com.itheima.d1_if;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        //定义三种灯光的状态
        Scanner sc = new Scanner(System.in);
        System.out.println("请依次输入黄灯、红灯、绿灯的状态：");
        boolean yellow = sc.nextBoolean();
        boolean red = sc.nextBoolean();
        boolean green = sc.nextBoolean();
        if (yellow) {
            System.out.println("准备起步！");
        }
        if (red) {
            System.out.println("停车等待！");
        }
        if (green) {
            System.out.println("绿灯通行！");
        }
    }
}
