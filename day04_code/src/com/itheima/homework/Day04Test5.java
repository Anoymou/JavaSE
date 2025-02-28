package com.itheima.homework;

public class Day04Test5 {
    public static void main(String[] args) {
        int arr [] = {100,50,90,60,80,70};
        System.out.println(getArrAverage(arr));
    }
    public static int getArrAverage(int [] arr){
        int max = arr[0];
        int min = arr[0];
        int sum =0;
        int avg=0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }else if(min > arr[i]){
                min = arr[i];
            }
            sum+=arr[i];
        }
        return avg = (sum-min-max)/(arr.length-2);
    }
}
