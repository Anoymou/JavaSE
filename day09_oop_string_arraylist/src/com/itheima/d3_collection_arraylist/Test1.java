package com.itheima.d3_collection_arraylist;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("蔡徐坤");
        list.add("唱歌");
        list.add("跳舞");
        list.add("打篮球");
        list.add("蔡徐坤");

        System.out.println(list);
        list.add(1,"爱");
        System.out.println(list);

        System.out.println(list.remove(5));
        System.out.println(list);

        System.out.println(list.set(4, "rap打篮球"));
        System.out.println(list);

        System.out.println(list.get(0));

        System.out.println(list.subList(1, list.size() - 1));
        System.out.println(list);
    }
}
