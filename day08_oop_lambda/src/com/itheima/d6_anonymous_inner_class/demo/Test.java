package com.itheima.d6_anonymous_inner_class.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntUnaryOperator;

public class Test {
    public static void main(String[] args) {
        int [] arr ={1,2,4,7,3,9,6,8};
        //匿名内部类的用处，可以在调用api需要传入接口对象时代替实参类简化操作

//        setAll
        Arrays.setAll(arr, new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return arr[operand] *2;
            }
        });

        System.out.println(Arrays.toString(arr));

//        sort
        Integer [] brr ={1,2,4,7,3,9,6,8};
        Arrays.sort(brr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                return 0; //不做修改
//                return o1 -o2;//前面-后面  正序排序
                return o2-o1;//后面减前面 倒序排序
            }
        });
        System.out.println(Arrays.toString(brr));

        System.out.println(68%5);
    }
}
