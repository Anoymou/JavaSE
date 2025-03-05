package com.itheima.d2;

import java.util.Random;

public class Test {
    /*
    * 需求：创建一个长度为5的int数组，随机生成5个范围在[20, 80]之间的随机整数保存到这个数组中，
    *      把数组中所有索引为奇数并且元素为奇数的数据相加求和。
    * */
    public static void main(String[] args) {
        int [] arr =new int[5];
        int sum =0;
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            arr[i]=random.nextInt(61)+20;
            if(i%2!=0&&arr[i]%2!=0){
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}
