package com.itheima.homework.game;

public class Warrior extends Character {

    private String weapon;

    public Warrior() {
    }

    public Warrior(String name, int level, double healthPoints, double manaPoints,String weapon) {
        super(name, level, healthPoints, manaPoints);
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void charge(){
        System.out.println("使用冲锋技能对敌人造成20点伤害");
    }
}
