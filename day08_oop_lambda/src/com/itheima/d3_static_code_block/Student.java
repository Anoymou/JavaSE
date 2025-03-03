package com.itheima.d3_static_code_block;

import lombok.Data;

@Data
public class Student {
    public static String name;

    static {
        System.out.println("静态代码块执行！");
        name= "张三";
    }
}
