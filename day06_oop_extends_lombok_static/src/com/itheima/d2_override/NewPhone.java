package com.itheima.d2_override;

public class NewPhone extends OlderPhone{
    /*
    *  @Override 方法重写注解 可以用来标识这个方法时重写方法
    * 也可以检验重写是否正确
    * 子类可以重写父类方法来实现一些新功能
    * 同时通过super关键字来调用父类方法保证旧功能
    * */
    @Override
    public void call() {
        super.call();
        System.out.println("我还能视频通话！");
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
        System.out.println("我还能发图片和视频！");
    }
}
