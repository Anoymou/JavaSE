package com.itheima.d4_interface.iml;

import com.itheima.d4_interface.Dance;
import com.itheima.d4_interface.PlayBasketball;
import com.itheima.d4_interface.Rap;
import com.itheima.d4_interface.Sing;

public class KunKun implements Sing, Dance, Rap, PlayBasketball {
    @Override
    public void dance() {
        System.out.println("跳");
    }

    @Override
    public void playBasketball() {
        System.out.println("打篮球");
    }

    @Override
    public void rap() {
        System.out.println("Rap");
    }

    @Override
    public void sing() {
        System.out.println("唱");
    }
}
