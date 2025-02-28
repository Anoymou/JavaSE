package com.itheima.homework;

public class Day03Test5 {
    public static void main(String[] args) {
        int count =0;
        for (int i =1000;i<=9999;i++){
            if(((i%10)+(i/1000))==((i/10%10)+(i/100%10))){
                System.out.print(i+"    ");
                count++;
                if (count%5==0){
                    System.out.println();
                }
            }
        }
        System.out.println("以上满足条件的四位数总共有"+count+"个");
    }
}
