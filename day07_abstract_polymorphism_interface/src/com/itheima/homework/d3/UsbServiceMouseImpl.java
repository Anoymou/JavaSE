package com.itheima.homework.d3;

public class UsbServiceMouseImpl implements UsbService{
    @Override
    public void connect() {
        System.out.println("连接上了鼠标....");
    }

    @Override
    public void exit() {
        System.out.println("拔出了鼠标....");
    }
    public void click(){
        System.out.println("使用了鼠标点击桌面..");
    }
}
