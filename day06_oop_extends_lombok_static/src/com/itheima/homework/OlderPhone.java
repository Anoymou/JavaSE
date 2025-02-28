package com.itheima.homework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OlderPhone {
    private String brand;
    private double price;

    public void call(String name){
        System.out.println("打电话给"+name);
    }

    public void sendMessage(String name){
        System.out.println("发短信给"+name);
    }

    public void show(){
        System.out.println("来电号码为xxxxxxxxxxx!");
    }
}
