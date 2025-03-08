package com.itheima.homework.d2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        System.out.println("小写转大写："+myToUpperCase(str));
        System.out.println("大写转小写："+myToLowerCase(str));
    }

    public static String myToUpperCase(String str){
        String str1 ="";
        for (int i = 0; i <str.length() ; i++) {
            char c = str.charAt(i);
            if(c>='a' && c<='z'){
                c = (char) (c- 32);
            }
            str1+=c;
        }
        return str1;
    }

    public static String myToLowerCase(String str){
        String str1 ="";
        for (int i = 0; i <str.length() ; i++) {
            char c = str.charAt(i);
            if(c>='A' && c<='Z'){
                c = (char) (c+32);
            }
            str1+=c;
        }
        return str1;
    }
}
