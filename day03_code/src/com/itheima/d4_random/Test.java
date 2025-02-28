package com.itheima.d4_random;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
//            int n = r.nextInt(10);
            int n = r.nextInt(10)+66;
            System.out.println(n);
        }
    }
}
