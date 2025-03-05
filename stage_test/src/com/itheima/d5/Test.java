package com.itheima.d5;

public class Test {
    /*
    *
    * 需求：
            定义一个Country类，用于描述城市，
            所有的城市都有共性的属性：城市名称、城市人口数量、人均GDP、城市描述，
            共性的行为：获取当前城市所有人口总GDP、展示当前城市的详细信息。
            定义一个Test类，提供main方法
            在main方法中分别创建两个Country对象用于封装北京和西安这两个城市的数据，
            并调用对象的获取城市所有人口总GDP以及展示城市详细信息的方法，完成测试。具体运行结果如下：
            北京GDP总数为: 2997000.0
            北京, 中国的首都,人均GDP为: 999.0,总人口为: 3000
            =====================
            西安GDP总数为: 555000.0
            西安, 网红城市,人均GDP为: 555.0,总人口为: 1000
            说明：对象封装的数据不要求一致，只要语法正确，正常运行即可！
    * */

    public static void main(String[] args) {
        Country country1 = new Country("北京", 3000, 999.0,"中国的首都");
        Country country2 = new Country("西安", 1000, 555.0, "网红城市");
        country1.showAllCapitaGDP();
        country1.showDesc();
        System.out.println("============================");
        country2.showAllCapitaGDP();
        country2.showDesc();
    }
}