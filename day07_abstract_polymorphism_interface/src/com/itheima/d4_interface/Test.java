package com.itheima.d4_interface;

import com.itheima.d4_interface.iml.KunKun;

public class Test {
    public static void main(String[] args) {
        KunKun kunkun =new KunKun();
        System.out.println(KunKun.NAME);
        kunkun.sing();
        kunkun.dance();
        kunkun.rap();
        kunkun.playBasketball();
    }
}
