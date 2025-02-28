package com.itheima.d12_constants;

public class Test {
    public static void main(String[] args) {
        double radius = 10;
        double area = Constants.PI * Math.pow(radius,2);
        System.out.println(area);

        area = Math.PI * Math.pow(radius,2);
        System.out.println(area);
    }
}
