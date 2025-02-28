package com.itheima.d2_while;

public class Test02 {
    public static void main(String[] args) {
        double money = 10000;
        double rate = 0.035;
        double target = 20000;
        int years =0;
        while (money<target){
            money*=(1+rate);
            years++;
        }
        System.out.println(years);
    }
}
