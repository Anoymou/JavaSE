package com.itheima.d5;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Country {
    /*
    * 定义一个Country类，用于描述城市，
            所有的城市都有共性的属性：城市名称、城市人口数量、人均GDP、城市描述，
            共性的行为：获取当前城市所有人口总GDP、展示当前城市的详细信息。
            北京, 中国的首都,人均GDP为: 999.0,总人口为: 3000
    * */

    private String name;
    private long population;
    private double capitaGDP;
    private String desc;

    public void showAllCapitaGDP(){
        System.out.println(name+"的GDP总数为："+(population*capitaGDP));
    }

    public void showDesc(){
        System.out.println(name+"，"+desc+"，人均GDP为："+capitaGDP+"，总人口为:"+population);
    }
}
