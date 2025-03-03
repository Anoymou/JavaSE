package com.itheima;

public class Test {
    public static void main(String args[]) {
        int num[] = new int[5];
        int i = 0;
        int j = 8;// j=8
        try {
            while (i < 6) {
                j = j - 1;
                num[i] = i;
                System.out.print(num[i] + "/" + j + "=");
                System.out.println(num[i] / j);
                i++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界异常");
        } catch (RuntimeException e) {
            System.out.println("运行时异常");
        }
    }
}
