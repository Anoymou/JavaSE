package com.itheimal.homework;

import java.util.Scanner;

public class Day02Test13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<2;i++){
            System.out.println("请输入4位会员卡号：");
            int number = getTrueInput(sc);
            System.out.println(number);
            System.out.println("会员卡号"+number+"各位之和："+sum(number));
            System.out.println("会员卡号"+number+(sum(number) > 20?"是幸运客户":"不是幸运用户"));
        }
    }
    /**
     *对非数字、不是四位数的输入做出判断
     * */
    public static int getTrueInput(Scanner sc){
        while (true){
            try{
                int input =sc.nextInt();
                if(input>=1000&&input<=9999){
                    return input;
                }
                else {
                System.out.println("请重新输入介于1000~9999之间的数字：");
                }
            }catch (Exception e){
                System.out.println("输入错误，请输入数字：");
                sc.next();
            }
        }
    }
    public static int sum(int number){
        return   number % 10
                +number/10%10
                +number/100%10
                +number/1000%10;
    }
}
