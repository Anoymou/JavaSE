package com.itheima.homework.game;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Character {
    private String name;
    private int level;
    private double healthPoints;//健康点
    private double manaPoints;//魔法点

    public void attack(){
        System.out.println("使用普通攻击对敌人造成10点伤害");
    }
}
