package com.itheima.homework.d3;

public class Test {
    public static void main(String[] args) {
        UsbService usbServiceKeyBoard = new UsbServiceKeyBoardImpl();
        UsbService usbServiceMouse = new UsbServiceMouseImpl();

        Computer computer =new Computer();

        computer.use(usbServiceKeyBoard);
        System.out.println("-------------------------");
        computer.use(usbServiceMouse);
    }
}
