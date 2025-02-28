package com.itheima.homework.game;

public class Test {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("战士", 1, 100, 50, "长剑");
        Wizard wizard = new Wizard("法师", 1, 80, 100, "火球术");
        Thief thief = new Thief("盗贼", 1, 120, 20, "隐身");

        System.out.println(warrior.getName() + "使用" + warrior.getWeapon() + "攻击");
        warrior.attack();
        warrior.charge();

        System.out.println(wizard.getName() + "使用" + wizard.getSpell() + "攻击");
        wizard.attack();
        wizard.cast();

        System.out.println(thief.getName() + "使用" + thief.getStealth() + "攻击");
        thief.attack();
        thief.sneak();
    }
}
