package com.itheimal.d1_data_type;

public class Test1 {
    public static void main(String[] args) {
        byte b = 127;//-128~127
        short sh =128;//短整型占2个字节 数据范围大概在-三万两千多到正的三万两千多
//        short a = 35000;
        int i = 35000;//整型占4个字节 十位数
//        int i2 = 2200000000;
        long l = 2200000000L;//长整形 占8字节
        float f = 3.14f;//占四字节
        double d = 3.14;//占八字节
        char c = 'c';//占一字节
        char c1 = 3001;
        System.out.println(c1);//ஹ
        boolean b1 = true;
        System.out.println(b1);
        System.out.println(!b1);
        /*
        * AS 表 48 0 65 A 97 a
        * */
    }
}
