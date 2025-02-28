package com.itheima.homework;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        NewPhone newPhone = new NewPhone();
        // 调用set方法为属性赋值
        newPhone.setBrand("苹果");
        newPhone.setPrice(9800);
        // 调用get方法获取属性值
        System.out.println("手机品牌为:"+newPhone.getBrand()+",价格为:"+newPhone.getPrice());
        // 调用继承过来的方法
        newPhone.call("马保国");
        newPhone.sendMessage("马保国");
        // 调用重写后的方法
        newPhone.show();


        /*int [] arr ={1,2,6,4,5};
        double [] arr1 ={1,2,6,4,5};
        int [] arr2 ={};
        System.out.println(ArrayUtils1.toString(arr));
        System.out.println(ArrayUtils1.getAverage(arr1));
        System.out.println(ArrayUtils1.toString(arr2));*/


        /* int [] arr ={1,2,3};
        System.out.println(Shape.getCircleArea(2));
        System.out.println(Shape.getRectangleArea(2, 2.2));
        System.out.println(Shape.getTriangleArea(10, 3.8));
        System.out.println(Arrays.toString(arr));*/
    }
}
