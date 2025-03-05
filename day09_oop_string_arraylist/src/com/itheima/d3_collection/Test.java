package com.itheima.d3_collection;

import java.util.Collection;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        Collection<String> linklist = new LinkedList<>();
        linklist.add("蔡徐坤");
        linklist.add("唱歌");
        linklist.add("跳舞");
        linklist.add("打篮球");
        linklist.add("蔡徐坤");

        System.out.println(linklist);
        System.out.println(linklist.size());//4

        System.out.println(linklist.contains("蔡徐坤"));//true
        System.out.println(linklist.contains("ikun"));//false

        linklist.remove("蔡徐坤");

        System.out.println(linklist);
        linklist.clear();

        System.out.println(linklist.isEmpty());//true
    }
}