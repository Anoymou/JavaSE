package com.itheima.homework.game;

import lombok.Data;

@Data
public class Wizard extends Character {

    private String spell;

    public Wizard() {
    }

    public Wizard(String name, int level, double healthPoints, double manaPoints,String spell) {
        super(name, level, healthPoints, manaPoints);
        this.spell =spell;
    }

    public void cast(){
        System.out.println("使用法术对敌人造成30点伤害");
    }
}
