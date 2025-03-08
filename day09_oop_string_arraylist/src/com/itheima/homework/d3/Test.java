package com.itheima.homework.d3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        Coder coder1 = new Coder("王宝强", 25, "打篮球");
        Coder coder2 = new Coder("汪峰", 35, "游泳");
        Coder coder3 = new Coder("蔡明", 19, "演小品");
        Coder coder4 = new Coder("姚明", 18, "击剑");

        List<Coder> list =new ArrayList<>();
        list.add(coder1);
        list.add(coder2);
        list.add(coder3);
        list.add(coder4);

//        System.out.println(list);

        list.forEach(coder -> {
            if(coder.getAge()>30){
                coder.setLike("打保龄球");
            }
            else {
                System.out.println(coder.getName()+"-----"+coder.getAge()+"-----"+coder.getLike());
            }
        });
    }
}
