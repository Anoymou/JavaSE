package com.itheima.homework;

public class ArrayUtils1 {
    public static String toString(int [] arr){
        if(arr == null || arr.length==0){
            return "[]";
        }
        String result ="[";
        for (int i = 0; i < arr.length; i++) {
            result+=arr[i];
            if(i<arr.length-1){
                result+=",";
            }
        }
        result+="]";
        return result;
    }
    public static double getAverage(double arr []){
        double max =arr[0];
        double min =arr[0];
        double sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(max<arr[i]){
                max=arr[i];
            }
            if(min >arr[i]){
                min = arr[i];
            }
        }
        return (sum-max-min)/(arr.length-2);
    }
}
