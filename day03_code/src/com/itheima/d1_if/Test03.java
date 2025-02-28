package com.itheima.d1_if;

public class Test03 {
    public static void main(String[] args) {
        int score = 20;
        if (score >=90 && score <100) {
            System.out.println("等级为A");
        } else if (score>=80 && score <90) {
            System.out.println("等级为B");
        }else if(score>= 60 && score <80){
            System.out.println("等级为C");
        } else if (score<60) {
            System.out.println("等级为D");
        }
        else {
            System.out.println("你的分数有误。");
        }
    }
}
