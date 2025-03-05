package com.itheima.d3_collection_arraylist;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("蔡徐坤");
        list.add("唱歌");
        list.add("跳舞");
        list.add("打篮球");
        list.add("蔡徐坤");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (String a:list){
            System.out.println(a);
        }
    }
}
