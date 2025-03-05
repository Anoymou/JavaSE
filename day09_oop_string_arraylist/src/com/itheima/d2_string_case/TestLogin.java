package com.itheima.d2_string_case;

import java.util.Scanner;

public class TestLogin {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String name = sc.nextLine();
            System.out.println("请输入您的密码：");
            String pwd = sc.nextLine();
            if(log(name,pwd)){
                System.out.println("欢迎进入系统！");
                break;
            }
            else {
                System.out.println("你的用户名或密码错误，请重新输入，你还剩余"+(2-i)+"次机会！");
            }
            if(i==2){
                System.out.println("------------------------------------------");
                System.out.println("你当前输入已达到最大次数，请十分钟之后再试！");
            }
        }
    }
    public static boolean log(String name, String pwd){
        return name.equals("itheima") && pwd.equals("123456");
    }
}
