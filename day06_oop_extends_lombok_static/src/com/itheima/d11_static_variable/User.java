package com.itheima.d11_static_variable;

import lombok.Data;

@Data
public class User {
    private String name;
    private int age;
    public static int onlineCount;

    public User() {
        onlineCount++;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        onlineCount++;
    }
}
