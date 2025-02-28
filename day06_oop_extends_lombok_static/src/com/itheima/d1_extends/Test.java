package com.itheima.d1_extends;

import java.awt.*;

public class Test {
    public static void main(String[] args) {
      /*  Student stu = new Student();
        stu.showAge();*/


        Dog dog =new Dog();
        /*Anaimal anaimal = new Dog();
        anaimal.eat();*/
        dog.open();

      /*  System.out.println(dog.toString());
        System.out.println(dog);*/
    }
}
class Anaimal{

    public void eat(){
        System.out.println("动物能吃饭！");
    }
}

class Pet extends Anaimal{
    public String color = "黑色";
}

class Dog extends Pet{
    private String color ="白色";


    @Override
    public void eat(){
        System.out.println("狗狗吃骨头！");
    }

    public void open(){
        System.out.print(this.color+"的");
        this.eat();
        System.out.print(super.color+"的");
        super.eat();
    }
}