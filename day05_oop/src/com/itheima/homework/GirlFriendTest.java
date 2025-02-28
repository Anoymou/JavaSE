package com.itheima.homework;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf = new GirlFriend();
        GirlFriend gf1 =new GirlFriend("迪丽热巴",175.0,90.0);
        gf.setName("凤姐");
        gf.setHeight(155);
        gf.setWeight(130);
        System.out.println(
                "我是"+gf.getName()+"，身高"
                +gf.getHeight()+"厘米"
                +"，体重"+gf.weight+"斤");
        System.out.println(
                "我是"+gf1.getName()+"，身高"
                 +gf1.getHeight()+"厘米"
                 +"，体重"+gf1.weight+"斤");
//        System.out.println(gf);
    }
}

