package com.itheima.d2_array;

public class TestCase {
    //设计一个方法，可以接收一个整型数组作为参数，方法内部计算并返回数组中的最大值。
    public static void main(String[] args) {
        int [] arr ={100,89,22,32,54,32,43,53,23,};
        System.out.println(maxGetArr(arr));
    }
    public static int maxGetArr(int [] arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
