package com.itheima.homework;

public class Day03Test3 {
    public static void main(String[] args) {
        int sum =0;
        for (int i =1 ;i<=100;i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
