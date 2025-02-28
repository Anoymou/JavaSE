package com.itheima.d4_random;

import java.util.Random;
import java.util.Scanner;
/*朋友聚会时，经常会玩一个叫猜数字的小游戏，游戏规则是：先让一个人随机想一个1-1OO之间的整数,
然后每个人开始猜，猜大了提示过大，猜小了提示过小，知道猜中结束游戏。
分析:
●1.系统随机生成一个1-100之间的整数
●2.通过控制台输入要猜测的数字，如果猜大了提示猜大了并重新猜测，如果猜小了提示猜小了并重新
猜测，直到猜中了结束游戏
重新猜测需要回到用户输入的位置，可以使用死循环
猜中结束死循环可以使用break跳转关键字。*/
public class Test01 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int number = r.nextInt(100);
//        System.out.println(number);
        while (true) {
            System.out.println("输入猜测的数字");
            int number1 = sc.nextInt();
            if(number1>number){
                System.out.println("猜大了，请重新猜测：");
            } else if (number1<number) {
                System.out.println("猜小了，请重新猜测：");
            } else if (number1 == number) {
                System.out.println("猜对了！游戏结束。");
                break;
            }
        }
    }
}
