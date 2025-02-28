package com.itheimal.d2_data_convert;

public class Test2 {
    public static void main(String[] args) {
        byte b = 127;
        short s = 10;
        int i = 11;
        long l = 20L;
        float f = 3.14f;
        double d = 3.14;
        char c = 'c';
        int i1 = b + s;
        int i2 = s + i;
        long l1 = i + l;
        double v = f + d;
        double v1 = d + c;
        double v2 = b + s + i + l + f + d + c;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(l1);
        System.out.println(String.format("%.2f",v));
        System.out.println(String.format("%.2f",v1));
        System.out.println(String.format("%.2f",v2));
    }
}
