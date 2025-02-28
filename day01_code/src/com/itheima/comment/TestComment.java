package com.itheima.comment;


/**
 * 这是一个文档注释
 * @author zmm
 * @version 1.1
 * */
public class TestComment {
    public static void main(String[] args) {
        //这是一个单行注释

        System.out.println("Hello World!");
        /*
        * 这是一个多行注释
        *
        * */
        int a=1,b=2;
        System.out.println(add(a,b));
    }

    /**
     *
     * @param a 第一个整数
     * @param b 第二个整数
     * @return a+b 返回两个数的和
     */
    public static int add(int a, int b){
        return a+b;
    }
}
