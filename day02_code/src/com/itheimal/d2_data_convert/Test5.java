package com.itheimal.d2_data_convert;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入a:");
        int a = sc.nextInt();
        System.out.println("请输入b:");
        int b = sc.nextInt();
        System.out.println("请输入b:");
        int c = sc.nextInt();
        //三目运算符 ？前为逻辑判别式 为真则输出a 为假则输出b
//        int max = (a>b) ?a:b;
        int max = a>b?a>c?a:c:b>c?b:c;
        System.out.println(max);
    }
    /*public static void main(String[] args) {
        int count = 10;
        *//*
        * ++--运算符 是对变量自增自减 放在变量前面的时候 先执行自增自减操作 反之 后执行自增自减操作
        * *//*
       *//* System.out.println(count++);
        System.out.println(++count);*//*
        System.out.println(count--);
        System.out.println(--count);
    }*/
    /*public static void main(String[] args) {
        int a = 10;
        a+=10;
        System.out.println(a);

        byte c =12;
        byte d =3;
//        c+=d;
        c=(byte)(c+d);//不等价于 c=c+d 自带强制转换
        System.out.println(c);

        String str ="love";
        str += 520;//+=可以拼接字符串
        System.out.println(str);

    }*/
}
