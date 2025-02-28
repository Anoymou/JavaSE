package com.itheimal.d2_data_convert;

public class Test6 {
    public static void main(String[] args) {
       /* int a = 10;
        int b = 20;
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b);*/
        double size = 5.9;
        int memery = 16;
        System.out.println(size > 7 && memery <= 32);
        System.out.println(size > 7 || memery <= 32);
        System.out.println(!(size > 7 || memery <= 32));
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(true ^ false);
        System.out.println(true ^ true);

        int a = 10;
        int b = 20;
        System.out.println(a > 15 && ++b > 15);//&&当左边为假时  右边不再执行 &不论左边是否为假 都继续执行右边
        System.out.println(b);//20
        System.out.println(a < 20 | ++b > 20);//||当左边为真时 右边不再执行 |不论左边是否为真 都继续执行右边
        System.out.println(b);

    }
}