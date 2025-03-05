package com.itheima.d1_string;

public class TestStringMethod {
    public static void main(String[] args) {
        String s1 = "hello你好";
        System.out.println(s1.length());//获取字符串长度

        System.out.println(s1.charAt(2));//获取字符串指定索引位置的字符

        String s2 = "HELLO你好";

        System.out.println(s1.equals(s2));//false  比较两个字符串的内容是否相同
        System.out.println(s1.equalsIgnoreCase(s2));//true   忽略大小写比较两个字符串的内容是否相同

        System.out.println(s1.contains("你好"));//true 判断字符串是否包含子串
        System.out.println(s1.contains("e你好"));//false

        System.out.println(s1.startsWith("he"));//true 判断是否是以某个字符串开头
        System.out.println(s1.startsWith("el"));//false
        System.out.println(s1.startsWith("hello你好"));//true

        System.out.println(s1.endsWith("你好"));//true 判断是否是以某个字符串结尾

        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        System.out.println(s1.replace("ll", "oo"));



    }
}
