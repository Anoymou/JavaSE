package com.itheima.homework.d3;

public class Computer {
    public void use(UsbService usbService){
        usbService.connect();
        if(usbService instanceof UsbServiceKeyBoardImpl){
            UsbServiceKeyBoardImpl u1 =(UsbServiceKeyBoardImpl) usbService;
            u1.input();
        }
        if(usbService instanceof UsbServiceMouseImpl){
            UsbServiceMouseImpl u2 =(UsbServiceMouseImpl) usbService;
            u2.click();
        }
        usbService.exit();
    }
}
