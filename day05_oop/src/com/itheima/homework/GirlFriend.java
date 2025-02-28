package com.itheima.homework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GirlFriend {
    public String name;
    private double height;
    public double weight;


    /*public  GirlFriend(){
    }

    public GirlFriend(String name,double height,double weight){
        this.name=name;
        this.height=height;
        this.weight=weight;
    }*/

    /*public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight(){
        return height;
    }
    public double getWeight(){
        return weight;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "height=" + height +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }*/
}
