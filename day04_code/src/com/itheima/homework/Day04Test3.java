package com.itheima.homework;

public class Day04Test3 {
    public static void main(String[] args) {
        int [] arr ={100,50,90,60,80,70};
        int min = getArrMin(arr);
        System.out.println(min);
    }
    public static int getArrMin(int [] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
