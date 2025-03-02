package com.itheima.homework.d3;

public class UsbServiceKeyBoardImpl implements UsbService{
    @Override
    public void connect() {
        System.out.println("连接上了键盘....");
    }

    @Override
    public void exit() {
        System.out.println("退出了键盘....");
    }
    public void input(){
        System.out.println("使用了键盘输入了 HelloWolrd");
    }
}
