package com.itheima.homework;

public class Shape {
    public static final double PI = 3.1415926535;

    public static double getCircleArea(double r){
        return PI*r*r;
    }

    public static double getRectangleArea(double length,double weight){
        return length*weight;
    }

    public static double getTriangleArea(double base,double height){
        return 0.5*base*height;
    }
}
