package com.itheima.homework;

public class Day04Test4 {
    public static void main(String[] args) {
        int [] arr ={100,50,90,60,80,70};
        int max = getArrMax(arr);
        System.out.println(max);
    }
    public static int getArrMax(int [] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
