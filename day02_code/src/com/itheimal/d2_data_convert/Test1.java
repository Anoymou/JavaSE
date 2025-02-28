package com.itheimal.d2_data_convert;

public class Test1 {
    public static void main(String[] args) {
        byte b = 127;
        short s = b;
        System.out.println(s);
        int i = s;
        System.out.println(i);
        long l = i;
        System.out.println(l);
        float f = l;
        System.out.println(f);
        double d = f;
        System.out.println(d);
        char c = 'A';
        char c1 = 'a';
        char c2 = '0';
        int i1 =c;
        long i2 =c1;
        float i3 =c2;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);
        float aa = 3.1221212f;
        System.out.println(String.format("%.3f",aa));
    }
}
