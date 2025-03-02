package com.itheima.d1_abstract_case;

public class Test {
    public static void main(String[] args) {
        GoldCard goldCard = new GoldCard("张三",10000);
        SilverCard silverCard = new SilverCard("李四",5000);

        goldCard.pay(300);
        System.out.println("*****************************");
        silverCard.pay(300);
    }
}
