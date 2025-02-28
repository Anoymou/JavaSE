package com.itheima.d1_if;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println("请输入m,n的值");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i =0;i<m;i++){

        }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i =0;i<n;i++){
            nums1[i+m]=nums2[i];
        }
        Arrays.sort(nums2);
    }
}
