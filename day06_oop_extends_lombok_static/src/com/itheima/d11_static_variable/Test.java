package com.itheima.d11_static_variable;

public class Test {
    public static void main(String[] args) {
        User u1 =new User("张三",18);
        User u2 =new User("李四",19);
        User u3 =new User("王五",20);

        System.out.println(User.onlineCount);


    }
}
