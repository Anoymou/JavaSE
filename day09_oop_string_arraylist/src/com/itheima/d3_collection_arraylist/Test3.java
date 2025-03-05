package com.itheima.d3_collection_arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Test3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("蔡徐坤");
        list.add("唱歌");
        list.add("跳舞");
        list.add("打篮球");
        list.add("蔡徐坤");
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("------------------------------");

        list.forEach(s-> System.out.println(s));

        System.out.println("*********************************");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
