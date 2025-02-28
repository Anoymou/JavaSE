package com.itheima.d2_array;

import java.util.Arrays;

public class TestCase2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        /*for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]);
        }*/
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reverseArr(arr)));
        System.out.println(Arrays.toString(arr));
    }
    public static int [] reverseArr(int [] arr){
        /*int [] reverseArr = new int[arr.length];
        int j=0;
        for (int i = arr.length-1; i >= 0; i--) {
            reverseArr[j++] = arr[i];
        }
        return reverseArr;*/
        for (int i = 0,j=arr.length-1; i <j ; i++,j--) {
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        return arr;
    }
}
