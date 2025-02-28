package com.itheima.homework.game;

import lombok.Data;

@Data
public class Thief  extends Character{

    private String stealth;

    public Thief() {
    }

    public Thief(String name, int level, double healthPoints, double manaPoints,String stealth) {
        super(name, level, healthPoints, manaPoints);
        this.stealth =stealth;
    }

    public void sneak(){
        System.out.println("使用潜行技能对敌人造成40点伤害");
    }
}
