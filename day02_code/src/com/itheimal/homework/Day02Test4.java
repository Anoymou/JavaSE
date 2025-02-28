package com.itheimal.homework;

public class Day02Test4 {
    public static void main(String[] args) {
        byte b1 =10;
        byte b2 =20;
        int i1 = b1 + b2;
        byte b3 = 10;
        char c1 = 'a';
        float f1 = 5.2f;
        double d1 = 10;
        double sum = b3 + c1 + f1 + d1;
        System.out.println(
                i1+"\n"
                +String.format("%.1f",sum));
    }
}
