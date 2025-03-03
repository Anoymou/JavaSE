package com.itheima.homework.d4;

public class Test {
    public static void main(String[] args) {

        //main方法内部调用fun方法,传递匿名内部类对象
        fun(new JumpAble() {
            @Override
            public void jump() {
                System.out.println("坤坤跳");
            }
        });

        //main方法内部调用fun方法,传递lambda表达式标准格式
        fun(() ->{System.out.println("坤坤跳1");});

        //main方法内部调用fun方法,传递lambda表达式简化格式
        fun(() -> System.out.println("坤坤跳2"));

    }

    //内部定义静态方法fun,参数类型JumpAble

    public static void fun(JumpAble jumpAble){

        //fun方法内部调用JumpAble接口的抽象方法jump
        jumpAble.jump();

    }
}
