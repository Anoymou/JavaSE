package com.itheima.d3;

import java.util.Random;

public class Test {
    /*
    * 需求： 创建一个长度为5的int数组, 随机生成5个范围在[66,99]之间的随机整数保存到这个数组中,
    *       保证该数组中存储的元素不重复, 最后求数组中所有数据的和,并且把和输出到控制台
    * */
    public static void main(String[] args) {
        int [] arr = new int[5];
        int sum =0;
        int i=0;
        Random random =new Random();
        while (i<5){
            int number=random.nextInt(34)+66;
            if(!contains(arr,number)){
                arr[i]=number;
                i++;
            }
        }
        for (int num : arr) {
//            System.out.println(num);
            sum+=num;
        }
        System.out.println(sum);
    }
    public static boolean contains(int [] arr,int number){
        for (int i : arr) {
            if(i==number){
               return true;
            }
        }
        return false;
    }
}
