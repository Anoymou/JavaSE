package com.itheima.d4_static_inner_class;

import lombok.Data;
@Data
public class OutClass {
    private String sex;
    public static int age;
    @Data
    public static class InnerClass{
        private String name;

        public void run(){
            System.out.println("跑");
//            System.out.println(sex);
            System.out.println(age);
        }
    }
}
