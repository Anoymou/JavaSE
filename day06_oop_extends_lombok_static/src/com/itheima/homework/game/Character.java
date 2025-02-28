package com.itheima.homework.game;

public class Character {
    private String name;
    private int level;
    private double healthPoints;//健康点
    private double manaPoints;//魔法点

    public Character() {
    }

    public Character(String name, int level, double healthPoints, double manaPoints) {
        this.name = name;
        this.level = level;
        this.healthPoints = healthPoints;
        this.manaPoints = manaPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    public double getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(double manaPoints) {
        this.manaPoints = manaPoints;
    }

    public void attack(){
        System.out.println("使用普通攻击对敌人造成10点伤害");
    }


}
