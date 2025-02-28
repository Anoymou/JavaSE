package com.itheima.d2_array;

import java.util.Arrays;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        int [] age = new int [20];
        double [] arr = new double[10];
        boolean [] arrbool = new boolean[10];
        String [] arr1 = new String[10];
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            age[i] = r.nextInt(13)+18;
        }
        for (int j = 0; j < 10; j++) {
            arr[j]=j;
        }
        arrbool[1] = true;
        arr1[0]="我是字符串数组！";
        System.out.println(Arrays.toString(age));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arrbool));
    }
}
