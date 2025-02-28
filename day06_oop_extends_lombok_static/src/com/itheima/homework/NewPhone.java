package com.itheima.homework;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

//@AllArgsConstructor
@NoArgsConstructor
public class NewPhone extends OlderPhone{

    /*public NewPhone() {
    }

    public NewPhone(String brand, double price) {
        super(brand, price);
    }*/

    @Override
    public void show() {
        super.show();
        System.out.println("这是一张头像图片");
        System.out.println("归属地：xxx市");
    }
}
