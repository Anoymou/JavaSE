package com.itheima.d7_static_demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int age;

    public static int max(int a,int b){
        return a>b?a:b;
    }
}
