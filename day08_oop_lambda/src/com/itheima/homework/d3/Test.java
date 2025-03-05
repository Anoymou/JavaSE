package com.itheima.homework.d3;

import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        MessagePrinter.printMessage(new Message() {
            @Override
            public String getMessage() {
                return "Hello,word";
            }
        });
        String s1 = "hello";
        System.out.println(s1.length());//字符串长度
        System.out.println(s1.contains("ll"));//是否包含子串
        System.out.println(s1.indexOf("l"));//返回字符在字符串中第一出现的位置索引
        System.out.println(s1.lastIndexOf("l"));//返回字符在字符串中最后出现的位置索引
        System.out.println(s1.startsWith("he"));//判断是够是否是以某某子串开头的字符串
        System.out.println(s1.endsWith("lo"));//判断是否是以某某子串结尾的字符串
        System.out.println(s1.substring(0));//截取子串，从传入索引位置开始，截取长度默认最大为字符串长度
        System.out.println(s1.substring(2, 5));//截取子串，从传入索引位置开始，可指定长度，如果长度不够，默认以字符串最大长度为准
        System.out.println("  \tHello\r\n ".trim());//移除收尾空白字符，空白字符包括空格，\t，\r，\n：
        System.out.println("".isEmpty());
        System.out.println("  ".isEmpty());//判断字符串是否为空
        System.out.println("  \n".isBlank());
        System.out.println("  Hello ".isBlank());//判断字符串是否为空白字符串
//        System.out.println(s1.replace("l", "s"));
        System.out.println(s1.charAt(1));
    }
}
