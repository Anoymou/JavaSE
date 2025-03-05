package com.itheima.d1;

import java.util.Scanner;

public class Test {

    /*
    * 需求： 键盘录入1到12 ，对应输出该月份对应的季节 。如果输入的不是1到12，输出提示信息：您输入的数据有误。

      说明： 春季：3,4,5月份 夏季:6,7,8月份 秋季: 9,10,11月份 冬季：12,1,2月份
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        boolean flag = false;
        while (!flag){
            System.out.println("请输入1~12的数字：");
            number = sc.nextInt();
            if(number<=0||number>12){
                System.out.println("您输入的数据有误，请重新输入！");
                flag = false;
            }
            else flag =true;
        }
        getSeasonByNumber(number);
    }
    public static void getSeasonByNumber(int number){
        switch (number){
            case 1:
            case 2:
            case 12:
                System.out.println("当前季节为冬季！");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("当前季节为春季！");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("当前季节为夏季！");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("当前季节为秋季！");
                break;
        }
    }
}
