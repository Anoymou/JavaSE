package com.itheimal.homework;

public class Day02Test6 {
    public static void main(String[] args) {
        int count =0;
        for(int i=0;i<3;i++){
            count++;
        }
        System.out.println("当前点赞的人数为："+count);
        System.out.println("当前点赞的人数为："+--count);
    }
}
