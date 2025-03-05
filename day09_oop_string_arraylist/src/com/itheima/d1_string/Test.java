package com.itheima.d1_string;

public class Test {
    public static void main(String[] args) {
        String s1 = new String();
        String s2 = new String("你好");
        char [] chars ={'a','b','c'};
        String s3 = new String(chars);
        String s4 = new String(chars, 0, 2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
