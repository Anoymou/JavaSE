package com.itheima.d7_wrapper_class;

import java.sql.DatabaseMetaData;

public class Test {
    public static void main(String[] args) {
        int a =100;
        Integer i = Integer.valueOf(a);
        Integer i1 = a;
        System.out.println(i+"，"+i1);

        double b =3.14;
        Double v = Double.valueOf(b);
        Double v1= b;
        System.out.println(v+"，"+v1);


        String s = "100";
        Integer i2 = Integer.valueOf(s);
        int i3 = Integer.parseInt(s);
        System.out.println(i2+"，"+i3);

        String s1 = "100.0";
        Double v2 = Double.valueOf(s1);
        double v3 = Double.parseDouble(s1);
        System.out.println(v2+"，"+v3);


    }
}
