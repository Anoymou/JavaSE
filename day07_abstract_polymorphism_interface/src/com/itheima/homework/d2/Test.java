package com.itheima.homework.d2;

public class Test {
    public static void main(String[] args) {
        Animal dog =new Dog();
        Animal cat =new Cat();

        dog.eat();
        if(dog instanceof Dog){
            Dog dog1 =(Dog) dog;
            dog1.lookHome();
        }

        System.out.println("-----------------------");

        cat.eat();
        if(cat instanceof Cat){
            Cat cat1 =(Cat) cat;
            cat1.catchMouse();
        }
    }
}
